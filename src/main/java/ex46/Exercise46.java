package ex46;

public class Exercise46 {
    private static String inputPath = "exercise46_input.txt";

    public static void main(String[] args) {
        WordTable wTable = new WordTable(inputPath);
        wTable.build();
        wTable.print();
    }
}
