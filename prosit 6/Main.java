//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Classe Zoo
public class Zoo {
    private Aquatic[] aquaticAnimals; // Tableau pour stocker les animaux aquatiques
    private int aquaticCount; // Nombre d'animaux aquatiques actuellement dans le zoo

    // Constructeur
    public Zoo() {
        aquaticAnimals = new Aquatic[10]; // Initialisation du tableau avec une capacité de 10
        aquaticCount = 0; // Initialisation du nombre d'animaux aquatiques à zéro
    }

    // Méthode pour ajouter un animal aquatique au zoo
    public void addAquaticAnimal(Aquatic aquaticAnimal) {
        if (aquaticCount < 10) { // Vérifier s'il y a de la place dans le tableau
            aquaticAnimals[aquaticCount] = aquaticAnimal; // Ajouter l'animal au tableau
            aquaticCount++; // Augmenter le compteur
            System.out.println("Aquatic animal added to the zoo.");
        } else {
            System.out.println("Zoo is full. Cannot add more aquatic animals.");
        }
    }
}
// Classe Zoo
public class Zoo {
    private Aquatic[] aquaticAnimals;
    private int aquaticCount;

    public Zoo() {
        aquaticAnimals = new Aquatic[10];
        aquaticCount = 0;
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquaticCount < 10) {
            aquaticAnimals[aquaticCount] = aquatic;
            aquaticCount++;
            System.out.println("Aquatic animal added to the zoo.");
        } else {
            System.out.println("Zoo is full. Cannot add more aquatic animals.");
        }
    }

    // Méthode pour afficher les animaux aquatiques présents dans le zoo
    public void displayAquaticAnimals() {
        System.out.println("Aquatic Animals in the Zoo:");
        for (int i = 0; i < aquaticCount; i++) {
            System.out.println(aquaticAnimals[i]);
        }
    }
}

// Classe Main pour tester
public class Main {
    public static void main(String[] args) {
        // Création d'un zoo
        Zoo zoo = new Zoo();

        // Ajout d'animaux aquatiques
        Aquatic dolphin = new Dolphin("Ocean", 20.5f);
        Aquatic penguin = new Penguin("Ocean", 30.0f);

        // Ajout des animaux au zoo
        zoo.addAquaticAnimal(dolphin);
        zoo.addAquaticAnimal(penguin);

        // Affichage des animaux aquatiques dans le zoo
        zoo.displayAquaticAnimals();
    }
}
// Classe Aquatic
public class Aquatic extends Animal {
    public Aquatic(String habitat) {
        super(habitat);
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }
}

// Classe Dolphin
public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    public Dolphin(String habitat, float swimmingSpeed) {
        super(habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}

// Classe Penguin
public class Penguin extends Aquatic {
    private float swimmingDepth;

    public Penguin(String habitat, float swimmingDepth) {
        super(habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println("This penguin is swimming.");
    }
}

// Classe Zoo
public class Zoo {
    private Aquatic[] aquaticAnimals;
    private int aquaticCount;

    public Zoo() {
        aquaticAnimals = new Aquatic[10];
        aquaticCount = 0;
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquaticCount < 10) {
            aquaticAnimals[aquaticCount] = aquatic;
            aquaticCount++;
            System.out.println("Aquatic animal added to the zoo.");
        } else {
            System.out.println("Zoo is full. Cannot add more aquatic animals.");
        }
    }

    // Méthode pour afficher les animaux aquatiques présents dans le zoo
    public void displayAquaticAnimals() {
        System.out.println("Aquatic Animals in the Zoo:");
        for (int i = 0; i < aquaticCount; i++) {
            aquaticAnimals[i].swim();
        }
    }
}

// Classe Main pour tester
public class Main {
    public static void main(String[] args) {
        // Création d'un zoo
        Zoo zoo = new Zoo();

        // Ajout d'animaux aquatiques
        Aquatic dolphin = new Dolphin("Ocean", 20.5f);
        Aquatic penguin = new Penguin("Ocean", 30.0f);

        // Ajout des animaux au zoo
        zoo.addAquaticAnimal(dolphin);
        zoo.addAquaticAnimal(penguin);

        // Affichage des animaux aquatiques dans le zoo
        zoo.displayAquaticAnimals();
    }
}
// Classe Aquatic
public abstract class Aquatic extends Animal {
    public Aquatic(String habitat) {
        super(habitat);
    }

    // Méthode swim déclarée comme abstraite
    public abstract void swim();
}

// Classe Dolphin
public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    public Dolphin(String habitat, float swimmingSpeed) {
        super(habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }
}

// Classe Penguin
public class Penguin extends Aquatic {
    private float swimmingDepth;

    public Penguin(String habitat, float swimmingDepth) {
        super(habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println("This penguin is swimming.");
    }
}
// Classe Zoo
public class Zoo {
    private Aquatic[] aquaticAnimals;
    private int aquaticCount;

    public Zoo() {
        aquaticAnimals = new Aquatic[10];
        aquaticCount = 0;
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquaticCount < 10) {
            aquaticAnimals[aquaticCount] = aquatic;
            aquaticCount++;
            System.out.println("Aquatic animal added to the zoo.");
        } else {
            System.out.println("Zoo is full. Cannot add more aquatic animals.");
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0.0f; // Initialise la profondeur maximale à zéro
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin) { // Vérifie si l'animal est un pingouin
                Penguin penguin = (Penguin) aquaticAnimals[i]; // Cast l'objet à Penguin
                if (penguin.getSwimmingDepth() > maxDepth) { // Vérifie si la profondeur est supérieure à la profondeur maximale actuelle
                    maxDepth = penguin.getSwimmingDepth(); // Met à jour la profondeur maximale
                }
            }
        }
        return maxDepth; // Retourne la profondeur maximale des pingouins
    }
}
// Classe Zoo
public class Zoo {
    private Aquatic[] aquaticAnimals;
    private int aquaticCount;

    public Zoo() {
        aquaticAnimals = new Aquatic[10];
        aquaticCount = 0;
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquaticCount < 10) {
            aquaticAnimals[aquaticCount] = aquatic;
            aquaticCount++;
            System.out.println("Aquatic animal added to the zoo.");
        } else {
            System.out.println("Zoo is full. Cannot add more aquatic animals.");
        }
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0; // Compteur pour les dauphins
        int penguinCount = 0; // Compteur pour les pingouins

        // Parcours de tous les animaux aquatiques présents dans le zoo
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) { // Vérifie si l'animal est un dauphin
                dolphinCount++; // Incrémente le compteur des dauphins
            } else if (aquaticAnimals[i] instanceof Penguin) { // Vérifie si l'animal est un pingouin
                penguinCount++; // Incrémente le compteur des pingouins
            }
        }

        // Affichage du nombre de dauphins et de pingouins
        System.out.println("Number of Dolphins: " + dolphinCount);
        System.out.println("Number of Penguins: " + penguinCount);
    }
}
// Classe Aquatic
public abstract class Aquatic extends Animal {
    public Aquatic(String habitat) {
        super(habitat);
    }

    // Méthode equals redéfinie
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Aquatic aquatic = (Aquatic) obj;
        return this.getHabitat().equals(aquatic.getHabitat()); // Comparaison des habitats
    }
}
