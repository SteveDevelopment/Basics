public class Program {
    public static void main(String[] args) {

        System.out.println("Vor dem Methodenlauf");
        doSomething();
        System.out.println("Nach dem Methodenlauf");

    }

    public static void doSomething() {
        int x = 10;
        int y = 20;
        int result = x+y;
        System.out.println(result);
    }

}
