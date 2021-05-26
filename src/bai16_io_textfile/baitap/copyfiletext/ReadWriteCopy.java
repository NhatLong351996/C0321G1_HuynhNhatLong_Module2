package bai16_io_textfile.baitap.copyfiletext;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteCopy {
    public List<String> readFile(String path) throws IOException {
        List<String> list = new ArrayList<>();
        try {
            File file = new File(path);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line="";
            while ((line= bufferedReader.readLine())!=null){
                list.add(line);
            }
        }catch (Exception e){
            System.err.println("File không tồn tại hoặc bị lỗi!");
        }
        return list;
    }

    public void writeFile(String path,List<String> list) throws IOException {
        try {
            File file = new File(path);
            if (file.exists()){
                throw new FileAlreadyExistsException("File đã tồn tại!");
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (String string: list){
                bufferedWriter.write(string+"\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
