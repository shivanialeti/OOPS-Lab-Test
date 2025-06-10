Question 1: Encapsulation
Write a Java class Student with private fields: name, rollNumber, and marks. Implement getters and setters for each field. In the main() method, create an object, set values, and display them.

java
Copy
Edit
class Student {
    private String name;
    private int rollNumber;
    private double marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Alice");
        student.setRollNumber(101);
        student.setMarks(95.5);

        System.out.println("Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Marks: " + student.getMarks());
    }
}
Question 2: Encapsulation
Write a Java class Temperature with a private field celsius. Provide a getter and setter for it. Add a toFahrenheit() method.

java
Copy
Edit
class Temperature {
    private double celsius;

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double toFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Temperature temp = new Temperature();
        temp.setCelsius(25.0);
        System.out.println("Celsius: " + temp.getCelsius());
        System.out.println("Fahrenheit: " + temp.toFahrenheit());
    }
}
