Instruction n°5:
public class Animal {
    // Attributs de la classe Animal
    String family;
    String name;
    int age;
    boolean isMammal;

    // Constructeur de la classe Animal
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
}

public class Zoo {
    // Attributs de la classe Zoo
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    // Constructeur de la classe Zoo
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25];  // Initialisation du tableau d'animaux avec une capacité maximale de 25
    }
}

public class Main {
    public static void main(String[] args) {
        // Création d'un animal (lion)
        Animal lion = new Animal("Félin", "Simba", 5, true);

        // Création d'un zoo (myZoo)
        Zoo myZoo = new Zoo("Mon Zoo", "VilleZoo", 10);

        // Affectation des valeurs aux attributs du zoo
        // Notez que vous devez gérer la limite de 25 animaux dans votre programme
        myZoo.animals[0] = lion;

        // Affichage des informations du lion et du zoo
        System.out.println("Informations sur l'animal (lion) :");
        System.out.println("Famille : " + lion.family);
        System.out.println("Nom : " + lion.name);
        System.out.println("Âge : " + lion.age);
        System.out.println("Est un mammifère : " + lion.isMammal);

        System.out.println("\nInformations sur le zoo :");
        System.out.println("Nom du zoo : " + myZoo.name);
        System.out.println("Ville : " + myZoo.city);
        System.out.println("Nombre de cages : " + myZoo.nbrCages);
    }
}
**********
Instruction n°6:
public class Animal {
    // Attributs de la classe Animal
    String family;
    String name;
    int age;
    boolean isMammal;

    // Constructeur paramétré de la classe Animal
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
}

public class Zoo {
    // Attributs de la classe Zoo
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    // Constructeur paramétré de la classe Zoo
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25];  // Initialisation du tableau d'animaux avec une capacité maximale de 25
    }

    // Constructeur paramétré pour ajouter des animaux au zoo directement lors de la création
    public Zoo(String name, String city, int nbrCages, Animal[] animals) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = animals;
    }
}

public class Main {
    public static void main(String[] args) {
        // Utilisation du constructeur paramétré pour créer un animal (lion)
        Animal lion = new Animal("Félin", "Simba", 5, true);

        // Utilisation du constructeur paramétré pour créer un zoo (myZoo) avec un animal (lion)
        Zoo myZoo = new Zoo("Mon Zoo", "VilleZoo", 10, new Animal[]{lion});

        // Affichage des informations du lion et du zoo
        System.out.println("Informations sur l'animal (lion) :");
        System.out.println("Famille : " + lion.family);
        System.out.println("Nom : " + lion.name);
        System.out.println("Âge : " + lion.age);
        System.out.println("Est un mammifère : " + lion.isMammal);

        System.out.println("\nInformations sur le zoo :");
        System.out.println("Nom du zoo : " + myZoo.name);
        System.out.println("Ville : " + myZoo.city);
        System.out.println("Nombre de cages : " + myZoo.nbrCages);
    }
}
*********
Instruction n°7:
public class Animal {
    // Attributs de la classe Animal
    String family;
    String name;
    int age;
    boolean isMammal;

    // Constructeur paramétré de la classe Animal
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
}

public class Zoo {
    // Attributs de la classe Zoo
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    // Constructeur paramétré de la classe Zoo
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25];  // Initialisation du tableau d'animaux avec une capacité maximale de 25
    }

    // Constructeur paramétré pour ajouter des animaux au zoo directement lors de la création
    public Zoo(String name, String city, int nbrCages, Animal[] animals) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = animals;
    }
}

public class Main {
    public static void main(String[] args) {
        // Création d'un animal (lion) avec le constructeur paramétré
        Animal lion = new Animal("Félin", "Simba", 5, true);

        // Création d'un autre animal (éléphant) avec le constructeur paramétré
        Animal elephant = new Animal("Éléphantidé", "Dumbo", 3, true);

        // Création d'un zoo (myZoo) avec les animaux créés
        Zoo myZoo = new Zoo("Mon Zoo", "VilleZoo", 10, new Animal[]{lion, elephant});

        // Affichage des informations des animaux et du zoo
        System.out.println("Informations sur l'animal (lion) :");
        System.out.println("Famille : " + lion.family);
        System.out.println("Nom : " + lion.name);
        System.out.println("Âge : " + lion.age);
        System.out.println("Est un mammifère : " + lion.isMammal);

        System.out.println("\nInformations sur l'animal (éléphant) :");
        System.out.println("Famille : " + elephant.family);
        System.out.println("Nom : " + elephant.name);
        System.out.println("Âge : " + elephant.age);
        System.out.println("Est un mammifère : " + elephant.isMammal);

        System.out.println("\nInformations sur le zoo :");
        System.out.println("Nom du zoo : " + myZoo.name);
        System.out.println("Ville : " + myZoo.city);
        System.out.println("Nombre de cages : " + myZoo.nbrCages);
    }
}
***********
Instruction n°8:
public class Animal {
    // Attributs de la classe Animal
    String family;
    String name;
    int age;
    boolean isMammal;

