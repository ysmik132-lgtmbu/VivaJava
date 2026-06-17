class Student {//Q5

    String name;
    int marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

class nMain {

    public static void main(String[] args) {

        Student s1 = new Student();
        // First object

        s1.name = "Ram";
        s1.marks = 85;

        Student s2 = new Student();
        // Second object

        s2.name = "Sita";
        s2.marks = 92;

        s1.display();
        System.out.println();

        s2.display();
    }
}
