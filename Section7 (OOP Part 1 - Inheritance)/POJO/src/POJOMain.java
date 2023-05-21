public class POJOMain {
    public static void main(String[] args) {
        // for (int i = 1; i <= 5; i++) {
        // Student s = new Student(
        // "S92300" + i,
        // switch (i) {
        // case 1 -> "Mary";
        // case 2 -> "Carol";
        // case 3 -> "Tim";
        // case 4 -> "Harry";
        // case 5 -> "Lisa";
        // default -> "Anonymous";
        // }, "12/11/1999",
        // "Java MasterClass");
        // System.out.println(s.toString());
        // }
        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent(
                    "S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    }, "12/11/1999",
                    "Java MasterClass");
            System.out.println(s.toString());
        }

        Student student = new Student("S92306", "Ann", "19/12/1999", "Java Masterclass");
        LPAStudent lpaStudent = new LPAStudent("S92306", "Bill", "18/09/2000", "Java Masterclass");

        // different getters for class and record
        System.out.println(student.getName() + " is taking " + student.getClassList());
        System.out.println(lpaStudent.name() + " is taking " + lpaStudent.classList());

        // there is no sette on record Objects
        student.setClassList("JAVA OCP");
        // lpaStudent.classList("JAVA OCP");

    }
}
