public class Program {
    public static void main(String[] args) {

        //Für If-Abfragen und Warheitswerte

        boolean probe = true;       //zeigt Warheitswerte   wichtig für if-Abfragen
        System.out.println(probe);

        //Für Buchstaben anzeigen

        char probe2 = 68;        //positive Ganzzahlen (Buchstaben)
        System.out.println(probe2);

        char Buch ='a';             //mit 'Text' Buchstaben möglich
        System.out.println(Buch);

        //Für Ganzzahlen häufig int

        byte test = 124;           //zeigt Ganzzahlen von -128 bis 127
        System.out.println(test);

        short test2 = -3045;        // zeigt Ganzzahlen von -32768 bis 32787
        System.out.println(test2);

        int test3 = 482934;         // zeigt Ganzzahlen sehr viele ( + und -) häufige Verwendung
        System.out.println(test3);

        long test4 = -93456754;     // zeigt Ganzzahlen mehr als int
        System.out.println(test4);

            //Kommazahlen mit . statt , häufig mit double


        float probe3 = 1.123456789F;     // zeigt Kommazahlen bis (9) Stellen
        System.out.println(probe3);

        double probe4 = 1.12345678912345678; // zeigt Kommazahlen genauer als float häufige Verwendung
        System.out.println(probe4);
    }
}
