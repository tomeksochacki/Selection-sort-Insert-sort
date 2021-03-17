import java.util.Arrays;
import java.util.Random;
class Wybieranie {
    public static void main(String[] args) {
        int[] tab = new int[10];
        Random random = new Random();
        for (int g = 0; g < tab.length; g++) {
            tab[g] = random.nextInt(100);
        }
        System.out.println("Tab nie posortowana: " + Arrays.toString(tab));
        for (int h = 0; h < tab.length; h++) {

            //int counter = 0;
            int index = 0;
            int min = tab[h];
            for (int i = h; i < tab.length; i++) {
                if (tab[i] < min) {
                    min = tab[i];
                    //counter++;
                    index = i;
                }
            }
            if (tab[h] == min) {
                continue;
            } else {
                int temp;
                temp = tab[h];
                tab[h] = min;
                tab[index] = temp;
            }
        }
        System.out.println("Tab posortowana: " + Arrays.toString(tab));
    }
}
