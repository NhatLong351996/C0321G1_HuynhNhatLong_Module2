package bai12_java_collection_framework.bai_tap.ltarraylist_linkedlist;

import java.util.*;

public class ProductManager {
    public static Scanner scanner = new Scanner(System.in);
    private static boolean check;
    private static int id = 3;
    private static int price;
    private static String nameProduct;

    public static void add(List<Product> productList) {
        do {
            System.out.println("Nhập tên sản phẩm: ");
            nameProduct = scanner.nextLine();
            check = true;
            for (Product product : productList) {
                if (nameProduct.equals(product.getNameProduct())) {
                    System.out.println("Tên sản phẩm đã có trong danh sách, mời nhập lại!");
                    check = false;
                    break;
                }
            }
        } while (!check);
        id++;
        System.out.println("Giá sản phẩm:");
        price = scanner.nextInt();
        productList.add(new Product(id, nameProduct, price));
        System.out.println("Bạn vừa thêm sản phẩm vào danh sách: " + new Product(id, nameProduct, price).toString());
    }

    public static void edit(List<Product> productList) {
        for (Product product : productList) {
            System.out.println(product.toString());
        }
        System.out.println("Nhập id cần sửa: ");
        id = scanner.nextInt();
        do {
            System.out.println("Sửa tên sản phẩm: ");
            nameProduct = scanner.next();
            check = true;
            for (Product product : productList) {
                if (nameProduct.equals(product.getNameProduct())) {
                    System.out.println("Tên sản phẩm đã có trong danh sách, mời nhập lại!");
                    check = false;
                    break;
                }
            }
        } while (!check);
        System.out.println("Nhập giá sản phẩm sửa: ");
        price = scanner.nextInt();
        productList.remove(id - 1);
        productList.add(id - 1, new Product(id, nameProduct, price));
        System.out.println("Bạn vừa thêm sản phẩm: " + new Product(id, nameProduct, price).toString());
    }

    public static void delete(List<Product> productList) {
        System.out.println("Nhập id sản phẩm cần xóa: ");
        id = scanner.nextInt();
        System.out.println("Đã xóa " + productList.get(id - 1));
        productList.remove(id - 1);
    }

    public static void show(List<Product> productList) {
        for (Product product : productList) {
            System.out.println(product.toString());
        }
    }

    public static void find(List<Product> productList) {
        do {
            System.out.println("Nhập sản phẩm cần tìm kiếm: ");
            nameProduct = scanner.next();
            check = true;
            for (Product product : productList) {
                if (nameProduct.equals(product.getNameProduct())) {
                    System.out.println(product.toString());
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println("Không tìm thấy!");
            }
        } while (check);
    }

    public static void sort(List<Product> productList) {
        do {
            System.out.println("Bạn muốn xếp tăng dần hay giảm dần theo giá:\n"
                    + "1. Tăng dần\n"
                    + "2. Giảm dần\n");
            int select = scanner.nextInt();
            check = true;
            if (select == 1) {
                Collections.sort(productList, new PriceComparator());
                for (Product product : productList) {
                    System.out.println(product.toString());
                }
            } else if (select == 2) {
                Collections.sort(productList, new PriceComparatorDecre());
                for (Product product : productList) {
                    System.out.println(product.toString());
                }
            } else {
                System.out.println("Mời nhập lại!");
                check = false;
            }
        } while (!check);
        System.out.println("Đã sắp xếp!");
    }

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Toan", 67));
        productList.add(new Product(2, "Van", 50));
        productList.add(new Product(3, "Anh", 65));
        do {
            System.out.println("Quản lý sản phẩm\n"
                    + "1.Thêm sản phẩm \n"
                    + "2.Sửa thông tin sản phẩm theo id \n"
                    + "3.Xoá sản phẩm theo id \n"
                    + "4.Hiển thị danh sách sản phẩm \n"
                    + "5.Tìm kiếm sản phẩm theo tên \n"
                    + "6.Sắp xếp sản phẩm tăng dần, giảm dần theo giá \n"
                    + "7.Thoát chương trình \n");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Mời chọn: ");
            int select = scanner.nextInt();
            switch (select) {
                case 1:
                    add(productList);
                    break;
                case 2:
                    edit(productList);
                    break;
                case 3:
                    delete(productList);
                    break;
                case 4:
                    show(productList);
                    break;
                case 5:
                    find(productList);
                    break;
                case 6:
                    sort(productList);
                    break;
                case 7:
                    System.exit(0);
            }
        } while (true);
    }
}