package _1poo._01encapsulation;

/**
 * Exemple d'encapsulation "vraie" :
 * - pas de setSolde() → impossible de tricher sur le solde
 * - le solde ne peut évoluer que via des opérations métier (deposer / retirer)
 * - les règles métier (pas de retrait si solde insuffisant) sont protégées dans la classe
 */
public class CompteBancaire {
    private String titulaire;
    private double solde;

    public CompteBancaire(String titulaire, double soldeInitial) {
        this.titulaire = titulaire;
        this.solde = soldeInitial;
    }

    // Pas de setSolde() ! On ne peut pas écrire compte.setSolde(1_000_000)

    public double getSolde() {
        return solde;
    }

    public String getTitulaire() {
        return titulaire;
    }

    /**
     * Déposer de l'argent — seule façon d'augmenter le solde.
     */
    public void deposer(double montant) {
        if (montant <= 0) {
            throw new IllegalArgumentException("Le montant doit être positif !");
        }
        this.solde += montant;
    }

    /**
     * Retirer de l'argent — seule façon de diminuer le solde.
     * Impossible de retirer plus que ce qu'on a.
     */
    public void retirer(double montant) {
        if (montant <= 0) {
            throw new IllegalArgumentException("Le montant doit être positif !");
        }
        if (montant > this.solde) {
            throw new IllegalStateException(
                "Solde insuffisant ! Solde actuel : " + this.solde + " €, retrait demandé : " + montant + " €"
            );
        }
        this.solde -= montant;
    }

    @Override
    public String toString() {
        return "Compte de " + titulaire + " — solde : " + solde + " €";
    }
}

