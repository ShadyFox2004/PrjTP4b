import java.util.ArrayList;

public class Paquet {
    private final ArrayList<Carte> paquet = new ArrayList<>();

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        for (Carte carte : paquet) {
            output.append(carte);
        }

        return output.toString();
    }

    public Paquet(boolean estBrasser) {
        remplirPaquet();
        if (estBrasser) {
            melanger();
        }
    }


    /**
     * Retourne le nombre de cartes dans le paquet.
     */
    public int getNombreDeCartes() {
        return paquet.size();
    }

    /**
     * Retourne true si le paquet est vide.
     */
    public boolean estVide() {
        return getNombreDeCartes() == 0;
    }

    /**
     * Change l'ordre des cartes.
     */
    private void melanger() {
        for (int carteIndex = 0; carteIndex < paquet.size(); carteIndex++) {
            Carte carte = prend(Util.getInt(paquet.size()));
            paquet.add(carte);
        }
    }

    /**
     * Echange carte1 et carte2
     */
    private void permuter(int carte1Index, int carte2Index) {
        Carte premiereCarte = paquet.get(carte1Index);
        Carte deuxiemeCarte = paquet.get(carte2Index);

        paquet.set(carte2Index, premiereCarte);
        paquet.set(carte2Index, deuxiemeCarte);
    }

    /**
     * Pige une carte dans le paquet et la retire
     * @return la carte piger.
     */
    public Carte piger() {
        return prend(0);
    }

    /**
     * Prend une carte en l'enlevent du paquet
     */
    private Carte prend(int position) {
        Carte cartePiger;
        if(estVide())
            return null;

        cartePiger = paquet.get(position);
        paquet.remove(position);

        return cartePiger;
    }

    /**
     * Ajoute les 52 carte au paquet.
     */
    private void remplirPaquet() {
        for (String couleur : Carte.COULEURS_VALIDES) { //  Pour chaques couleurs.
            for (int valeur = 1; valeur <= 13; valeur++) {  //  Pour chaque valeures.
                paquet.add(new Carte(valeur, couleur)); //  Cree une carte.
            }
        }
    }

    public static void main(String[] args) {
        Paquet a = new Paquet(false);
        a.permuter(3,1);
        System.out.println("a = " + a);
    }
}
