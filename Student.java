
class Student {
    int roll = 101;
    String name = "Amit";

    void display() {
        System.out.println("Roll No: " + roll);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
