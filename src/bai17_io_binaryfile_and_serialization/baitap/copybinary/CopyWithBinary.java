package bai17_io_binaryfile_and_serialization.baitap.copybinary;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class CopyWithBinary {
    public static void copy(String source, String target){
        try {
            File file = new File(target);
            if (file.exists()){
                throw new FileAlreadyExistsException("File đã tồn tại!");
            }
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(target));
            int i;
            while ((i = bis.read())!=-1){
                bos.write(i);
            }
            System.out.println("Done!");
            bis.close();
            bos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập file nguồn: ");
        String pathSource = scanner.nextLine();
        System.out.println("Nhập file truyền đến: ");
        String pathTarget = scanner.nextLine();
        copy(pathSource,pathTarget);
    }
}
