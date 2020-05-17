package com.example.demo;
import java.io.*;
import java.nio.file.StandardOpenOption;


public class WriteBinaryFile {

    public static void WriteFile(String Filename,Class classtotext) throws IOException {
        FileOutputStream fos = new FileOutputStream(Filename+".bin",true);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter out = new BufferedWriter(osw); /*new BufferedWriter(osw,true);*/
        out.write("//" + classtotext.ClassName + "\n");
        out.write(classtotext.Descripcion + "\n");
        // out.write(classtotext.ClassActivities + "\n");
        out.write(classtotext.Teacher + "\n");
        out.write(classtotext.TA + "\n");
        out.write(String.valueOf(classtotext.Credits) + "\n");
        out.write(classtotext.Descripcion + "\n");
        out.write(classtotext.Period + "\n");
        out.write(classtotext.WeekDay + "\n");
        out.write(String.valueOf(classtotext.HomeWork) + "\n");
        out.write(String.valueOf(classtotext.ClassWork) + "\n");
        out.write(String.valueOf(classtotext.Quiz) + "\n");
        out.write(String.valueOf(classtotext.Test) + "\n");
        out.write(String.valueOf(classtotext.Final) + "\n");
        out.write(String.valueOf(classtotext.Score) + "\n");
        out.write(String.valueOf(classtotext.Total) + "\n");
        out.write(String.valueOf(classtotext.ScoreWanted) + "\n");
        out.write(String.valueOf(classtotext.FinalScoreNeeded) + "\n");
        out.flush();
        fos.close();
    }
//
//    public static void main(String args[]) throws java.io.IOException {
//        FileOutputStream fos = new FileOutputStream("data.bin");
//        OutputStreamWriter osw = new OutputStreamWriter(fos);
//        BufferedWriter out = new BufferedWriter(osw);
//        String text = "I fall;'/.,Ññ to pieces when I'm with you, I fall to pieces\n\nMy cherries and wine, rosemary and thyme\n";
//        out.write(text);
//        out.flush();
//        fos.close();
//    }
}
