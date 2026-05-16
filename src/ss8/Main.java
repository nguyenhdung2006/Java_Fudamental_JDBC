package ss8;

class Student {

    private int id;
    String name;
    int age;

     public Student(int id, String name, int age) {
         this.id = id;
         this.name = name;
         this.age = age;
     }

    public void showInfo() {
        System.out.println("ID: " + id +
                ", Name: " + name +
                ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Dung", 19);

        s1.showInfo();
    }
}
