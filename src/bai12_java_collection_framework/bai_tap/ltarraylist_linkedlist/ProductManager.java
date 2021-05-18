package bai12_java_collection_framework.bai_tap.ltarraylist_linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
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
                    boolean check;
                    int id = 3;
                    String nameNewProduct;
                    do {
                        check = true;
                        System.out.println("Mời nhập tên sản phẩm mới:\n");
                        nameNewProduct = scanner.next();
                        for (Product product : productList) {
                            if (nameNewProduct == product.getNameProduct()) {
                                System.out.println("Tên bị trùng, mời nhập lại!");
                                check = false;
                                break;
                            }
                        }
                    } while (!check);
                    id++;
                    System.out.println("Giá sản phẩm: ");
                    int price = scanner.nextInt();
                    productList.add(new Product(id, nameNewProduct, price));
                    for (Object product : productList) {
                        System.out.println(product.toString());
                    }
                    break;
                case 2:
                    for (Object product1 : productList) {
                        System.out.println(product1.toString());
                    }
                    System.out.println("Nhập id cần sửa:");
                    int id1 = scanner.nextInt();
                    boolean check1;
                    String nameNewProduct1;
                    do {
                        check1 = true;
                        System.out.println("Sửa tên sản phẩm:");
                        nameNewProduct1 = scanner.next();
                        for (Product product2 : productList) {
                            if (nameNewProduct1 == product2.getNameProduct()) {
                                System.out.println("Tên bị trùng, mời nhập lại!");
                                check1 = false;
                                break;
                            }
                        }
                    } while (!check1);
                    System.out.println("Nhập giá của: " + nameNewProduct1);
                    int price1 = scanner.nextInt();
                    productList.remove(id1 - 1);
                    productList.add(id1 - 1, new Product(id1, nameNewProduct1, price1));
                    for (Object product3 : productList) {
                        System.out.println(product3.toString());
                    }
                    break;
                case 3:
                    for (Object product1 : productList) {
                        System.out.println(product1.toString());
                    }
                    System.out.println("Nhập id cần xóa:");
                    int id3 = scanner.nextInt();
                    productList.remove(id3 - 1);
                    System.out.println("Sau khi xóa: ");
                    for (Object product1 : productList) {
                        System.out.println(product1.toString());
                    }
                    break;
                case 4:
                    for (Product product1 : productList) {
                        System.out.println(product1.toString());
                    }
                    break;
                case 5:
                    boolean check3;
                    do {
                        check3 = true;
                        System.out.println("Nhập tên sản phẩm tìm kiếm: ");
                        String nameProduct = scanner.nextLine();
                        for (Product product : productList) {
                            if (nameProduct == product.getNameProduct()) {
                                System.out.println(product.toString());
                                check3 = false;
                                break;
                            }
                        }
                        if (check3) {
                            System.out.println("Không có tên sản phẩm này.");
                        }
                    } while (check3);
                    break;
                case 6:
                    boolean check4;
                    do {
                        check4 = true;
                        System.out.println("Bạn muốn xếp tăng dần hay giảm dần theo giá:\n"
                                + "1. Tăng dần\n"
                                + "2. Giảm dần\n");
                        int select1 = scanner.nextInt();
                        if (select1 == 1) {
                            Collections.sort(productList, new PriceComparator());
                            check4 = false;
                        } else if (select1 == 2) {
                            Collections.sort(productList, new PriceComparatorDecre());
                            check4 = false;
                        } else {
                            System.out.println("Mời nhập lại");
                        }
                    } while (!check4);
                    break;
                case 7:
                    System.exit(0);
            }

        } while (true);
    }
}