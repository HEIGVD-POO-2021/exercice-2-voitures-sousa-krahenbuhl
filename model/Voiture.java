package model;

/** Cette classe représente une voiture. Une voiture possède au maxium 1 propriétaire */
public class Voiture {
    private final String marque;
    private Personne proprietaire;

    /**
     * Construit une voiture d'une marque donnée.
     *
     * @param marque la marque de la voiture
     */
    public Voiture(String marque) {
        /* a compléter */
        throw new RuntimeException("Not implemented");
    }

    /**
     * Retourne la marque de la voiture
     *
     * @return la marque de la voiture
     */
    public String getMarque() {
        /* a compléter */
        throw new RuntimeException("Not implemented");
    }

    /**
     * Retourne le propriétaire de la voiture
     *
     * @returns le propriétaire de la voiture
     */
    public Personne getProprietaire() {
        /* a compléter */
        throw new RuntimeException("Not implemented");
    }

    /**
     * Définis ou redéfinis le propriétaire de la voiture en maintenant la cohérence. Méthode
     * publique (peut être appellée par tous)
     *
     * @param p le nouveau propriétaire de la voiture, ou null pour indiquer que la voiture n'a pas
     *     de propriétaire
     */
    public void setProprietaire(Personne p) {
        /* a compléter */
        throw new RuntimeException("Not implemented");
    }

    /**
     * Représentation d'une personne en forme de String.
     *
     * @returns une string représentant la personne avec les voitures qu'elle possède.
     */
    public String toString() {
        return "Voiture "
                + marque
                + (proprietaire != null
                        ? " (propriétaire: " + proprietaire.getNom() + ")"
                        : " (sans propriétaire)");
    }
}
