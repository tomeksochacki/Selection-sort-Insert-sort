import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] myTab = {3, 4, 7, 2, 8, 9, 1};
        System.out.println(Arrays.toString(myTab));

        int []tabHelp = new int[myTab.length];

        int j, k;
        int min = myTab[0];
        int minIndex;
        //tu jest wyszukiwanie najmniejszej liczby w całej tablicy
        for (j = 0; j < myTab.length; j++) {
            if (myTab[j] < min) {
                min = myTab[j];
                do {
                    tabHelp[j] = myTab[j];
                } while (min == myTab[j]);
            }
            System.out.println();
        }

        System.out.println("min: " + min);
        for (k = 0; k < myTab.length; k++) {
            int temp;
            if (min > myTab[k]) {
                temp = min;
                min = myTab[k];
                myTab[k] = temp;
            }
            System.out.print(myTab[k] + " ");
        }
    }

    //tu jest zamiana znalezionej pierwszej najmniejszej na 1 miejsce w tablciy
        /*int temp;
        for (k = 0; k < myTab.length; k++) {
            temp = myTab[k];
            myTab[k] = min;

            System.out.print(myTab[k] + " ");
        }

        System.out.println(", min: " + min);*/

}



