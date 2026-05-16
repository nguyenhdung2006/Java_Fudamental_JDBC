package lt78;

class Student {

    private int id;
    private String fullName;
    private int age;
    private double gpa;

    private static int count = 0;

    public static final double MIN_GPA = 0.0;
    public static final double MAX_GPA = 4.0;

    public Student(int id, String fullName, int age, double gpa) {

        this.id = id;
        this.fullName = fullName;
        this.age = age;

        if (gpa < MIN_GPA) {
            this.gpa = MIN_GPA;
        }
        else if (gpa > MAX_GPA) {
            this.gpa = MAX_GPA;
        }
        else {
            this.gpa = gpa;
        }

        count++;
    }

    public void printInfo() {

        System.out.println("ID: " + id);
        System.out.println("Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println();
    }

    public static int getCount() {
        return count;
    }
}

public class lt3 {

    public static void main(String[] args) {

        Student s1 = new Student(1, "Dung", 19, 3.5);
        Student s2 = new Student(2, "An", 20, 3.8);
        Student s3 = new Student(3, "Minh", 18, 4.2);

        s1.printInfo();
        s2.printInfo();
        s3.printInfo();

        System.out.println("Total students: " +
                Student.getCount());
    }
}