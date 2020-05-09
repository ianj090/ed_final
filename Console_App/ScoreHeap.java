/* Max heap para trabajar los grades */
/* No admite números negativos */
public class ScoreHeap { 
    double nota_mas_alta; 
    int length; 
    double Heap_Array[]; 
  
    ScoreHeap(double nota_mas_alta){ 
        this.nota_mas_alta = nota_mas_alta; 
        this.length = 0; 
        this.Heap_Array = new double[(int)(this.nota_mas_alta + 1)]; 
        this.Heap_Array[0] = Integer.MAX_VALUE; 
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
        if ((i >= (length / 2)) && (i <=length)) { 
            return true; 
        } 
        return false; 
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


    public double getMax() { 
        // double popped = Heap_Array[1]; 
        // Heap_Array[1] = Heap_Array[length--]; 
        // maxHeapify(1); 
        return Heap_Array[1]; 
    } 

    public double getMin() {
        return Heap_Array[Heap_Array.length - 1];
    }
} 


