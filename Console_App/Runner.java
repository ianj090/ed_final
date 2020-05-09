class Runner {
    public static void main(String[] args) {
        ScoreHeap obj = new ScoreHeap(100);
        obj.insert(99);
        obj.insert(100);
        obj.insert(1000.90);
        obj.insert(98);
        obj.insert(90);
        System.out.println(obj.extractMax());
    }
}
