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
     * @return
     */

    public static int getInt(int max) {
        int min = 0;
        int b = (int)(Math.random()*(max-min)+min);
        return b;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("getInt(100) = " + getInt(100));
        }
    }
}
