package bai16_io_textfile.baitap.docfilecsv;

import java.io.*;

public class ReadCSV {
    public void readFile(String path) throws IOException {
        try {
            File file = new File(path);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line ="";
            while ((line=bufferedReader.readLine())!=null){
                String[] strings= line.split(",");
                Country country = new Country(Integer.parseInt(strings[0]),strings[1],strings[2]);
                System.out.println(country.toString());
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
