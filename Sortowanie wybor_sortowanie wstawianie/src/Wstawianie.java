import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

class Wstawianie {
    public static void main(String[] args) {
        Random random = new Random();
        int[]tab = new int[10];
        for (int k = 0; k<tab.length; k++){
            tab[k] = random.nextInt(101);
        }

        System.out.println("Array before sorting: " + Arrays.toString(tab));

        for (int i = 0; i < tab.length; i++) {
            for (int j = i; j < tab.length; j++) {
                if (tab[j] <= tab[i]) {
                    int temp = tab[i];
                    tab[i] = tab[j];
                    tab[j] = temp;
                }
            }
        }
        System.out.println("Array after sorting: " + Arrays.toString(tab));
    }
}
