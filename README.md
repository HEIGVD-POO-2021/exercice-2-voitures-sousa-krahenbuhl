## Exercice Voitures

On considère des Personnes et des Voitures. Une personne peut être propriétaire de plusieurs voitures. Une voiture peut avoir au plus un propriétaire (voir chapitre UML).

Compléter le code ci-après pour implémenter la relation Personne-Voiture comme relation navigable dans les deux sens avec dans chaque classe des références sur l'autre classe. Veiller à ce que les référence restent toujours cohérentes.

    public class Voiture {
        private String marque;
        ...
        Voiture(String marque) { ... }
        void setProprietaire(Personne p) { ... }
        ...
    }

    public class Personne {
        private String nom;
        ...
        public Personne(String nom) { ... }
        public void ajouterVoiture(Voiture v) { ... }
        public void enleverVoiture(Voiture v) { ... }
        ...
    }

    class Main {
        public static void main(String[] args) {
            Personne paul = new Personne("Paul");
            Personne ringo = new Personne("Ringo");
            Voiture fiat = new Voiture("Fiat");
            Voiture audi = new Voiture("Audi");
            Voiture bmw = new Voiture("BMW");
            // Paul possède une Fiat
            paul.ajouterVoiture(fiat);
            // Paul possède une Audi
            paul.ajouterVoiture(audi);
            // Ringo possède une BMW
            ringo.ajouterVoiture(bmw);
            // Ringo vend sa BMW à Paul
            paul.ajouterVoiture(bmw);
        }
    }
    
## Informations complémentaires

### Intro aux LinkedList<T>

Java possède plusieurs types de Collections dont les “Tableaux” et les “LinkedList<T>”. Quelques prioriétés de LinkedList<T>:
- Une liste d’éléments doublement chainée, les éléments sont de type <T. T représente un type classe (*ne peut pas représenter un type primitif*). 
- Insertion et suppression d’élément en O(1)
- Accès à un noeud par index en O(n) 
- Recherche d’un noeud en O(n)
- Doublement chainée, e.g. navigable dans les deux sens
                                                                         
### Exemple d'opérations basiques sur une LinkedList<T>

    Voiture v = new Voiture(“bmw”);
    
    // Crée une nouvelle liste de Voitures. 
    LinkedList<Voiture> voitures = new LinkedList<Voiture>();
    
    // ajouter bmw à voitures: 
    voitures.add(v)
    
    // v est-il dans voitures?
    boolean hasVoiture = voitures.contains(v);
    
    // enlever v à voitures
    voitures.remove(v);
    
    // voir: https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html 
 



