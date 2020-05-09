class Runner {
    public static void main(String[] args) {
        ScoreHeap obj = new ScoreHeap(100);
        obj.insert(99);
        obj.insert(1090);
        obj.insert(0);
        obj.insert(98);
        obj.insert(90);
        obj.insert(100);
        System.out.println(obj.getMax());
        System.out.println(obj.getMin());
    }
}
