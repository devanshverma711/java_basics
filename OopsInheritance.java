public class OopsInheritance {
    public static void main(String[] args) {
        fish shark = new fish();
        shark.eat();
        shark.breathe();
        shark.swims();   

        dogs doggy = new dogs();
        doggy.barks();
        doggy.breathe();
        doggy.eat();
         System.out.println(doggy.legs=4);

    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

class fish extends Animal{
    int fin;

    void swims(){
        System.out.println("Swims in water");
    }
}

class mammels extends Animal{
    int legs;
}
class dogs extends mammels{
    void barks(){
        System.out.println("Dogs barks");
    }
}
