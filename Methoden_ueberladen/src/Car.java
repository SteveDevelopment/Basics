public class Car {

    //Attribute/Eigenschaften
    private String color;    //Farbe
    private String brand;    //Marke
    private int horsePower;  //PS-Zahl

    public Car() {
        System.out.println("Das Auto wurde erzeugt.");
    }
    public Car(String color, String brand, int horsePower){
        this.color = color;
        this.brand = brand;
        this.horsePower = horsePower;
    }
    //public Car() {   }   Default Konstruktor

    //Methoden
    public void drive(int speed) {
        System.out.println("Das Auto fährt " + speed + " km/h");
    }

    public void drive() {
        System.out.println("Das Auto fährt ...");
    }

    public void drive(int speed, String name) {
        System.out.println("Das Auto fährt ...");
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

}
