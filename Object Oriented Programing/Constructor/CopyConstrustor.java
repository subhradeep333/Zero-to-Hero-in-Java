class CopyConstructor {
    String name;
    int age;

    // Parameterized constructor
    CopyConstructor(String n, int a) {
        name = n;
        age = a;
    }

    // Copy Constructor
    CopyConstructor(CopyConstructor s) {
        name = s.name;
        age = s.age;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        CopyConstructor s1 = new CopyConstructor("Subradeep", 20);
        CopyConstructor s2 = new CopyConstructor(s1); // copying object

        s2.display();
    }
}