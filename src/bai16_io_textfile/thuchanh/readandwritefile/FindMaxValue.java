package bai16_io_textfile.thuchanh.readandwritefile;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập link file đọc: ");
        String readFile = scanner.nextLine();
        System.out.println("Nhập link file viết: ");
        String writeFile = scanner.nextLine();
        List<Integer> numbers = readAndWriteFile.readfile(readFile);
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile(writeFile, maxValue);
    }
}