    // Constructeur paramétré de la classe Animal
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
}

public class Zoo {
    // Attributs de la classe Zoo
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    // Constructeur paramétré de la classe Zoo
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25];  // Initialisation du tableau d'animaux avec une capacité maximale de 25
    }

    // Constructeur paramétré pour ajouter des animaux au zoo directement lors de la création
    public Zoo(String name, String city, int nbrCages, Animal[] animals) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = animals;
    }

    // Méthode pour afficher les informations du zoo
    public void displayZoo() {
        System.out.println("Informations sur le zoo :");
        System.out.println("Nom du zoo : " + this.name);
        System.out.println("Ville : " + this.city);
        System.out.println("Nombre de cages : " + this.nbrCages);
    }
}

public class Main {
    public static void main(String[] args) {
        // Création d'un animal (lion) avec le constructeur paramétré
        Animal lion = new Animal("Félin", "Simba", 5, true);

        // Création d'un autre animal (éléphant) avec le constructeur paramétré
        Animal elephant = new Animal("Éléphantidé", "Dumbo", 3, true);

        // Création d'un zoo (myZoo) avec les animaux créés
        Zoo myZoo = new Zoo("Mon Zoo", "VilleZoo", 10, new Animal[]{lion, elephant});

        // Utilisation de la méthode displayZoo() pour afficher les informations du zoo
        myZoo.displayZoo();

        // Affichage du zoo en utilisant System.out.println(myZoo) et System.out.println(myZoo.toString())
        System.out.println("\nAffichage du zoo via System.out.println(myZoo) :");
        System.out.println(myZoo);

        System.out.println("\nAffichage du zoo via System.out.println(myZoo.toString()) :");
        System.out.println(myZoo.toString());
    }
}
***********
Instruction n°9:
public class Animal {
    // Attributs de la classe Animal
    String family;
    String name;
    int age;
    boolean isMammal;

    // Constructeur paramétré de la classe Animal
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    // Méthode toString pour afficher les informations de l'animal
    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}

public class Zoo {
    // Attributs de la classe Zoo
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    // Constructeur paramétré de la classe Zoo
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25];  // Initialisation du tableau d'animaux avec une capacité maximale de 25
    }

    // Constructeur paramétré pour ajouter des animaux au zoo directement lors de la création
    public Zoo(String name, String city, int nbrCages, Animal[] animals) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = animals;
    }

    // Méthode pour afficher les informations du zoo
    public void displayZoo() {
        System.out.println("Informations sur le zoo :");
        System.out.println("Nom du zoo : " + this.name);
        System.out.println("Ville : " + this.city);
        System.out.println("Nombre de cages : " + this.nbrCages);
    }

    // Méthode toString pour afficher les informations du zoo
    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        // Création d'un animal (lion) avec le constructeur paramétré
        Animal lion = new Animal("Félin", "Simba", 5, true);

        // Création d'un autre animal (éléphant) avec le constructeur paramétré
        Animal elephant = new Animal("Éléphantidé", "Dumbo", 3, true);

        // Création d'un zoo (myZoo) avec les animaux créés
        Zoo myZoo = new Zoo("Mon Zoo", "VilleZoo", 10, new Animal[]{lion, elephant});

        // Utilisation de la méthode displayZoo() pour afficher les informations du zoo
        myZoo.displayZoo();

        // Affichage du zoo en utilisant System.out.println(myZoo) et System.out.println(myZoo.toString())
        System.out.println("\nAffichage du zoo via System.out.println(myZoo) :");
        System.out.println(myZoo);

        System.out.println("\nAffichage du zoo via System.out.println(myZoo.toString()) :");
        System.out.println(myZoo.toString());

        // Affichage de l'animal en utilisant System.out.println(lion) et System.out.println(lion.toString())
        System.out.println("\nAffichage de l'animal via System.out.println(lion) :");
        System.out.println(lion);

        System.out.println("\nAffichage de l'animal via System.out.println(lion.toString()) :");
        System.out.println(lion.toString());
    }
}
********Instruction n°10:
        import java.util.Arrays;

