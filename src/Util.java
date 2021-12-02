public class Util {
    public static int trouverStr(String maChaine, String[] tab) {
        int indexDeLaChaine;
        for (int i = 0; i < tab.length; i++) {
            if (maChaine.equalsIgnoreCase(tab[i])) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Fourni un nombre aleatoire
     */

    public static int getInt(int max) {
        int min = 0;
        return (int)(Math.random()*(max-min)+min);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("getInt(100) = " + getInt(100));
        }
    }
}