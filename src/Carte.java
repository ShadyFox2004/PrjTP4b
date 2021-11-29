public class Carte {
    public static final String[] COULEURS_VALIDES = {"pique", "trèfle", "carreau", "coeur"};
    public static final char[] COULEURS_CAR = {'\u2660', '\u2663', '\u2666', '\u2764'};

    private String couleur;
    private char charCarte;
    private int valeur;

    public Carte(int valeur, String couleur) {
        this.valeur = valeur;
        this.couleur = couleur;
    }

    public static boolean couleurEstValide(String couleur) {
        return true;
    }

    public static boolean valeurEstValide(int valeur) {
        return true;
    }

    public static void main(String[] args) {

    }

    @Override
    public String toString() {
        return "Carte{" +
                "couleur='" + couleur + '\'' +
                ", charCarte=" + charCarte +
                ", valeur=" + valeur +
                '}';
    }
}
