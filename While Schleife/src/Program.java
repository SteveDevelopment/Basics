public class Program {
    public static void main(String[] args) {
        int counter = 1; //Zähler

        //kopfgesteuerte Schleife
        while (counter <= 5){
            System.out.println(counter);
            counter = counter +1;
            //counter += 1;   (kombinierter Zuweisungoperator)
            //counter++;      (noch kürzer, geht nur bei 1)
        }
    }
}
