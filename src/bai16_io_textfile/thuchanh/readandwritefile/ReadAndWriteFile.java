package bai16_io_textfile.thuchanh.readandwritefile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readfile(String filePath) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.err.println("File không tồn tại hoặc nội dung có lỗi!");
        }
        return numbers;
    }

    public void writeFile(String filePath, int max) throws IOException {
        try {
            /* FileWriter writer = new FileWriter(filePath,true);*/
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
            bufferedWriter.write("Giá trị lớn nhất là: " + max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
