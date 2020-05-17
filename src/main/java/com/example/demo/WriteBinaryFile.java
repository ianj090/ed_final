package com.example.demo;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class WriteBinaryFile {
    public static void main(String[] args, String file) throws java.io.IOException {
        FileOutputStream fos = new FileOutputStream(file + "classes.bin");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter out = new BufferedWriter(osw);
        String text = "I fall;'/.,Ññ to pieces when I'm with you, I fall to pieces\n\nMy cherries and wine, rosemary and thyme\n";
        out.write(text);
        out.flush();
        fos.close();
    }
}
