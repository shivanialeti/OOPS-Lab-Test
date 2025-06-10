Question 3: Abstraction
Create an abstract class Shape with an abstract method area(). Implement Rectangle and Circle as subclasses.

java
Copy
Edit
abstract class Shape {
    public abstract double area();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 4);
        Shape circle = new Circle(3);

        System.out.println("Rectangle area: " + rect.area());
        System.out.println("Circle area: " + circle.area());
    }
}
Question 4: Abstraction
Define an interface Playable with a method play(). Implement it in Guitar and Piano classes.

java
Copy
Edit
interface Playable {
    void play();
}

class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Guitar is playing...");
    }
}

class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Piano is playing...");
    }
}

public class PlayableTest {
    public static void main(String[] args) {
        Playable guitar = new Guitar();
        Playable piano = new Piano();

        guitar.play();
        piano.play();
    }
}
Question 5: Inheritance
Write a class Vehicle with a start() method. Create a subclass Car with an additional drive() method.

java
Copy
Edit
class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    public void drive() {
        System.out.println("Car is driving...");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.drive();
    }
}
Question 6: Inheritance
Create a base class Person with name and age. Create a subclass Employee with salary. Include a displayDetails() method.

java
Copy
Edit
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    private double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Salary: $" + salary);
    }
}

public class PersonTest {
    public static void main(String[] args) {
        Employee emp = new Employee("Bob", 35, 55000);
        emp.displayDetails();
    }
}
