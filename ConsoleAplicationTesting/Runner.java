public class Runner {
    public static void main(String[] args) {
        AssignmentLinkedList obj = new AssignmentLinkedList();
        Assignment homework1 = new Assignment();
        homework1.setInstructionsOfThisActivity(
                "Creat a Java Class using classes and learned knowledge aquired in the course.");
        homework1.setScoreOfThisActivity(89.21);
        obj.add(homework1);
        Assignment homework2 = new Assignment();
        obj.add(homework2);
        System.out.println(obj.find(homework1).getData().getDateAdded().toString());
    }
}
