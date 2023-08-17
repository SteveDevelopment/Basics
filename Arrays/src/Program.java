public class Program {
    public static void main(String[] args) {
        String[] names = new String[5]; //Die Größe eines Arrays wird immer
                                        // bei der Initialisierung festgelegt


        int[] numbers = new int[5]; //ohne werte

        int[] zahlen = {1000101, 2, 3, 4, 534, 4545, 8, 5, 9};

        //Gib nun bitte alle werte des zahlen arrays mit einer while schleife aus

        int halt = 0;

        while (halt < zahlen.length ){
            System.out.println(zahlen[halt]);
            halt++;
        }

        System.out.println(numbers.length);

        names[0] = "Paul";
        names[1] = "Tom";
        names[2] = "Esel";
        names[3] = "Klaus";
        names[4] = "Günther";

       // System.out.println(names[1]);

        // i++ ist die Kurzschreibweise von i += 1
        for (int i = 0; i< names.length; i++) {
            System.out.println(names[i]);
        }
        System.exit(98534);
    }
}


