package _1poo._01encapsulation;

public class Main {
    public static void main(String[] args) {
        CompteBancaire compte = new CompteBancaire("Alice", 500);
        System.out.println(compte); // Compte de Alice — solde : 500.0 €

        // ✅ Opérations métier : le solde évolue de manière contrôlée
        compte.deposer(200);
        System.out.println("Après dépôt de 200 : " + compte.getSolde()); // 700.0

        compte.retirer(150);
        System.out.println("Après retrait de 150 : " + compte.getSolde()); // 550.0

        // ❌ Impossible : compte.setSolde(1_000_000) → la méthode n'existe pas !

        // ❌ Impossible : retirer plus que le solde → exception
        try {
            compte.retirer(9999);
        } catch (IllegalStateException e) {
            System.out.println("Erreur attrapée : " + e.getMessage());
        }

        // ❌ Impossible : déposer un montant négatif → exception
        try {
            compte.deposer(-100);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur attrapée : " + e.getMessage());
        }
    }
}

