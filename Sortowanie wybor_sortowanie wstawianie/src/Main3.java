class Main3 {
    public static void main(String[] args) {
        int[] tab = {4, 5};

        int temp;
        temp = tab[1];
        tab[1] = tab[0];
        tab[0] = temp;

        System.out.println(tab[0]);
        System.out.println(tab[1]);
    }

}

