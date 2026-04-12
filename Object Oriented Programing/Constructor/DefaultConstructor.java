import java.util.*;

class DefaultConstructor {
    String name;

    // Default Constructor
    DefaultConstructor() {
        name = "Unknown";
    }

    void display() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        DefaultConstructor s1 = new DefaultConstructor(); // constructor called
        s1.display();
    }
}