public class Animal {
    // Attributs de la classe Animal
    String family;
    String name;
    int age;
    boolean isMammal;

    // Constructeur paramétré de la classe Animal
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    // Méthode toString pour afficher les informations de l'animal
    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}

public class Zoo {
    // Attributs de la classe Zoo
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    int animalCount; // Compteur d'animaux dans le zoo

    // Constructeur paramétré de la classe Zoo
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25];  // Initialisation du tableau d'animaux avec une capacité maximale de 25
        this.animalCount = 0;
    }

    // Constructeur paramétré pour ajouter des animaux au zoo directement lors de la création
    public Zoo(String name, String city, int nbrCages, Animal[] animals) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = animals;
        this.animalCount = animals.length;
    }

    // Méthode pour afficher les informations du zoo
    public void displayZoo() {
        System.out.println("Informations sur le zoo :");
        System.out.println("Nom du zoo : " + this.name);
        System.out.println("Ville : " + this.city);
        System.out.println("Nombre de cages : " + this.nbrCages);
        System.out.println("Nombre d'animaux : " + this.animalCount);
    }

    // Méthode pour ajouter un animal au zoo et retourner true si l'ajout a réussi
    public boolean addAnimal(Animal animal) {
        if (animalCount < animals.length) {
            animals[animalCount] = animal;
            animalCount++;
            return true;
        } else {
            System.out.println("Le zoo est plein. Impossible d'ajouter plus d'animaux.");
            return false;
        }
    }

    // Méthode toString pour afficher les informations du zoo
    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                ", animalCount=" + animalCount +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        // Création d'un zoo (myZoo) avec une capacité de 2 cages
        Zoo myZoo = new Zoo("Mon Zoo", "VilleZoo", 2);

        // Création de plusieurs animaux
        Animal lion = new Animal("Félin", "Simba", 5, true);
        Animal elephant = new Animal("Éléphantidé", "Dumbo", 3, true);
        Animal giraffe = new Animal("Girafe", "Melman", 4, true);
        Animal zebra = new Animal("Zèbre", "Marty", 2, true);

        // Ajout des animaux au zoo
        myZoo.addAnimal(lion);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(giraffe);
        myZoo.addAnimal(zebra);  // Tentative d'ajout d'un quatrième animal

        // Affichage des informations du zoo après l'ajout des animaux
        myZoo.displayZoo();
    }
}
*************
Instruction n°11:
        import java.util.Arrays;

public class Animal {
    // Attributs de la classe Animal
    String family;
    String name;
    int age;
    boolean isMammal;

    // Constructeur paramétré de la classe Animal
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    // Méthode toString pour afficher les informations de l'animal
    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}

public class Zoo {
    // Attributs de la classe Zoo
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    int animalCount; // Compteur d'animaux dans le zoo

    // Constructeur paramétré de la classe Zoo
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25];  // Initialisation du tableau d'animaux avec une capacité maximale de 25
        this.animalCount = 0;
    }

    // Constructeur paramétré pour ajouter des animaux au zoo directement lors de la création
    public Zoo(String name, String city, int nbrCages, Animal[] animals) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = animals;
        this.animalCount = animals.length;
    }

    // Méthode pour afficher les informations du zoo
    public void displayZoo() {
        System.out.println("Informations sur le zoo :");
        System.out.println("Nom du zoo : " + this.name);
        System.out.println("Ville : " + this.city);
        System.out.println("Nombre de cages : " + this.nbrCages);
        System.out.println("Nombre d'animaux : " + this.animalCount);
    }

    // Méthode pour ajouter un animal au zoo et retourner true si l'ajout a réussi
    public boolean addAnimal(Animal animal) {
        if (animalCount < animals.length) {
            animals[animalCount] = animal;
            animalCount++;
            return true;
        } else {
            System.out.println("Le zoo est plein. Impossible d'ajouter plus d'animaux.");
            return false;
        }
    }

    // Méthode pour afficher les animaux du zoo
    public void displayAnimals() {
        System.out.println("Liste des animaux du zoo :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    // Méthode pour chercher un animal par son nom et retourner son indice, ou -1 s'il n'est pas trouvé
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i; // Retourne l'indice de l'animal si trouvé
            }
        }
        return -1; // Retourne -1 si l'animal n'est pas trouvé
    }

    // Méthode toString pour afficher les informations du zoo
    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                ", animalCount=" + animalCount +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        // Création d'un zoo (myZoo) avec une capacité de 2 cages
        Zoo myZoo = new Zoo("Mon Zoo", "VilleZoo", 2);

        // Création d'animaux
        Animal lion = new Animal("Félin", "Simba", 5, true);
        Animal elephant = new Animal("Éléphantidé", "Dumbo", 3, true);

        // Ajout d'animaux au zoo
        myZoo.addAnimal(lion);
        myZoo.addAnimal(elephant);

        // Affichage des informations du zoo après l'ajout des animaux
        myZoo.displayZoo();

        // Affichage des animaux du zoo
        myZoo.displayAnimals();

        // Création d'un autre animal identique au premier (Simba)
        Animal simbaDuplicate = new Animal("Félin", "Simba", 5, true);

        // Recherche de l'animal dans le zoo
        int index = myZoo.searchAnimal(simbaDuplicate);

        // Affichage du résultat de la recherche
        if (index != -1) {
            System.out.println("\nL'animal a été trouvé à l'indice : " + index);
        } else {
            System.out.println("\nL'animal n'a pas été trouvé dans le zoo.");
        }
    }
}
****************
Instruction n°12:
        import java.util.ArrayList;

