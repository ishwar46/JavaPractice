package Week8.Inheritance;

public class MainAnimal {
    public static void main(String[] args) {

        Cat mewo = new Cat();

        mewo.name = "Hero";
        mewo.age = "12";
        mewo.Type = "animal";
        mewo.color = "Black";
        mewo.meows();

        Dog bhow = new Dog();

        bhow.name = "Messi";
        bhow.age = "12";
        bhow.Type = "animal";
        bhow.color = "Golden";
        bhow.barks();
    }
}
