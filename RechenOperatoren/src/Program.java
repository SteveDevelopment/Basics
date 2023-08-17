public class Program {
    public static void main(String[] args) {

        //Arithmetische Mittel = Rechen Operatoren
        // ( + , - , * , / )

        int number = 3 + 9;
        int number2 = 16-8;
        System.out.println(number+number2);
        System.out.println(number2-number);

        int number3 = 2*5;
        int number4 = 4/7;   //abschneiden wegen Ganzzahlen also
                            // z.B. 5/4 = 1 statt 1.25
        int number5 = 8;
        int number6 = 16;

        int result = number3 + number4;
        System.out.println(result);

        System.out.println(number * number2);
        System.out.println(number3/number2);

        System.out.println(number3 + "" + number4);
        System.out.println(number3+ " "+ number2);

        System.out.println(number5*number6);
        System.out.println(number6/number5);

    }
}
