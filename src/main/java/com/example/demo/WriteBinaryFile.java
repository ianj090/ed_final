package com.example.demo;
import java.io.*;
import java.nio.file.StandardOpenOption;


public class WriteBinaryFile {
        public static void WriteClassFile(Class classtotext) throws IOException {
                FileOutputStream fos = new FileOutputStream("classes.bin", true);
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                BufferedWriter out = new BufferedWriter(osw); /*new BufferedWriter(osw,true);*/
                out.write(classtotext.ClassName + "\n"); //0
                out.write(classtotext.Descripcion + "\n");//1
                // out.write(classtotext.ClassActivities + "\n");
                out.write(classtotext.Teacher + "\n");//2
                out.write(classtotext.TA + "\n");//3
                out.write(String.valueOf(classtotext.Credits) + "\n");//4
//                out.write(classtotext.Descripcion + "\n");
                out.write(classtotext.Period + "\n");//5
                out.write(classtotext.WeekDay + "\n");//6
                out.write(String.valueOf(classtotext.HomeWork) + "\n");//7
                out.write(String.valueOf(classtotext.ClassWork) + "\n");//8
                out.write(String.valueOf(classtotext.Quiz) + "\n");//9
                out.write(String.valueOf(classtotext.Test) + "\n");//10
                out.write(String.valueOf(classtotext.Final) + "\n");//11
                out.write(String.valueOf(classtotext.ScoreWanted) + "\n");//14
                out.write(String.valueOf(classtotext.Score) + "\n");//12
                out.write(String.valueOf(classtotext.FinalScoreNeeded) + "\n");//15
                out.write(String.valueOf(classtotext.Total) + "\n");//13
                out.write("/");
                out.flush();
                fos.close();
        }

        public static void WriteAssignmentFile(Class stored_class, Assignment assignmenttotext) throws IOException {
                FileOutputStream fos = new FileOutputStream("assignments.bin", true);
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                BufferedWriter out = new BufferedWriter(osw); /*new BufferedWriter(osw,true);*/
                out.write(stored_class.ClassName + "\n");
                out.write(assignmenttotext.Title + "\n");
                out.write(assignmenttotext.DateAdded + "\n");
                out.write(assignmenttotext.DateDue + "\n");
                out.write(assignmenttotext.InstructionsOfThisActivity + "\n");
                out.write(assignmenttotext.TypeOfActivity + "\n");
                out.write(assignmenttotext.ScoreOfThisActivity + "\n");
                out.write("/ \n");
                out.flush();
                fos.close();
        }

        public static void ClearFile(String filename) throws IOException {
                FileOutputStream fos = new FileOutputStream(filename + ".bin");
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                BufferedWriter out = new BufferedWriter(osw); /*new BufferedWriter(osw,true);*/
                out.write("");
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
