class ConstructorOverloading {
    String name;
    int age;

    // Default constructor
    ConstructorOverloading() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    ConstructorOverloading(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        ConstructorOverloading s1 = new ConstructorOverloading();
        ConstructorOverloading s2 = new ConstructorOverloading("Subradeep", 20);

        s1.display();
        s2.display();
    }
}