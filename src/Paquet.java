import java.util.ArrayList;

public class Paquet {
    private final ArrayList<Carte> paquet = new ArrayList<>();

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
            permuter(carteIndex, Util.getInt(paquet.size()));
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
        Carte cartePiger;
        int derniereCarte = paquet.size() - 1;
        if(estVide())
            return null;


        cartePiger = paquet.get(derniereCarte);
        paquet.remove(derniereCarte);

        return cartePiger;
    }

    /**
     * Ajoute les 52 carte au paquet.
     */
    private void remplirPaquet() {
        for (String couleur : Carte.COULEURS_VALIDES) { //  Pour chaques couleurs.
            for (int valeur = 1; valeur < 13; valeur++) {  //  Pour chaque valeures.
                paquet.add(new Carte(valeur, couleur)); //  Cree une carte.
            }
        }
    }
}
