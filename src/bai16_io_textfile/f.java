package bai16_io_textfile;

import java.io.CharArrayReader;
import java.io.IOException;

public class f {
    public static void main(String[] args)
    {
       /* String obj  = "abcdef";
        int length = obj.length();
        char c[] = new char[length];
        obj.getChars(0, length, c, 0);
        CharArrayReader input1 = new CharArrayReader(c);
        CharArrayReader input2 = new CharArrayReader(c, 0, 3);
        int i;
        try
        {
            while((i = input2.read()) != -1)
            {
                System.out.print((char)i);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }*/

        String obj  = "abcdefgh";
        int length = obj.length();
        char c[] = new char[length];
        obj.getChars(0, length, c, 0);
        CharArrayReader input1 = new CharArrayReader(c);
        CharArrayReader input2 = new CharArrayReader(c, 1, 4);
        int i;
        int j;
        try
        {
            while((i = input1.read()) == (j = input2.read()))
            {
                System.out.print((char)i);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
