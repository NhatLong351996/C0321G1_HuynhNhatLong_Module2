package Commons;

import Models.Services;
import Models.Villa;

import javax.xml.ws.Service;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<String> readCSV(String filepath) {
        List<String> list = new ArrayList<>();
        try {
            File file = new File(filepath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void writeCSV(String path, List<Services> list) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true));
            for (Services string : list) {
                bufferedWriter.write(string.toString() + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
