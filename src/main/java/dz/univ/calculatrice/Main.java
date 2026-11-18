package dz.univ.calculatrice;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/**
 * Point d'entrée : interface en ligne de commande de la calculatrice.
 */
public final class Main {

    private static final Map<Integer, Operation> OPERATIONS = Map.of(
            1, new AddOperation(),
            2, new SubtractOperation());

    private Main() {
    }

    /**
     * Affiche le menu, lit les entrées, appelle l'opération et affiche le résultat.
     *
     * @param args arguments de la ligne de commande (non utilisés)
     */
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        boolean continuer = true;

        while (continuer) {
            afficherMenu();
            final int choix = lireEntier(scanner, "Votre choix : ");

            if (choix == 0) {
                continuer = false;
                System.out.println("Au revoir !");
            } else if (OPERATIONS.containsKey(choix)) {
                final Operation operation = OPERATIONS.get(choix);
                final double premier = lireNombre(scanner, "Premier nombre : ");
                final double deuxieme = lireNombre(scanner, "Deuxième nombre : ");
                final double resultat = operation.apply(premier, deuxieme);
                System.out.println("Résultat : " + resultat);
            } else {
                System.out.println("Choix invalide, veuillez réessayer.");
            }
        }
    }

    private static void afficherMenu() {
        System.out.println();
        System.out.println("===== CALCULATRICE CLI v1.0 =====");
        System.out.println("1. Addition");
        System.out.println("2. Soustraction");
        System.out.println("0. Quitter");
    }

    private static int lireEntier(final Scanner scanner, final String message) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.print("Entrée invalide, entrez un nombre entier : ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static double lireNombre(final Scanner scanner, final String message) {
        System.out.print(message);
        while (!scanner.hasNextDouble()) {
            System.out.print("Entrée invalide, entrez un nombre (ex. 12.5) : ");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}