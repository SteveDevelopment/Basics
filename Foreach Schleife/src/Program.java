public class Program {
    public static void main(String[] args) {
        String[] names = {"Paul", "Primatenaffe", "Peter"};

        // for schleife
        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        // nur eine Kopie      (Foreach Schleife)
        for(String name : names){
            System.out.println(name);
        }

    }
}
