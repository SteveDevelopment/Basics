public class Programm {
    public static void main(String[] args) {
        Car car1 = new Car("Grün", "Audi",130); //Instanziierung eines Objekts
        Car car2 = new Car();
        System.out.println(car1.getColor());
        System.out.println(car1.getBrand());
        System.out.println(car1.getHorsePower());
    }
}
