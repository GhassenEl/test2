// Classe parente Animal
public class Animal {
    private String habitat; // L'habitat de l'animal

    // Constructeur
    public Animal(String habitat) {
        this.habitat = habitat;
    }

    // Getter pour l'habitat
    public String getHabitat() {
        return habitat;
    }

    // Setter pour l'habitat
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}

// Classe Animal aquatique
public class Aquatic extends Animal {
    // Constructeur
    public Aquatic(String habitat) {
        super(habitat);
    }
}

// Classe Animal terrestre
public class Terrestrial extends Animal {
    private int nbrLegs; // Nombre de pattes

    // Constructeur
    public Terrestrial(String habitat, int nbrLegs) {
        super(habitat);
        this.nbrLegs = nbrLegs;
    }

    // Getter pour le nombre de pattes
    public int getNbrLegs() {
        return nbrLegs;
    }

    // Setter pour le nombre de pattes
    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }
}

// Classe Dauphin
public class Dolphin extends Aquatic {
    private float swimmingSpeed; // Vitesse de nage

    // Constructeur
    public Dolphin(String habitat, float swimmingSpeed) {
        super(habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    // Getter pour la vitesse de nage
    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    // Setter pour la vitesse de nage
    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }
}

// Classe Pingouin
public class Penguin extends Aquatic {
    private float swimmingDepth; // Profondeur de nage

    // Constructeur
    public Penguin(String habitat, float swimmingDepth) {
        super(habitat);
        this.swimmingDepth = swimmingDepth;
    }

    // Getter pour la profondeur de nage
    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    // Setter pour la profondeur de nage
    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }
}
public class Main {
    public static void main(String[] args) {
        // Création d'une instance de chaque classe avec les constructeurs par défaut

        // Animal aquatique
        Aquatic aquaticAnimal = new Aquatic("Océan");

        // Animal terrestre
        Terrestrial terrestrialAnimal = new Terrestrial("Forêt", 4);

        // Dauphin
        Dolphin dolphin = new Dolphin("Océan", 20.5f); // Vitesse de nage = 20.5

        // Pingouin
        Penguin penguin = new Penguin("Océan", 30.0f); // Profondeur de nage = 30.0
    }
}
// Classe parente Animal
public class Animal {
    private String habitat;

    // Constructeur paramétré
    public Animal(String habitat) {
        this.habitat = habitat;
    }

    // Getter et Setter pour l'habitat
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}

// Classe Animal aquatique
public class Aquatic extends Animal {
    // Constructeur paramétré
    public Aquatic(String habitat) {
        super(habitat);
    }
}

// Classe Animal terrestre
public class Terrestrial extends Animal {
    private int nbrLegs;

    // Constructeur paramétré
    public Terrestrial(String habitat, int nbrLegs) {
        super(habitat);
        this.nbrLegs = nbrLegs;
    }

    // Getter et Setter pour le nombre de pattes
    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }
}

// Classe Dauphin
public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    // Constructeur paramétré
    public Dolphin(String habitat, float swimmingSpeed) {
        super(habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    // Getter et Setter pour la vitesse de nage
    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }
}

// Classe Pingouin
public class Penguin extends Aquatic {
    private float swimmingDepth;

    // Constructeur paramétré
    public Penguin(String habitat, float swimmingDepth) {
        super(habitat);
        this.swimmingDepth = swimmingDepth;
    }

    // Getter et Setter pour la profondeur de nage
    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }
}

// Classe Main pour tester
public class Main {
    public static void main(String[] args) {
        // Création d'instances avec les constructeurs paramétrés

        // Animal aquatique
        Aquatic aquaticAnimal = new Aquatic("Océan");

        // Animal terrestre
        Terrestrial terrestrialAnimal = new Terrestrial("Forêt", 4);

        // Dauphin
        Dolphin dolphin = new Dolphin("Océan", 20.5f); // Vitesse de nage = 20.5

        // Pingouin
        Penguin penguin = new Penguin("Océan", 30.0f); // Profondeur de nage = 30.0
    }
}
// Classe parente Animal
public class Animal {
    private String habitat;

