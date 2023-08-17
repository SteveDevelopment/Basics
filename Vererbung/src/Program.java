public class Program {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.sleep();
        dog.setName("Bello");
        System.out.println(dog.getName());

        Cat cat = new Cat();
        cat.purr();
        cat.setAge(2);
        System.out.println(cat.getAge());

    }
}
