public class Car {

        //Attribute/EIgenschaften

        private String color;    //Farbe
        private String brand;    //Marke
        private int horsePower;  //PS-Zahl

        //Methoden
        public void drive() {
                System.out.println("Das Auto fährt...");
        }

        // Datenkapselung Beispiel
        public String getColor() {
                return color;
        }

        public void setColor(String color) {
                if (color.equals("gelb")){
                        this.color = color;
                }
                else if (color.equals("rot")){
                        this.color = color;
                }
                else  if (color.equals("blau")) {
                        this.color = color;
                }
                else {
                        System.out.println("Es sind nur gelb, rot und blau als Farben zulässig");
                        this.color = "weiß";
                }
        }
}
