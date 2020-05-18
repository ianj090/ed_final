package com.example.demo;

import javax.print.DocFlavor;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ReadBinaryFileAssignment {

    public static int CalculateArraySize() throws IOException {
        File file = new File("assignments.bin");
        boolean exists = file.exists();
        int i=0;

        if (exists) {
            try (FileInputStream fileInputStream = new FileInputStream(file)) {
                int singleCharInt;
                char singleChar;
                char test = '*';

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


    public static String[] ReadAssignmentsFile() throws IOException {
        File file = new File("assignments.bin");
        boolean exists = file.exists();
        String[] Assignments = new String[CalculateArraySize() + 1];

        if (exists) {
            try (FileInputStream fileInputStream = new FileInputStream(file)) {
                int singleCharInt;
                char singleChar;
                String current_assignment = "";
                char test = '*';
                int i = 0;

                while ((singleCharInt = fileInputStream.read()) != -1) {
                    singleChar = (char) singleCharInt;
                    current_assignment += singleChar;
                    if (singleChar == test) {
                        if (i != 0) {
                            current_assignment = current_assignment.substring(3, current_assignment.length());
                        }
                        // System.out.println(current_assignment);
                        // current_assignment = current_assignment.replaceAll("\n", "");
                        Assignments[i] = current_assignment;
                        current_assignment = "";
                        i++;
                    }
                }

                String[][] arr_arr = new String[CalculateArraySize()][8];


                for (int ii = 0; ii < Assignments.length - 1; ii++) {
                    if (Assignments[ii] != null) {
                        String[] temp = Assignments[ii].split("\n");
                        arr_arr[ii] = temp;
                    }
                }

                for (int j = 0; j < arr_arr.length; j++) {
                    if (arr_arr[j] != null) {
                        String ClassName = "";
                        Assignment assignment1 = new Assignment();
                        for (int jj = 0; jj < arr_arr[0].length; jj++) {
                            
                            if (jj == 0){
                                ClassName = arr_arr[j][jj];
                            }
                            if (jj == 1){
                                assignment1.Title = arr_arr[j][jj];
                            }
                            if (jj == 2){
                                assignment1.DateAdded = arr_arr[j][jj];
                            }
                            if (jj == 3){
                                assignment1.DateDue = arr_arr[j][jj];
                            }
                            if (jj == 4){
                                assignment1.InstructionsOfThisActivity = arr_arr[j][jj];
                            }
                            if (jj == 5){
                                assignment1.TypeOfActivity = arr_arr[j][jj];
                            }
                            if (jj == 6){
                                assignment1.ScoreOfThisActivity = Double.valueOf(arr_arr[j][jj]);
                            }
                        
                            System.out.println(arr_arr[j][jj]);

                        }
                        System.out.println(ClassName);
                        Class stored = CoursesLinkedList.find(ClassName);
                        System.out.println(stored);
                        System.out.println(stored.ClassName);
                        System.out.println(stored.WeekDay);
                        stored.ClassActivities = new AssignmentLinkedList();
                        stored.ClassActivities.add(assignment1);
                    }
                }
            }
        }
        return Assignments;
    }
}
