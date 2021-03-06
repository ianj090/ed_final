package com.example.demo;
import javax.print.DocFlavor;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadBinaryFile {

    public static int CalculateArraySize() throws IOException {
        File file = new File("classes.bin");
        boolean exists = file.exists();
        int i=0;

        if (exists) {
            try (FileInputStream fileInputStream = new FileInputStream(file)) {
                int singleCharInt;
                char singleChar;
                char test = '/';

                while ((singleCharInt = fileInputStream.read()) != -1) {
                    singleChar = (char) singleCharInt;
                    if (singleChar == test) {
                        i++;
                    }
                }
            }
        }
        return i;
    }


    public static String[] ReadClassesFile() throws IOException {
        File file = new File("classes.bin");
        boolean exists = file.exists();
        String[] Classes = new String[CalculateArraySize() + 1];

        if (exists) {
            try (FileInputStream fileInputStream = new FileInputStream(file)) {
                int singleCharInt;
                char singleChar;
                String current_class = "";
                char test = '/';
                int i = 0;

                while ((singleCharInt = fileInputStream.read()) != -1) {
                    singleChar = (char) singleCharInt;
                    current_class += singleChar;
                    if (singleChar == test) {
                        if (i != 0) {
//                            current_class = current_class.substring(1, current_class.length());
                        }
                        // System.out.println(current_class);
                        // current_class = current_class.replaceAll("\n", "");
                        Classes[i] = current_class;
                        current_class = "";
                        i++;
                    }
                }

                String[][] arr_arr = new String[CalculateArraySize()][18];


                for (int ii = 0; ii < Classes.length - 1; ii++) {
                    if (Classes[ii] != null) {
                        String[] temp = Classes[ii].split("\n");
                        arr_arr[ii] = temp;
                    }
                }

                for (int j = 0; j < arr_arr.length; j++) {
                    if (arr_arr[j] != null) {
                        Class course1 = new Class();
                        for (int jj = 0; jj < arr_arr[0].length; jj++) {
                            if (jj == 0) {
                                course1.ClassName = arr_arr[j][jj];
                            }
                            if (jj == 1) {
                                course1.Descripcion = arr_arr[j][jj];
                            }
                            if (jj == 2) {
                                course1.Teacher = arr_arr[j][jj];
                            }
                            if (jj == 3) {
                                course1.TA = arr_arr[j][jj];
                            }
                            if (jj == 4) {
                                course1.Credits = Float.valueOf(arr_arr[j][jj]);
                            }
                            if (jj == 5) {
                                course1.Period = Integer.valueOf(arr_arr[j][jj].trim());
                            }
                            if (jj == 6) {
                                course1.WeekDay = arr_arr[j][jj];
                            }
                            if (jj == 7) {
                                course1.HomeWork = Float.valueOf(arr_arr[j][jj]);
                            }
                            if (jj == 8) {
                                course1.ClassWork = Float.valueOf(arr_arr[j][jj]);
                            }
                            if (jj == 9) {
                                course1.Quiz = Float.valueOf(arr_arr[j][jj]);
                            }
                            if (jj == 10) {
                                course1.Test = Float.valueOf(arr_arr[j][jj]);
                            }
                            if (jj == 11) {
                                course1.Final = Float.valueOf(arr_arr[j][jj]);
                            }
                            if (jj == 12) {
                                course1.ScoreWanted = Float.valueOf(arr_arr[j][jj]);
                            }
                            if (jj == 13) {
                                course1.Score = Float.valueOf(arr_arr[j][jj]);
                            }
                            if (jj == 14) {
                                course1.FinalScoreNeeded = Float.valueOf(arr_arr[j][jj]);
                            }
                            if (jj == 15) {
                                course1.Total = Float.valueOf(arr_arr[j][jj]);
                            }
                        }
                        course1.ClassActivities = new AssignmentLinkedList();
                        CoursesLinkedList.add(course1);
                    }
                }
            }
        }
        return Classes;
    }
}
