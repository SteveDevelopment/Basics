public class Program {
    public static void main(String[] args) {

        int Monat = 2;

        switch (Monat){
            case 1:
                System.out.println("Januar");
                break;
            case 2:
                System.out.println("Februar");
                break;
            case 3:
                System.out.println("März");
                break;
            default:
                System.out.println("Anderer Monat");
                break;
        }

        String month = "März";

        switch (month){
            case "Januar":  System.out.println("Januar"); break;
            case "Februar": System.out.println("Februar"); break;
            case "März" :   System.out.println("März"); break;
            case "April":   System.out.println("April"); break;
            default:        System.out.println("Anderer Monat");
        }
        String month2 = "Februar";
    }
}
