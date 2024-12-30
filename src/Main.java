public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", "Smith", 20, false);
        Student student2 = new Student("Bob", "Brown", 22, true);

        Teacher teacher1 = new Teacher("Dr. John", "Doe", 45, true, "Mathematics", 15, 70000);
        Teacher teacher2 = new Teacher("Ms. Jane", "Doe", 30, false, "Physics", 8, 50000);

        student1.addGrade(85);
        student1.addGrade(90);
        student2.addGrade(78);
        student2.addGrade(82);

        if (teacher1.yearsOfExperience > 10) {
            teacher1.giveRaise(10);
        }

        School school = new School();
        school.addMember(student1);
        school.addMember(student2);
        school.addMember(teacher1);
        school.addMember(teacher2);

        System.out.println(school);
    }
}
