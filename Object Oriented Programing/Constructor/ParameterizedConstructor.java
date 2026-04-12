class ParameterizedConstructor {
    String name;
    int age;

    // Parameterized Constructor
    ParameterizedConstructor(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        ParameterizedConstructor s1 = new ParameterizedConstructor("Subradeep", 20);
        s1.display();
    }
}