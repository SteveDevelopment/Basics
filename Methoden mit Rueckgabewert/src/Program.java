public class Program {
    public static void main(String[] args) {
        System.out.println("Vor dem Methodenaufruf");
        doSomething(20, 10);
        System.out.println(doSomething(60, 80));
        int resultFromMethodDoSomething = doSomething(1, 2);
        System.out.println("Nach dem Methodenaufruf");
    }
    public static int doSomething(int number1, int number2){
        int result = number1 + number2;
        System.out.println(result);
        return result;
    }
}
