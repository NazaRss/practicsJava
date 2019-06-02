package lab1;
import java.io.*;
import java.util.*;

public class flss {

    public static String read(String fileName) {
        String s;
        try {
            BufferedReader in = new BufferedReader(new FileReader(new File(fileName)));
            try {              
                s=in.readLine();
            } finally {
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return s;
    }

    public static void write(String fileName, String text) {
        try {
            PrintWriter out = new PrintWriter(new File(fileName));
            try {
                out.print(text);
            } finally {
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
