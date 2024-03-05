//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Zoo {
    private Animal[] animals;
    private int capacity;
    private int numberOfAnimals;

    public Zoo(int capacity) {
        this.capacity = capacity;
        this.animals = new Animal[capacity];
        this.numberOfAnimals = 0;
    }

    public void addAnimal(Animal animal) {
        if (numberOfAnimals < capacity) {
            animals[numberOfAnimals] = animal;
            numberOfAnimals++;
            System.out.println("Added " + animal.getName() + " to the zoo.");
        } else {
            System.out.println("The zoo is full. Cannot add more animals.");
        }
    }

    // Other methods of the Zoo class...
}
public class ZooFullException extends Exception {
    public ZooFullException(String message) {
        super(message);
    }
}

public class Zoo {
    private Animal[] animals;
    private int capacity;
    private int numberOfAnimals;

    public Zoo(int capacity) {
        this.capacity = capacity;
        this.animals = new Animal[capacity];
        this.numberOfAnimals = 0;
    }

    public void addAnimal(Animal animal) throws ZooFullException {
        if (numberOfAnimals < capacity) {
            animals[numberOfAnimals] = animal;
            numberOfAnimals++;
            System.out.println("Added " + animal.getName() + " to the zoo.");
        } else {
            throw new ZooFullException("The zoo is full. Cannot add more animals.");
        }
    }

    public int getNumberOfAnimals() {
        return numberOfAnimals;
    }

    // Other methods of the Zoo class...
}

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo(3); // Réduire le nombre de cages à 3

        try {
            zoo.addAnimal(new Animal("Lion"));
            System.out.println("Number of animals: " + zoo.getNumberOfAnimals());
            zoo.addAnimal(new Animal("Elephant"));
            System.out.println("Number of animals: " + zoo.getNumberOfAnimals());
            zoo.addAnimal(new Animal("Giraffe"));
            System.out.println("Number of animals: " + zoo.getNumberOfAnimals());
            zoo.addAnimal(new Animal("Tiger")); // Cette ligne générera une exception
            System.out.println("Number of animals: " + zoo.getNumberOfAnimals()); // Cette ligne ne sera pas atteinte si une exception est levée
        } catch (ZooFullException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Zoo {
    private Animal[] animals;
    private int capacity;
    private int numberOfAnimals;

    public Zoo(int capacity) {
        this.capacity = capacity;
        this.animals = new Animal[capacity];
        this.numberOfAnimals = 0;
    }

    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {
        if (numberOfAnimals < capacity) {
            if (animal.getAge() >= 0) {
                animals[numberOfAnimals] = animal;
                numberOfAnimals++;
                System.out.println("Added " + animal.getName() + " to the zoo.");
            } else {
                throw new InvalidAgeException("Invalid age for animal: " + animal.getName());
            }
        } else {
            throw new ZooFullException("The zoo is full. Cannot add more animals.");
        }
    }

    public int getNumberOfAnimals() {
        return numberOfAnimals;
    }

    // Other methods of the Zoo class...
}

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo(3); // Réduire le nombre de cages à 3

        try {
            zoo.addAnimal(new Animal("Lion", 5));
            System.out.println("Number of animals: " + zoo.getNumberOfAnimals());
            zoo.addAnimal(new Animal("Elephant", -3)); // Cette ligne générera une exception
            System.out.println("Number of animals: " + zoo.getNumberOfAnimals()); // Cette ligne ne sera pas atteinte si une exception est levée
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
