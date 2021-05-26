package bai16_io_textfile.baitap.copyfiletext;

import java.io.IOException;
import java.util.List;

public class TestMainCopy {
    public static void main(String[] args) throws IOException {
        ReadWriteCopy readWriteCopy = new ReadWriteCopy();
        List<String> list = readWriteCopy.readFile("source_file");
        readWriteCopy.writeFile("target_file.txt",list);
    }
}
