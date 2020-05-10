package com.example.demo;

import java.util.Arrays;

/* Max heap para trabajar los grades */
/* No admite números negativos */
public class ScoreHeap { 
    static int cantidad_de_notas;
    static int length;
    static double[] Heap_Array;
    static float average = 0.0f;
    static float weightedAverage = 0.0f;
  
    ScoreHeap(int cantidad_de_notas){ 
        ScoreHeap.cantidad_de_notas = cantidad_de_notas;
        if (cantidad_de_notas == 0) {
            Heap_Array = new double[cantidad_de_notas + 1];
        }
        else {
            Heap_Array = new double[cantidad_de_notas];
        }
    }
  
    private static int parent(int i){
        return (i / 2); 
    } 
  
    private int leftChild(int i){ 
        return (2 * i); 
    } 

    private int rightChild(int i){ 
        return (2 * i) + 1; 
    } 
  
    private boolean isLeaf(int i){
        return (i >= (length / 2)) && (i <= length);
    } 
  
    private static void swap(int fpos, int spos){
        double tmp; 
        tmp = Heap_Array[fpos]; 
        Heap_Array[fpos] = Heap_Array[spos]; 
        Heap_Array[spos] = tmp; 
    } 
  
    private void maxHeapify(int i){ 
        // This operation is used o accomodate the heap after a deletion
        // If it's a leaf this operation has no purpose
        if (isLeaf(i)){
            return; 
        }
        // If it is, then check:
        if ((Heap_Array[i] < Heap_Array[leftChild(i)]) || (Heap_Array[i] < Heap_Array[rightChild(i)])) { 
            if (Heap_Array[leftChild(i)] > Heap_Array[rightChild(i)]) { 
                swap(i, leftChild(i)); 
                maxHeapify(leftChild(i)); 
            } 
            else { 
                swap(i, rightChild(i)); 
                maxHeapify(rightChild(i)); 
            } 
        } 
    } 
  
    public static void insert(double new_score){
        Heap_Array[Heap_Array.length-1] = new_score;
  
        int current =Heap_Array.length-1;
        while (Heap_Array[current] > Heap_Array[parent(current)]) { 
            swap(current, parent(current)); 
            current = parent(current); 
        } 
    }

    public static double getMax() {
        // double popped = Heap_Array[1]; 
        // Heap_Array[1] = Heap_Array[length--]; 
        // maxHeapify(1);
        return Heap_Array[0];
    }

    public static double getMin() {
        return Heap_Array[Heap_Array.length - 1];
    }

    public static float getAverage() {
        float sumScores = 0.0f;
        int size = 0;
        for (int i=0; i<Heap_Array.length; i++) {
            sumScores = (float) (sumScores + Heap_Array[i]);
            if (Heap_Array[i] != 0.0f) {
                size++;
            }
        }
        if (size != 0) {
            average = sumScores / size;
        }
        return average;
    }

    public static float getWeighted() {
        float totalUmas = 0.0f;
        float totalWixi = 0.0f;
        for (int i=0; i<CoursesLinkedList.coursesArray.length; i++) {
            if (CoursesLinkedList.coursesArray[i] != null) {
                totalUmas = totalUmas + CoursesLinkedList.coursesArray[i].Credits;
                totalWixi = totalWixi + (CoursesLinkedList.coursesArray[i].Score * CoursesLinkedList.coursesArray[i].Credits);
            }
        }
        if (totalUmas != 0.0f) {
            weightedAverage = totalWixi / totalUmas;
        }
        return weightedAverage;
    }
} 


