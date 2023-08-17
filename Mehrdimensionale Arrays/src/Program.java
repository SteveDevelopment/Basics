public class Program {
    public static void main(String[] args) {
        String[][] firstAndSecond = new String[3][2];

        firstAndSecond[0][0] = "Franz";
        firstAndSecond[0][1] = "Bauer";

        firstAndSecond[1][0] = "Felix";
        firstAndSecond[1][1] = "Huber";

        firstAndSecond[2][0] = "Fritz";
        firstAndSecond[2][1] = "Meier";

        //Äüßere For-Schleife: Zeilenindex => i
        //Innere For-Schleife: Spaltenindex => j
        for(int i = 0; i < firstAndSecond.length; i++) {
            for(int j = 0; j < firstAndSecond[i].length; j++){
                System.out.println(firstAndSecond[i][j] + " ");
            }
            System.out.println();
        }
    }
}
