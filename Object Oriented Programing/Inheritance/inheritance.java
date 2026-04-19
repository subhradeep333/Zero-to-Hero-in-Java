/*
Question
Base class: Vehicle
Data: brand, model
Method: showDetails() – prints brand and model
Derived class: Car (inherits Vehicle)
Data: seatingCapacity
Method: showCarDetails() – prints car details
Derived class: ElectricCar (inherits Car)
Data: batteryCapacity
*/
import java.util.*;
class Vehicle{
    String brand,model;
    Vehicle(String brand,String model)
    {
        this.brand=brand;
        this.model=model;
    }
    void showDetails()
    {
        System.out.println("Brand : "+brand+"\nModel : "+model);
    }
}
class Car extends Vehicle{
    int seatingCapacity;
    Car(int seatingCapacity,String brand,String model)
    {
        super(brand,model);
        this.seatingCapacity=seatingCapacity;
    }
    void showCarDetails()
    {
        super.showDetails();
        System.out.println("Seating Capacity : "+seatingCapacity);
    }
}
class ElectricCar extends Car{
    int batteryCapacity;
    ElectricCar(int batteryCapacity,int seatingCapacity,String brand,String model)
    {
        super(seatingCapacity,brand,model);
        this.batteryCapacity=batteryCapacity;
    }
    void showCarDetails()
    {
        super.showCarDetails();
        System.out.println("Battery Capacity : "+batteryCapacity);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter brand name : ");
        String bnd=sc.nextLine();
        System.out.print("Enter model name : ");
        String mod=sc.nextLine();
        System.out.print("Enter Seating Capacity : ");
        int seat=sc.nextInt();
        System.out.print("Enter Battery Capacity : ");
        int battery=sc.nextInt();
        ElectricCar ob=new ElectricCar(battery, seat, bnd, mod);
        ob.showCarDetails();
        sc.close();
    }
}