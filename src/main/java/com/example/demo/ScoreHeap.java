package com.example.demo;

/* Max heap para trabajar los grades */
/* No admite números negativos */
public class ScoreHeap { 
    int cantidad_de_notas; 
    int length; 
    static double[] Heap_Array;
  
    ScoreHeap(int cantidad_de_notas){ 
        this.cantidad_de_notas = cantidad_de_notas;
        this.length = 0; 
        Heap_Array = new double[cantidad_de_notas + 1];
        Heap_Array[0] = Integer.MAX_VALUE;
    }
  
    private int parent(int i){ 
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
  
    private void swap(int fpos, int spos){ 
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
  
    public void insert(double new_score){ 
        Heap_Array[++length] = new_score; 
  
        int current =length; 
        while (Heap_Array[current] > Heap_Array[parent(current)]) { 
            swap(current, parent(current)); 
            current = parent(current); 
        } 
    } 


    public static double getMax() {
        // double popped = Heap_Array[1]; 
        // Heap_Array[1] = Heap_Array[length--]; 
        // maxHeapify(1); 
        return Heap_Array[1]; 
    } 

    public static double getMin() {
        return Heap_Array[Heap_Array.length - 1];
    }
} 


