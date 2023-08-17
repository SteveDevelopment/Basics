public class Program {
    public static void main(String[] args) {
        //Vergleichsoperatoren  für formolierungen von Bedingungen

        // Kleiner als <
        // Größer als >
        //Kleiner als oder gleich <=
        //Größer als oder gleich >=
        //Gleich ==
        //Ungleich !=

        if(3<4) {                        // Ist immer richtig
            System.out.println("Das ist richtig!");
        }

        if(5>9) {            // Ist immer falsch
            System.out.println("Du machst nichts");
        }

        int age = 17;
        age = age + 1;

        if(age>17) {
            System.out.println("Du darfst alleine Auto fahren");
        }

        boolean bedingung = age == 6;

        System.out.println(bedingung);

        if (bedingung == true) {

        }

        if(age != 6) {
            System.out.println("Simon will heute rausgehen!" );
        }
        else {
            System.out.println("Hallo lass uns ein Plugin programieren");
        }
    }
}