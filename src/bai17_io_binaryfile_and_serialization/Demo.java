package bai17_io_binaryfile_and_serialization;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Demo {
    public static void main(String[] args) throws IOException {
        //Tạo file
       /* try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }*/


//Nhập từng kí tự từ bàn phím và hiển thị kết quả ra màn hình
            InputStream is = System.in;
            while (true) {
                System.out.print("Nhập 1 ký tự: ");
                int ch = is.read();
                if (ch == 'q') {
                    System.out.println("Finished!");
                    break;
                }
                is.skip(2); // Loại bỏ 2 ký tự \r và \n
                System.out.println("Ký tự nhận được: " + (char) ch);
            }



        }
    }


