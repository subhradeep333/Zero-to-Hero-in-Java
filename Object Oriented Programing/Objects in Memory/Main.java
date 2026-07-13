class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Subhradeep", 20);
        Student s2 = new Student("Rahul", 21);
    }
}



// Stack
// s1 --------+
//            |
// s2 -----+  |
//          | |
//          | |
//          v v

// Heap

// +-------------------------+
// | Student Object          |
// |-------------------------|
// | name = "Subhradeep"     |
// | age  = 20               |
// +-------------------------+

// +-------------------------+
// | Student Object          |
// |-------------------------|
// | name = "Rahul"          |
// | age  = 21               |
// +-------------------------+