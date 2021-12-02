import java.security.InvalidParameterException;
/*
 *  Antoine-Matis Boudreau
 *  2139664
 *  Groupe 02
 */

public class Carte {
    public static final String[] COULEURS_VALIDES = {"pique", "trèfle", "carreau", "coeur"};
    public static final char[] COULEURS_CAR = {'\u2660', '\u2663', '\u2666', '\u2764'};

    private int couleurIndex;
    private int valeur;

    public Carte(int valeur, String couleur) {
        setValeur(valeur);
        setCouleur(couleur);
    }

    /**
     * Retourne la carte en format humain.
     */
    @Override
    public String toString() {
        return valeur + " de " + getCouleur() + " (" + getCharCarte() + ")";
    }

    public String getCouleur() {
        return COULEURS_VALIDES[couleurIndex];
    }

    public char getCharCarte() {
        return COULEURS_CAR[couleurIndex];
    }

    public int getValeur() {
        return valeur;
    }


    /**
     * Mutateur de couleur.
     * Accepte la couleur correspondante a COULEURS_VALIDES en ignorant la casse.
     * @param couleur doit etre valide.
     */
    public void setCouleur(String couleur) {
        if (couleurEstValide(couleur)) {
            this.couleurIndex = Util.trouverStr(couleur, COULEURS_VALIDES);
        } else {
            throw new InvalidParameterException("La couleur: " + couleur + " est invalide!");
        }
    }

    /**
     * Mutateur de valeur.
     * Accepte une valeur entre 1 et 13.
     *
     * @param valeur entre 1 et 13
     */
    public void setValeur(int valeur) {
        if (valeurEstValide(valeur)) {
            this.valeur = valeur;
        } else {
            throw new InvalidParameterException("La valeur: " + valeur + " est invalide!");
        }
    }

    /**
     * Test si la cauleur est valide
     * Une couleur valide est definie dans COULEURS_VALIDES
     *
     * @param couleur a regarder
     * @return validitee
     */
    public static boolean couleurEstValide(String couleur) {
        return Util.trouverStr(couleur, COULEURS_VALIDES) > -1;
    }

    /**
     * Test si la valeur est valide
     * Une valeur valide est entre 1 et 13 inclu
     *
     * @param valeur a tester
     * @return validitee
     */
    public static boolean valeurEstValide(int valeur) {
        return valeur >= 1 && valeur <= 13;
    }
}