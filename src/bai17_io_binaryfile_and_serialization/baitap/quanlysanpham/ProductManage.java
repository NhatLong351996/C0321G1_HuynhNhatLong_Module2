package bai17_io_binaryfile_and_serialization.baitap.quanlysanpham;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManage {
    public static void addProduct(String pathwrite) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id: ");
        int id = scanner.nextInt();
        System.out.println("Enter product's name: ");
        String name = scanner.nextLine();
        System.out.println("Enter manufacturer: ");
        String manufacturor = scanner.nextLine();
        System.out.println("Enter product's price: ");
        int price = scanner.nextInt();
        System.out.println("Enter note: ");
        String note = scanner.nextLine();
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(pathwrite));
            oos.writeObject(new Product(id, name, manufacturor, price, note));
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readProductFile(String pathRead) {
        List<Product> productList = new ArrayList<>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(pathRead));
            productList = (List<Product>) ois.readObject();
            for (Product product : productList) {
                System.out.println(product + "\n");
            }
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productList;
    }

    public static void searchProduct(String path) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product's name: ");
        String nameProduct = scanner.nextLine();
        List<Product> listProduct = readProductFile(path);
        boolean check = true;
        for (Product product : listProduct) {
            if (nameProduct.equals(product.getName())) {
                System.out.println(product.toString());
                check = false;
                break;
            }
        }
        if (check) {
            System.err.println("Không tìm thấy sản phẩm");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Quản lý sản phẩm IO:\n" +
                    "1. Thêm sản phẩm\n" +
                    "2. Hiển thị danh sách sản phẩm\n" +
                    "3. Tìm kiếm thông tin sản phẩm\n" +
                    "4. Thoát chương trình");
            int select = scanner.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Nhập fileObject để ghi vào: ");
                    String pathwrite = scanner.nextLine();
                    addProduct(pathwrite);
                    break;
                case 2:
                    System.out.println("Nhập file Object để hiển thị: ");
                    String pathRead = scanner.nextLine();
                    readProductFile(pathRead);
                    break;
                case 3:
                    System.out.println("Nhập fileObject để tìm kiếm: ");
                    String path = scanner.nextLine();
                    searchProduct(path);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Không có trong menu.");
            }
        } while (true);
    }
}
