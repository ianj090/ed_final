package com.example.demo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadBinaryFile {
    public static void main(String [] pArgs) throws FileNotFoundException, IOException {
        String home = System.getProperty("user.home");
        File file = new File(home + File.separator + "Documents" + File.separator + "ed_final" + File.separator + "data.bin");
//        File file = new File("/Users/anesveth/Documents/ed_final/data.bin");
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            int singleCharInt;
            char singleChar;

            while((singleCharInt = fileInputStream.read()) != -1) {
                singleChar = (char) singleCharInt;
                System.out.print(singleChar);
            }
        }
    }
}
