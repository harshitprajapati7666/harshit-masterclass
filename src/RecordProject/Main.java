package RecordProject;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S92300" + i, switch (i) {
                case 1 -> "Mary";
                case 2 -> "Carol";
                case 3 -> "Tim";
                case 4 -> "Harry";
                case 5 -> "Lisa";
                default -> "Anonymous";
            }, "05/11/1985", "Java Masterclass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("S92300", "Ann", "05/11/1985", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S92300", "Bill", "05/11/1985", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
//        recordStudent.classList(recordStudent.classList() + ", Java OCP Exam 829");
//        Records are immutable. So, they can't be changed.
        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }
}
