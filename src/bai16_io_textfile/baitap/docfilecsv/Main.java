package bai16_io_textfile.baitap.docfilecsv;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ReadCSV readCSV = new ReadCSV();
        readCSV.readFile("country");
    }
}
