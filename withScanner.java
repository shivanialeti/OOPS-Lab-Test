✈️ Flight Class with Scanner
java
Copy
Edit
import java.util.Scanner;

class Flight {
    private String destination;
    private int flightNo;
    private int departureTime; // time in minutes from midnight
    private boolean delayed;

    public Flight(String destination, int flightNo, int departureTime) {
        this.destination = destination;
        this.flightNo = flightNo;
        this.departureTime = departureTime;
        this.delayed = false;
    }

    public void delay(int minutes) {
        this.departureTime += minutes;
        this.delayed = true;
    }

    public String check() {
        return delayed ? "Delayed" : "On Time";
    }

    public void flightInfo() {
        System.out.println("Flight " + flightNo + " to " + destination);
        System.out.printf("Departure time: %02d:%02d\n", (departureTime / 60), (departureTime % 60));
        System.out.println("Status: " + check());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter destination: ");
        String dest = sc.nextLine();
        System.out.print("Enter flight number: ");
        int num = sc.nextInt();
        System.out.print("Enter departure time (minutes from midnight): ");
        int time = sc.nextInt();

        Flight flight = new Flight(dest, num, time);

        System.out.print("Delay (minutes)? ");
        int delayMinutes = sc.nextInt();
        if (delayMinutes > 0) {
            flight.delay(delayMinutes);
        }

        flight.flightInfo();

        sc.close();
    }
}
🚗 Vehicle and Car Class with Scanner
java
Copy
Edit
import java.util.Scanner;

class Vehicle {
    int speed;
    int fuel;

    Vehicle(int speed, int fuel) {
        this.speed = speed;
        this.fuel = fuel;
    }

    void display() {
        System.out.println("Vehicle speed: " + speed + " kmph");
        System.out.println("Vehicle fuel: " + fuel + " liters");
    }
}

class Car extends Vehicle {
    String model;

    Car(int speed, int fuel, String model) {
        super(speed, fuel);
        this.model = model;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Car Model: " + model);
    }

    void display(String message) {
        System.out.println(message + ": " + model);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter speed: ");
        int speed = sc.nextInt();
        System.out.print("Enter fuel: ");
        int fuel = sc.nextInt();
        sc.nextLine(); // clear newline
        System.out.print("Enter model: ");
        String model = sc.nextLine();

        Car myCar = new Car(speed, fuel, model);

        myCar.display();
        myCar.display("Car Details");

        sc.close();
    }
}
🏏 Player, Batsman, and Bowler Classes with Scanner
java
Copy
Edit
import java.util.Scanner;

class Player {
    String name;
    int age;

    Player(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Batsman extends Player {
    int runs;

    Batsman(String name, int age, int runs) {
        super(name, age);
        this.runs = runs;
    }
}

class Bowler extends Player {
    int wickets;

    Bowler(String name, int age, int wickets) {
        super(name, age);
        this.wickets = wickets;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear newline

        Player[] players = new Player[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter player type (batsman/bowler): ");
            String type = sc.nextLine();
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            sc.nextLine(); // clear newline

            if (type.equalsIgnoreCase("batsman")) {
                System.out.print("Enter runs: ");
                int runs = sc.nextInt();
                sc.nextLine(); // clear newline
                players[i] = new Batsman(name, age, runs);
            } else if (type.equalsIgnoreCase("bowler")) {
                System.out.print("Enter wickets: ");
                int wickets = sc.nextInt();
                sc.nextLine(); // clear newline
                players[i] = new Bowler(name, age, wickets);
            } else {
                System.out.println("Invalid type. Skipping this player.");
                i--; // redo this iteration
            }
        }

        Batsman bestBatsman = null;
        Bowler bestBowler = null;

        for (Player player : players) {
            if (player instanceof Batsman) {
                Batsman batsman = (Batsman) player;
                if (bestBatsman == null || batsman.runs > bestBatsman.runs) {
                    bestBatsman = batsman;
                }
            } else if (player instanceof Bowler) {
                Bowler bowler = (Bowler) player;
                if (bestBowler == null || bowler.wickets > bestBowler.wickets) {
                    bestBowler = bowler;
                }
            }
        }

        System.out.println("\nBest Batsman: " + (bestBatsman != null ? bestBatsman.name : "None"));
        System.out.println("Best Bowler: " + (bestBowler != null ? bestBowler.name : "None"));

        sc.close();
    }
}