    // Constructeur paramétré
    public Animal(String habitat) {
        this.habitat = habitat;
    }

    // Getter et Setter pour l'habitat
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}

// Classe Animal aquatique
public class Aquatic extends Animal {
    // Constructeur paramétré
    public Aquatic(String habitat) {
        super(habitat);
    }
}

// Classe Animal terrestre
public class Terrestrial extends Animal {
    private int nbrLegs;

    // Constructeur paramétré
    public Terrestrial(String habitat, int nbrLegs) {
        super(habitat);
        this.nbrLegs = nbrLegs;
    }

    // Getter et Setter pour le nombre de pattes
    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }
}

// Classe Dauphin
public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    // Constructeur paramétré
    public Dolphin(String habitat, float swimmingSpeed) {
        super(habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    // Getter et Setter pour la vitesse de nage
    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }
}

// Classe Pingouin
public class Penguin extends Aquatic {
    private float swimmingDepth;

    // Constructeur paramétré
    public Penguin(String habitat, float swimmingDepth) {
        super(habitat);
        this.swimmingDepth = swimmingDepth;
    }

    // Getter et Setter pour la profondeur de nage
    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }
}

// Classe Main pour tester
public class Main {
    public static void main(String[] args) {
        // Création d'instances avec les constructeurs paramétrés

        // Animal aquatique
        Aquatic aquaticAnimal = new Aquatic("Océan");

        // Animal terrestre
        Terrestrial terrestrialAnimal = new Terrestrial("Forêt", 4);

        // Dauphin
        Dolphin dolphin = new Dolphin("Océan", 20.5f); // Vitesse de nage = 20.5

        // Pingouin
        Penguin penguin = new Penguin("Océan", 30.0f); // Profondeur de nage = 30.0
    }
}
// Classe Animal
public class Animal {
    private String habitat;

    public Animal(String habitat) {
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Habitat: " + habitat;
    }
}

// Classe Aquatic
public class Aquatic extends Animal {
    public Aquatic(String habitat) {
        super(habitat);
    }
}

// Classe Terrestrial
public class Terrestrial extends Animal {
    private int nbrLegs;

    public Terrestrial(String habitat, int nbrLegs) {
        super(habitat);
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", Number of Legs: " + nbrLegs;
    }
}

// Classe Dolphin
public class Dolphin extends Aquatic {
    private float swimmingSpeed;

    public Dolphin(String habitat, float swimmingSpeed) {
        super(habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + ", Swimming Speed: " + swimmingSpeed;
    }
}

// Classe Penguin
public class Penguin extends Aquatic {
    private float swimmingDepth;

    public Penguin(String habitat, float swimmingDepth) {
        super(habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString() + ", Swimming Depth: " + swimmingDepth;
    }
}

// Classe Main pour tester
public class Main {
    public static void main(String[] args) {
        // Création d'instances avec les constructeurs paramétrés

        // Animal aquatique
        Aquatic aquaticAnimal = new Aquatic("Océan");
        System.out.println("Aquatic Animal: " + aquaticAnimal);

        // Animal terrestre
        Terrestrial terrestrialAnimal = new Terrestrial("Forêt", 4);
        System.out.println("Terrestrial Animal: " + terrestrialAnimal);

        // Dauphin
        Dolphin dolphin = new Dolphin("Océan", 20.5f); // Vitesse de nage = 20.5
        System.out.println("Dolphin: " + dolphin);

        // Pingouin
        Penguin penguin = new Penguin("Océan", 30.0f); // Profondeur de nage = 30.0
        System.out.println("Penguin: " + penguin);
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
}

// Classe Main pour tester
public class Main {
    public static void main(String[] args) {
        // Création d'instances et appel de la méthode swim()

        // Aquatic
        Aquatic aquaticAnimal = new Aquatic("Ocean");
        aquaticAnimal.swim();

        // Dolphin
        Dolphin dolphin = new Dolphin("Ocean", 20.5f);
        dolphin.swim();

        // Penguin
        Penguin penguin = new Penguin("Ocean", 30.0f);
        // penguin.swim(); // Impossible d'appeler swim() sur un objet de type Penguin
    }
}
