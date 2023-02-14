package ControlFlow;

public class WhileLoopChallenge {

    public static void main(String[] args) {

        int number = 4;
        int finsihNumber = 20;
        int evenCount = 0;
        int oddCount = 0;

        while (number <= finsihNumber) {
            number++;
            if (!isEvenNumber(number)) {
                oddCount++;
                continue;
            }
            System.out.println("Even number" + number);
            evenCount++;
            if (evenCount == 5)
                break;
        }

        System.out.println("Total Odd = " + oddCount);
        System.out.println("Total Even = " + evenCount);
    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
