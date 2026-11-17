package dz.univ.calculatrice;

/**
 * Contrat commun : chaque opération reçoit deux nombres réels,
 * retourne un résultat et fournit son symbole.
 */
public interface Operation {

    /**
     * Applique l'opération sur deux nombres.
     *
     * @param a premier nombre
     * @param b deuxième nombre
     * @return le résultat de l'opération
     */
    double apply(double a, double b);

    /**
     * Retourne le symbole de l'opération (ex. "+", "-").
     *
     * @return le symbole
     */
    String symbol();
}