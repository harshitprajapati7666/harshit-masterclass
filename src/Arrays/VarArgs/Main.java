package Arrays.VarArgs;

public class Main {

    public static void main(String... args) {

        System.out.println("Hello Worl again");

        String[] splitStrings = "Hello World again".split(" ");
        printText(splitStrings);

        System.out.println("-".repeat(20));
        printText("Hello", "World", "again");

        System.out.println("-".repeat(20));
        printText();

        String[] sArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(",", sArray));
    }

    private static void printText(String... textList) {

        for (String t : textList) {
            System.out.println(t);
        }
    }
}
