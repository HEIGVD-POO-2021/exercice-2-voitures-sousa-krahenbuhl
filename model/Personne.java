package model;

import java.util.LinkedList;
import java.util.List;

/** Cette classe représente une Personne. Une Personne a un nom, et peut posséder des voitures. */
public class Personne {
    private final String nom;
    private final List<Voiture> voitures = new LinkedList<Voiture>();

    /**
     * Contructeur
     *
     * @param nom le nom de la personne
     */
    public Personne(String nom) {
        /* a compléter */
        throw new RuntimeException("Not implemented");
    }

    /** @returns le nom de la personne */
    public String getNom() {
        /* a compléter */
        throw new RuntimeException("Not implemented");
    }

    /**
     * Méthode permettant d'ajouter une voiture à la liste des voitures de la personne. Méthode
     * publique, peut être appellée par tous. Cette méthode maintient la cohérence.
     *
     * @param Voiture la voiture a ajouter.
     */
    public void ajouterVoiture(Voiture v) {
        /* a compléter */
        throw new RuntimeException("Not implemented");
    }

    /**
     * Méthode permettant d'enlever une voiture à la liste des voitures de la personne. Méthode
     * publique, peut être appellée par tous. Cette méthode maintient la cohérence. Après l'appel à
     * cette méthode la voiture n'aura plus de prioriétaire.
     *
     * @param Voiture la voiture a enlever.
     */
    public void enleverVoiture(Voiture v) {
        /* a compléter */
        throw new RuntimeException("Not implemented");
    }

    /**
     * Représentation d'une personne en forme de String.
     *
     * @returns une string représentant la personne avec les voitures qu'elle possède.
     */
    public String toString() {
        if (voitures.isEmpty()) {
            return nom + " ne possède aucune voiture.";
        }

        String str = nom + " possède: ";
        for (Voiture v : voitures) {
            str += v.getMarque() + "; ";
        }
        return str;
    }
}
