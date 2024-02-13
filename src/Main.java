//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private int capacity;
    private List<String> animals;

    public Zoo(int capacity) {
        this.capacity = capacity;
        this.animals = new ArrayList<>();
    }

    public void addAnimal(String animal) {
        if (!isZooFull()) {
            animals.add(animal);
            System.out.println(animal + " has been added to the zoo!");
        } else {
            System.out.println("Sorry, the zoo is full");
        }
    }

    public boolean isZooFull() {
        return animals.size() >= capacity;
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo(5); // Example capacity of 5
        zoo.addAnimal("Lion");
        zoo.addAnimal("Tiger");
        zoo.addAnimal("Elephant");
        zoo.addAnimal("Giraffe");
        zoo.addAnimal("Monkey");
        zoo.addAnimal("Zebra"); // This won't be added as the zoo is full
    }
}
public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
}

public class Zoo {
    private String name;
    private int capacity;
    private List<Animal> animals;

    public Zoo(String name, int capacity) {
        setName(name);
        this.capacity = capacity;
        this.animals = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Zoo name cannot be empty");
        }
    }

    // Other methods for managing animals in the zoo
}
package tn.esprit.gestionzoo.entities;
import java.util.ArrayList;
import java.util.List;
public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
}
package tn.esprit.gestionzoo.entities;
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String name;
    private int capacity;
    private List<Animal> animals;

    public Zoo(String name, int capacity) {
        setName(name);
        this.capacity = capacity;
        this.animals = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Zoo name cannot be empty");
        }
    }

    // Other methods for managing animals in the zoo
}
package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class Main {
    public static void main(String[] args) {
        // Example usage
        Zoo zoo = new Zoo("MyZoo", 10);
        Animal lion = new Animal("Lion", 5);
        zoo.addAnimal(lion);
        // Other operations
    }
}