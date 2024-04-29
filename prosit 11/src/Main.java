import java.util.HashMap;
public class AffectationHashMap {
    private HashMap<String, String> affectations; // Clé: Employé, Valeur: Département

    public AffectationHashMap() {
        affectations = new HashMap<>();
    }

    // Méthode pour affecter un employé à un département
    public void affecterEmploye(String employe, String departement) {
        affectations.put(employe, departement);
    }

    // Méthode pour obtenir le département d'un employé
    public String obtenirDepartement(String employe) {
        return affectations.get(employe);
    }

    // Méthode pour supprimer une affectation d'un employé
    public void supprimerAffectation(String employe) {
        affectations.remove(employe);
    }

    // Méthode pour vérifier si un employé est déjà affecté
    public boolean estAffecte(String employe) {
        return affectations.containsKey(employe);
    }

    // Méthode pour vérifier si un département est déjà affecté
    public boolean estDepartementAffecte(String departement) {
        return affectations.containsValue(departement);
    }

    // Méthode pour obtenir le nombre total d'affectations
    public int nombreAffectations() {
        return affectations.size();
    }

    // Méthode pour afficher toutes les affectations
    public void afficherAffectations() {
        for (String employe : affectations.keySet()) {
            String departement = affectations.get(employe);
            System.out.println("Employé: " + employe + ", Département: " + departement);
        }
    }

    public static void main(String[] args) {
        AffectationHashMap affectationMap = new AffectationHashMap();

        // Exemple d'utilisation
        affectationMap.affecterEmploye("John", "Développement");
        affectationMap.affecterEmploye("Alice", "Ressources Humaines");
        affectationMap.affecterEmploye("Bob", "Développement");

        affectationMap.afficherAffectations();

        System.out.println("Le département de John est : " + affectationMap.obtenirDepartement("John"));

        affectationMap.supprimerAffectation("Bob");

        affectationMap.afficherAffectations();
    }
}

               import java.util.HashMap;

// Classe Employe
class Employe {
    private String nom;

    public Employe(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
}

// Classe Departement
     class Departement {
    private String nom;

    public Departement(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
}

// Classe AffectationHashMap
     public class AffectationHashMap {
    private HashMap<Employe, Departement> affectations; // Clé: Employe, Valeur: Departement

    public AffectationHashMap() {
        affectations = new HashMap<>();
    }

    // Méthode pour affecter un employé à un département
    public void affecterEmploye(Employe employe, Departement departement) {
        affectations.put(employe, departement);
    }

    // Méthode pour obtenir le département d'un employé
    public Departement obtenirDepartement(Employe employe) {
        return affectations.get(employe);
    }

    // Méthode pour ajouter un employé à un département
    public void ajouterEmployeDepartement(Employe employe, Departement departement) {
        if (!affectations.containsKey(employe)) {
            affecterEmploye(employe, departement);
            System.out.println("L'employé " + employe.getNom() + " a été affecté au département " + departement.getNom());
        } else {
            System.out.println("L'employé " + employe.getNom() + " est déjà affecté à un département.");
        }
    }

    public static void main(String[] args) {
        AffectationHashMap affectationMap = new AffectationHashMap();

        // Création des employés et des départements
        Employe john = new Employe("John");
        Employe alice = new Employe("Alice");
        Departement dev = new Departement("Développement");
        Departement rh = new Departement("Ressources Humaines");

        // Exemple d'utilisation
        affectationMap.ajouterEmployeDepartement(john, dev);
        affectationMap.ajouterEmployeDepartement(alice, rh);
        affectationMap.ajouterEmployeDepartement(john, rh); // Déjà affecté
    }
}

         import java.util.HashMap;

// Classe Employe
class Employe {
    private String nom;

    public Employe(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
}

// Classe Departement
class Departement {
    private String nom;

    public Departement(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
}

// Classe AffectationHashMap
    public class AffectationHashMap {
    private HashMap<Employe, Departement> affectations; // Clé: Employe, Valeur: Departement

