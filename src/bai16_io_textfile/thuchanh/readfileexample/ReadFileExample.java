package bai16_io_textfile.thuchanh.readfileexample;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath) throws IOException {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            int sum = 0;
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("Tổng: " + sum);
        } catch (Exception e) {
            System.err.println("File không tồn tại hoặc nội dung có lỗi");
        }

    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường dẫn file: ");
        String path = scanner.nextLine();
        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);

    }
}