public class Zoo {
    // Attributs de la classe Zoo
    ArrayList<Animal> animals;
    String name;
    String city;
    int nbrCages;

    // Constructeur paramétré de la classe Zoo
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new ArrayList<>();
    }

    // Méthode pour afficher les informations du zoo
    public void displayZoo() {
        System.out.println("Informations sur le zoo :");
        System.out.println("Nom du zoo : " + this.name);
        System.out.println("Ville : " + this.city);
        System.out.println("Nombre de cages : " + this.nbrCages);
        System.out.println("Nombre d'animaux : " + this.animals.size());
    }

    // Méthode pour ajouter un animal au zoo et retourner true si l'ajout a réussi
    public boolean addAnimal(Animal animal) {
        // Vérifier si l'animal existe déjà dans le zoo
        if (!animals.contains(animal) && animals.size() < nbrCages) {
            animals.add(animal);
            return true;
        } else {
            System.out.println("Impossible d'ajouter l'animal. Il est déjà dans le zoo ou le zoo est plein.");
            return false;
        }
    }

    // Méthode pour afficher les animaux du zoo
    public void displayAnimals() {
        System.out.println("Liste des animaux du zoo :");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    // Méthode pour chercher un animal par son nom et retourner son indice, ou -1 s'il n'est pas trouvé
    public int searchAnimal(Animal animal) {
        return animals.indexOf(animal);
    }

    // Méthode toString pour afficher les informations du zoo
    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + animals +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }
}
*********************
Instruction n°13
        import java.util.ArrayList;

public class Zoo {
    // Attributs de la classe Zoo
    ArrayList<Animal> animals;
    String name;
    String city;
    int nbrCages;

    // Constructeur paramétré de la classe Zoo
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new ArrayList<>();
    }

    // Méthode pour afficher les informations du zoo
    public void displayZoo() {
        System.out.println("Informations sur le zoo :");
        System.out.println("Nom du zoo : " + this.name);
        System.out.println("Ville : " + this.city);
        System.out.println("Nombre de cages : " + this.nbrCages);
        System.out.println("Nombre d'animaux : " + this.animals.size());
    }

    // Méthode pour ajouter un animal au zoo et retourner true si l'ajout a réussi
    public boolean addAnimal(Animal animal) {
        // Vérifier si l'animal existe déjà dans le zoo
        if (!animals.contains(animal) && animals.size() < nbrCages) {
            animals.add(animal);
            return true;
        } else {
            System.out.println("Impossible d'ajouter l'animal. Il est déjà dans le zoo ou le zoo est plein.");
            return false;
        }
    }

    // Méthode pour supprimer un animal du zoo et retourner true si la suppression a réussi
    public boolean removeAnimal(Animal animal) {
        return animals.remove(animal);
    }

    // Méthode pour afficher les animaux du zoo
    public void displayAnimals() {
        System.out.println("Liste des animaux du zoo :");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    // Méthode pour chercher un animal par son nom et retourner son indice, ou -1 s'il n'est pas trouvé
    public int searchAnimal(Animal animal) {
        return animals.indexOf(animal);
    }

    // Méthode toString pour afficher les informations du zoo
    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + animals +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }
}

