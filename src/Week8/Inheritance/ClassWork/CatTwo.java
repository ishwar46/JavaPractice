package Week8.Inheritance.ClassWork;

import Week8.Inheritance.Animal;

public class CatTwo {

    void eat(){
        System.out.println(" Eating...");

    }

    class Dog extends CatTwo{
        void bark(){
            System.out.println("Barking....");
        }
    }

    class BabyDog extends Dog{
        void weep(){
            System.out.println("Weeping.....");
        }
    }
}
