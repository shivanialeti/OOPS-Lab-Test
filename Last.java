Question 7: Polymorphism (Method Overloading)
Demonstrate method overloading by creating a class Calculator with multiple add() methods.

java
Copy
Edit
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of 2 and 3: " + calc.add(2, 3));
        System.out.println("Sum of 2.5 and 3.5: " + calc.add(2.5, 3.5));
        System.out.println("Sum of 1, 2, and 3: " + calc.add(1, 2, 3));
    }
}
Question 8: Polymorphism (Method Overriding)
Demonstrate method overriding by creating a class Animal with makeSound(), and subclasses Dog and Cat.

java
Copy
Edit
class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows.");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.makeSound();
        a2.makeSound();
    }
}
Question 9: Encapsulation + Validation
Write a program using encapsulation to hide details of a BankAccount class with deposit and withdraw methods.

java
Copy
Edit
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid or insufficient funds.");
        }
    }
}

public class BankTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        System.out.println("Balance: $" + account.getBalance());

        account.deposit(500);
        account.withdraw(300);
        account.withdraw(2000);

        System.out.println("Final Balance: $" + account.getBalance());
    }
}
Question 10: Menu-driven program with Inheritance and Abstraction
Write a program that uses inheritance to define shapes and lets the user select shapes to calculate area.

java
Copy
Edit
import java.util.Scanner;

abstract class Shape {
    public abstract double area();
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

public class ShapeMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose Shape: 1. Circle  2. Rectangle");
        int choice = scanner.nextInt();

        Shape shape;
        switch(choice) {
            case 1:
                System.out.print("Enter radius: ");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
                break;
            case 2:
                System.out.print("Enter length: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width: ");
                double width = scanner.nextDouble();
                shape = new Rectangle(length, width);
                break;
            default:
                System.out.println("Invalid choice.");
                scanner.close();
                return;
        }

        System.out.println("Area: " + shape.area());
        scanner.close();
    }
}