    public AffectationHashMap() {
        affectations = new HashMap<>();
    }

    // Méthode pour affecter un employé à un département
    public void affecterEmploye(Employe employe, Departement departement) {
        affectations.put(employe, departement);
    }

    // Méthode pour obtenir le département d'un employé
    public Departement obtenirDepartement(Employe employe) {
        return affectations.get(employe);
    }

    // Méthode pour ajouter un employé à un département
    public void ajouterEmployeDepartement(Employe employe, Departement departement) {
        if (!affectations.containsKey(employe)) {
            affecterEmploye(employe, departement);
            System.out.println("L'employé " + employe.getNom();
        }
    }
    import java.util.HashMap;

    // Classe Employe
    class Employe {
        private String nom;

        public Employe(String nom) {
            this.nom = nom;
        }

        public String getNom() {
            return nom;
        }
    }

    // Classe Departement
    class Departement {
        private String nom;

        public Departement(String nom) {
            this.nom = nom;
        }

        public String getNom() {
            return nom;
        }
    }

    // Classe AffectationHashMap
    public class AffectationHashMap {
        private HashMap<Employe, Departement> affectations; // Clé: Employe, Valeur: Departement

        public AffectationHashMap() {
            affectations = new HashMap<>();
        }

        // Méthode pour affecter un employé à un département
        public void affecterEmploye(Employe employe, Departement departement) {
            affectations.put(employe, departement);
        }

        // Méthode pour obtenir le département d'un employé
        public Departement obtenirDepartement(Employe employe) {
            return affectations.get(employe);
        }

        // Méthode pour ajouter un employé à un département
        public void ajouterEmployeDepartement(Employe employe, Departement departement) {
            if (!affectations.containsKey(employe)) {
                affecterEmploye(employe, departement);
                System.out.println("L'employé " + employe.getNom() + " a été affecté au département " + departement.getNom());
            } else {
                System.out.println("L'employé " + employe.getNom() + " est déjà affecté à un département.");
            }
        }

        // Méthode pour supprimer un employé de la collection
        public void supprimerEmploye(Employe employe) {
            if (affectations.containsKey(employe)) {
                affectations.remove(employe);
                System.out.println("L'employé " + employe.getNom() + " a été supprimé de la collection.");
            } else {
                System.out.println("L'employé " + employe.getNom() + " n'existe pas dans la collection.");
            }
        }

        // Méthode pour afficher les employés et les départements auxquels ils sont affectés
        public void afficherEmployesEtDepartements() {
            System.out.println("Affectations des employés:");
            for (Employe employe : affectations.keySet()) {
                Departement departement = affectations.get(employe);
                System.out.println("Employé: " + employe.getNom() + ", Département: " + departement.getNom());
            }
        }

        public static void main(String[] args) {
            AffectationHashMap affectationMap = new AffectationHashMap();

            // Création des employés et des départements
            Employe john = new Employe("John");
            Employe alice = new Employe("Alice");
            Departement dev = new Departement("Développement");

            // Ajout d'employés aux départements
            affectationMap.ajouterEmployeDepartement(john, dev);
            affectationMap.ajouterEmployeDepartement(alice, dev);

            // Affichage de toutes les affectations
            affectationMap.afficherEmployesEtDepartements();

            // Suppression d'un employé
            affectationMap.supprimerEmploye(john);

            // Affichage après suppression
            affectationMap.afficherEmployesEtDepartements();
        }
    }
    import java.util.HashMap;

    // Classe Employe
    class Employe {
        private String nom;

        public Employe(String nom) {
            this.nom = nom;
        }

        public String getNom() {
            return nom;
        }
    }

    // Classe Departement
    class Departement {
        private String nom;

        public Departement(String nom) {
            this.nom = nom;
        }

        public String getNom() {
            return nom;
        }
    }

    // Classe AffectationHashMap
    public class AffectationHashMap {
        private HashMap<Employe, Departement> affectations; // Clé: Employe, Valeur: Departement

        public AffectationHashMap() {
            affectations = new HashMap<>();
        }

        // Méthode pour affecter un employé à un département
        public void affecterEmploye(Employe employe, Departement departement) {
            affectations.put(employe, departement);
        }

        // Méthode pour obtenir le département d'un employé
        public Departement obtenirDepartement(Employe employe) {
            return affectations.get(employe);
        }

        // Méthode pour ajouter un employé à un département
        public void ajouterEmployeDepartement(Employe employe, Departement departement) {
            if (!affectations.containsKey(employe)) {
                affecterEmploye(employe, departement);
                System.out.println("L'employé " + employe.getNom() + " a été affecté au département " + departement.getNom());
            } else {
                System.out.println("L'employé " + employe.getNom() + " est déjà affecté à un département.");
            }
        }

        // Méthode pour supprimer un employé de la collection
        public void supprimerEmploye(Employe employe) {
            if (affectations.containsKey(employe)) {
                affectations.remove(employe);
                System.out.println("L'employé " + employe.getNom() + " a été supprimé de la collection.");
            } else {
                System.out.println("L'employé " + employe.getNom() + " n'existe pas dans la collection.");
            }
        }

        // Méthode pour supprimer un employé d'un département spécifique
        public void supprimerEmployeEtDepartement(Employe employe, Departement departement) {
            if (affectations.containsKey(employe) && affectations.get(employe).equals(departement)) {
                affectations.remove(employe);
                System.out.println("L'employé " + employe.getNom() + " travaillant dans le département " + departement.getNom() + " a été supprimé de la collection.");
            } else {
                System.out.println("L'employé " + employe.getNom() + " ne travaille pas dans le département " + departement.getNom() + ".");
            }
        }

        // Méthode pour afficher les employés et les départements auxquels ils sont affectés
        public void afficherEmployesEtDepartements() {
            System.out.println("Affectations des employés:");
            for (Employe employe : affectations.keySet()) {
                Departement departement = affectations.get(employe);
                System.out.println("Employé: " + employe.getNom() + ", Département: " + departement.getNom());
            }
        }

        public static void main(String[] args) {
            AffectationHashMap affectationMap = new AffectationHashMap();

            // Création des employés et des départements
            Employe john = new Employe("John");
            Employe alice = new Employe("Alice");
            Departement dev = new Departement("Développement");
            Departement rh = new Departement("Ressources Humaines");

            // Ajout d'employés aux départements
            affectationMap.ajouterEmployeDepartement(john, dev);
            affectationMap.ajouterEmployeDepartement(alice, rh);

            // Affichage de toutes les affectations
            affectationMap.afficherEmployesEtDepartements();

            // Suppression d'un employé d'un département spécifique
            affectationMap.supprimerEmployeEtDepartement(john, dev);

            // Affichage après suppression
            affectationMap.afficherEmployesEtDepartements();
        }
    }
import java.util.HashMap;

    // Classe Employe
    class Employe {
        private String nom;

        public Employe(String nom) {
            this.nom = nom;
        }

        public String getNom() {
            return nom;
        }
    }

    // Classe Departement
    class Departement {
        private String nom;

        public Departement(String nom) {
            this.nom = nom;
        }

        public String getNom() {
            return nom;
        }
    }

    // Classe AffectationHashMap
    public class AffectationHashMap {
        private HashMap<Employe, Departement> affectations; // Clé: Employe, Valeur: Departement

        public AffectationHashMap() {
            affectations = new HashMap<>();
        }

        // Méthode pour affecter un employé à un département
        public void affecterEmploye(Employe employe, Departement departement) {
            affectations.put(employe, departement);
        }

        // Méthode pour obtenir le département d'un employé
        public Departement obtenirDepartement(Employe employe) {
            return affectations.get(employe);
        }

        // Méthode pour ajouter un employé à un département
        public void ajouterEmployeDepartement(Employe employe, Departement departement) {
            if (!affectations.containsKey(employe)) {
                affecterEmploye(employe, departement);
                System.out.println("L'employé " + employe.getNom() + " a été affecté au département " + departement.getNom());
            } else {
                System.out.println("L'employé " + employe.getNom() + " est déjà affecté à un département.");
            }
        }

        // Méthode pour supprimer un employé de la collection
        public void supprimerEmploye(Employe employe) {
            if (affectations.containsKey(employe)) {
                affectations.remove(employe);
                System.out.println("L'employé " + employe.getNom() + " a été supprimé de la collection.");
            } else {
                System.out.println("L'employé " + employe.getNom() + " n'existe pas dans la collection.");
            }
        }

        // Méthode pour supprimer un employé d'un département spécifique
        public void supprimerEmployeEtDepartement(Employe employe, Departement departement) {
            if (affectations.containsKey(employe) && affectations.get(employe).equals(departement)) {
                affectations.remove(employe);
                System.out.println("L'employé " + employe.getNom() + " travaillant dans le département " + departement.getNom() + " a été supprimé de la collection.");
            } else {
                System.out.println("L'employé " + employe.getNom() + " ne travaille pas dans le département " + departement.getNom() + ".");
            }
        }

        // Méthode pour afficher la liste des employés
        public void afficherEmployes() {
            System.out.println("Liste des employés:");
            for (Employe employe : affectations.keySet()) {
                System.out.println(employe.getNom());
            }
        }

        // Méthode pour afficher les employés et les départements auxquels ils sont affectés
        public void afficherEmployesEtDepartements() {
            System.out.println("Affectations des employés:");
            for (Employe employe : affectations.keySet()) {
                Departement departement = affectations.get(employe);
                System.out.println("Employé: " + employe.getNom() + ", Département: " + departement.getNom());
            }
        }

        public static void main(String[] args) {    //Programme Principal
            AffectationHashMap affectationMap = new AffectationHashMap();

            // Création des employés et des départements
            Employe john = new Employe("John");
            Employe alice = new Employe("Alice");
            Employe bob = new Employe("Bob");
            Departement dev = new Departement("Développement");
            Departement rh = new Departement("Ressources Humaines");

            // Ajout d'employés aux départements
            affectationMap.ajouterEmployeDepartement(john, dev);
            affectationMap.ajouterEmployeDepartement(alice, rh);
            affectationMap.ajouterEmployeDepartement(bob, dev);

            // Affichage de la liste des employés
            affectationMap.afficherEmployes();
        }
    }
   import java.util.HashMap;
  import java.util.HashSet;
  import java.util.Set;

    // Classe Employe
    class Employe {
        private String nom;

        public Employe(String nom) {
            this.nom = nom;
        }

        public String getNom() {
            return nom;
        }
    }

    // Classe Departement
    class Departement {
        private String nom;

        public Departement(String nom) {
            this.nom = nom;
        }

        public String getNom() {
            return nom;
        }
    }

    // Classe AffectationHashMap
    public class AffectationHashMap {
        private HashMap<Employe, Departement> affectations; // Clé: Employe, Valeur: Departement

        public AffectationHashMap() {
            affectations = new HashMap<>();
        }

        // Méthode pour affecter un employé à un département
        public void affecterEmploye(Employe employe, Departement departement) {
            affectations.put(employe, departement);
        }

        // Méthode pour obtenir le département d'un employé
        public Departement obtenirDepartement(Employe employe) {
            return affectations.get(employe);
        }

        // Méthode pour ajouter un employé à un département
        public void ajouterEmployeDepartement(Employe employe, Departement departement) {
            if (!affectations.containsKey(employe)) {
                affecterEmploye(employe, departement);
                System.out.println("L'employé " + employe.getNom() + " a été affecté au département " + departement.getNom());
            } else {
                System.out.println("L'employé " + employe.getNom() + " est déjà affecté à un département.");
            }
        }

        // Méthode pour supprimer un employé de la collection
        public void supprimerEmploye(Employe employe) {
            if (affectations.containsKey(employe)) {
                affectations.remove(employe);
                System.out.println("L'employé " + employe.getNom() + " a été supprimé de la collection.");
            } else {
                System.out.println("L'employé " + employe.getNom() + " n'existe pas dans la collection.");
            }
        }

        // Méthode pour supprimer un employé d'un département spécifique
        public void supprimerEmployeEtDepartement(Employe employe, Departement departement) {
            if (affectations.containsKey(employe) && affectations.get(employe).equals(departement)) {
                affectations.remove(employe);
                System.out.println("L'employé " + employe.getNom() + " travaillant dans le département " + departement.getNom() + " a été supprimé de la collection.");
            } else {
                System.out.println("L'employé " + employe.getNom() + " ne travaille pas dans le département " + departement.getNom() + ".");
            }
        }

        // Méthode pour afficher la liste des employés
        public void afficherEmployes() {
            System.out.println("Liste des employés:");
            for (Employe employe : affectations.keySet()) {
                System.out.println(employe.getNom());
            }
        }

        // Méthode pour afficher la liste des départements
        public void afficherDepartements() {
            Set<String> departements = new HashSet<>();
            for (Departement departement : affectations.values()) {
                departements.add(departement.getNom());
            }
            System.out.println("Liste des départements:");
            for (String nomDepartement : departements) {
                System.out.println(nomDepartement);
            }
        }

        // Méthode pour afficher les employés et les départements auxquels ils sont affectés
        public void afficherEmployesEtDepartements() {
            System.out.println("Affectations des employés:");
            for (Employe employe : affectations.keySet()) {
                Departement departement = affectations.get(employe);
                System.out.println("Employé: " + employe.getNom() + ", Département: " + departement.getNom());
            }
        }

        public static void main(String[] args) {
            AffectationHashMap affectationMap = new AffectationHashMap();

            // Création des employés et des départements
            Employe john = new Employe("John");
            Employe alice = new Employe("Alice");
            Employe bob = new Employe("Bob");
            Departement dev = new Departement("Développement");
            Departement rh = new Departement("Ressources Humaines");

            // Ajout d'employés aux départements
            affectationMap.ajouterEmployeDepartement(john, dev);
            affectationMap.ajouterEmployeDepartement(alice, rh);
            affectationMap.ajouterEmployeDepartement(bob, dev);

            // Affichage de la liste des départements
            affectationMap.afficherDepartements();
        }
    }
import java.util.HashMap;

    // Classe Employe
    class Employe {
        private String nom;

        public Employe(String nom) {
            this.nom = nom;
        }

        public String getNom() {
            return nom;
        }
    }

    // Classe Departement
    class Departement {
        private String nom;

        public Departement(String nom) {
            this.nom = nom;
        }

        public String getNom() {
            return nom;
        }
    }

    // Classe AffectationHashMap
    public class AffectationHashMap {
        private HashMap<Employe, Departement> affectations; // Clé: Employe, Valeur: Departement

        public AffectationHashMap() {
            affectations = new HashMap<>();
        }

        // Méthode pour affecter un employé à un département
        public void affecterEmploye(Employe employe, Departement departement) {
            affectations.put(employe, departement);
        }

        // Méthode pour obtenir le département d'un employé
        public Departement obtenirDepartement(Employe employe) {
            return affectations.get(employe);
        }

        // Méthode pour ajouter un employé à un département
        public void ajouterEmployeDepartement(Employe employe, Departement departement) {
            if (!affectations.containsKey(employe)) {
                affecterEmploye(employe, departement);
                System.out.println("L'employé " + employe.getNom() + " a été affecté au département " + departement.getNom());
            } else {
                System.out.println("L'employé " + employe.getNom() + " est déjà affecté à un département.");
            }
        }

        // Méthode pour supprimer un employé de la collection
        public void supprimerEmploye(Employe employe) {
            if (affectations.containsKey(employe)) {
                affectations.remove(employe);
                System.out.println("L'employé " + employe.getNom() + " a été supprimé de la collection.");
            } else {
                System.out.println("L'employé " + employe.getNom() + " n'existe pas dans la collection.");
            }
        }

        // Méthode pour supprimer un employé d'un département spécifique
        public void supprimerEmployeEtDepartement(Employe employe, Departement departement) {
            if (affectations.containsKey(employe) && affectations.get(employe).equals(departement)) {
                affectations.remove(employe);
                System.out.println("L'employé " + employe.getNom() + " travaillant dans le département " + departement.getNom() + " a été supprimé de la collection.");
            } else {
                System.out.println("L'employé " + employe.getNom() + " ne travaille pas dans le département " + departement.getNom() + ".");
            }
        }

        // Méthode pour afficher la liste des employés
        public void afficherEmployes() {
            System.out.println("Liste des employés:");
            for (Employe employe : affectations.keySet()) {
                System.out.println(employe.getNom());
            }
        }

        // Méthode pour afficher la liste des départements
        public void afficherDepartements() {
            System.out.println("Liste des départements:");
            for (Departement departement : affectations.values()) {
                System.out.println(departement.getNom());
            }
        }

        // Méthode pour afficher les employés et les départements auxquels ils sont affectés
        public void afficherEmployesEtDepartements() {
            System.out.println("Affectations des employés:");
            for (Employe employe : affectations.keySet()) {
                Departement departement = affectations.get(employe);
                System.out.println("Employé: " + employe.getNom() + ", Département: " + departement.getNom());
            }
        }

        // Méthode pour rechercher l'existence d'un employé dans la collection
        public boolean rechercherEmploye(Employe employe) {
            return affectations.containsKey(employe);
        }

        public static void main(String[] args) {
            AffectationHashMap affectationMap = new AffectationHashMap();

            // Création des employés et des départements
            Employe john = new Employe("John");
            Employe alice = new Employe("Alice");
            Departement dev = new Departement("Développement");
            Departement rh = new Departement("Ressources Humaines");

            // Ajout d'employés aux départements
            affectationMap.ajouterEmployeDepartement(john, dev);
            affectationMap.ajouterEmployeDepartement(alice, rh);

            // Recherche d'employés dans la collection
            System.out.println("John existe dans la collection ? " + affectationMap.rechercherEmploye(john));
            System.out.println("Alice existe dans la collection ? " + affectationMap.rechercherEmploye(alice));
            System.out.println("Un nouvel employé existe dans la collection ? " + affectationMap.rechercherEmploye(new Employe("Jane")));
        }
    }
import java.util.HashMap;

    // Classe Employe
    class Employe {
        private String nom;

        public Employe(String nom) {
            this.nom = nom;
        }

        public String getNom() {
            return nom;
        }
    }

    // Classe Departement
    class Departement {
        private String nom;

        public Departement(String nom) {
            this.nom = nom;
        }

        public String getNom() {
            return nom;
        }
    }

    // Classe AffectationHashMap
    public class AffectationHashMap {
        private HashMap<Employe, Departement> affectations; // Clé: Employe, Valeur: Departement

        public AffectationHashMap() {
            affectations = new HashMap<>();
        }

        // Méthode pour affecter un employé à un département
        public void affecterEmploye(Employe employe, Departement departement) {
            affectations.put(employe, departement);
        }

        // Méthode pour obtenir le département d'un employé
        public Departement obtenirDepartement(Employe employe) {
            return affectations.get(employe);
        }

        // Méthode pour ajouter un employé à un département
        public void ajouterEmployeDepartement(Employe employe, Departement departement) {
            if (!affectations.containsKey(employe)) {
                affecterEmploye(employe, departement);
                System.out.println("L'employé " + employe.getNom() + " a été affecté au département " + departement.getNom());
            } else {
                System.out.println("L'employé " + employe.getNom() + " est déjà affecté à un département.");
            }
        }

        // Méthode pour supprimer un employé de la collection
        public void supprimerEmploye(Employe employe) {
            if (affectations.containsKey(employe)) {
                affectations.remove(employe);
                System.out.println("L'employé " + employe.getNom() + " a été supprimé de la collection.");
            } else {
                System.out.println("L'employé " + employe.getNom() + " n'existe pas dans la collection.");
            }
        }
        // Méthode pour supprimer un employé d'un département spécifique
        public void supprimerEmployeEtDepartement(Employe employe, Departement departement) {
            if (affectations.containsKey(employe) && affectations.get(employe).equals(departement)) {
                affectations.remove(employe);
                System.out.println("L'employé " + employe.getNom() + " travaillant dans le département " + departement.getNom() + " a été supprimé de la collection.");
            }
        }
        import java.util.ArrayList;

// Définition de la classe Departement
class Departement {
    private String nom;

    public Departement(String nom) {
        this.nom = nom;
                    }

                    public String getNom() {
                        return nom;
                    }
                }

// Classe représentant votre collection de départements
                class CollectionDepartements {
                    private ArrayList<Departement> departements;

                    public CollectionDepartements() {
                        this.departements = new ArrayList<>();
                    }

                    // Méthode pour ajouter un département à la collection
                    public void ajouterDepartement(Departement d) {
                        departements.add(d);
                    }

                    // Méthode pour rechercher un département dans la collection
                    public boolean rechercherDepartement(Departement d) {
                        for (Departement departement : departements) {
                            if (departement.getNom().equals(d.getNom())) {
                                return true; // Le département existe dans la collection
                            }
                        }
                        return false; // Le département n'existe pas dans la collection
                    }
                }

// Exemple d'utilisation
                public class Main {
                    public static void main(String[] args) {
                        CollectionDepartements collection = new CollectionDepartements();

                        // Ajout de quelques départements à la collection
                        collection.ajouterDepartement(new Departement("Ain"));
                        collection.ajouterDepartement(new Departement("Aisne"));
                        collection.ajouterDepartement(new Departement("Allier"));

                        // Test de recherche de département
                        Departement departementRecherche1 = new Departement("Aisne");
                        Departement departementRecherche2 = new Departement("Hauts-de-Seine");

                        System.out.println("La collection contient Aisne : " + collection.rechercherDepartement(departementRecherche1));
                        System.out.println("La collection contient Hauts-de-Seine : " + collection.rechercherDepartement(departementRecherche2));
                    }
                }
import java.util.*;

        // Définition de la classe Employe
        class Employe implements Comparable<Employe> {
            private int id;
            private String nom;

            public Employe(int id, String nom) {
                this.id = id;
                this.nom = nom;
            }

            public int getId() {
                return id;
            }

            public String getNom() {
                return nom;
            }

            @Override
            public int compareTo(Employe autreEmploye) {
                return Integer.compare(this.id, autreEmploye.getId());
            }

            @Override
            public String toString() {
                return "Employe{id=" + id + ", nom='" + nom + "'}";
            }
        }

        // Exemple de classe Departement
        class Departement {
            private String nom;

            public Departement(String nom) {
                this.nom = nom;
            }

            public String getNom() {
                return nom;
            }
        }

        // Classe contenant la méthode trierMap
        public class GestionEmployes {
            public static TreeMap<Employe, Departement> trierMap(Map<Employe, Departement> map) {
                TreeMap<Employe, Departement> sortedMap = new TreeMap<>(map);
                return sortedMap;
            }

            // Méthode main pour tester
            public static void main(String[] args) {
                HashMap<Employe, Departement> map = new HashMap<>();
                map.put(new Employe(101, "Alice"), new Departement("RH"));
                map.put(new Employe(103, "Bob"), new Departement("Finance"));
                map.put(new Employe(102, "Charlie"), new Departement("IT"));

                TreeMap<Employe, Departement> sortedMap = trierMap(map);

                // Affichage de la map triée
                for (Map.Entry<Employe, Departement> entry : sortedMap.entrySet()) {
                    System.out.println(entry.getKey() + " travaille au département " + entry.getValue().getNom());
                }
            }
        }
