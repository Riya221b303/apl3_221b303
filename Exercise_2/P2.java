abstract class Animal {
    abstract void makeVoice();
}

class Cow extends Animal {

    void makeVoice() {
        System.out.println("Moo!");
    }
}

class Dog extends Animal {
   
    void makeVoice() {
        System.out.println("Bark!");
    }
}

class Pig extends Animal {

    void makeVoice() {
        System.out.println("Oink!");
    }
}

class Goat extends Animal {
 
    void makeVoice() {
        System.out.println("Baa!");
    }
}

class Lion extends Animal {

    void makeVoice() {
        System.out.println("Roar!");
    }
}

class Voice2 {
    
    public void templateMethod() {
        prepareVoice();  
        hear();          
    }

    private void prepareVoice() {
        Animal[] animals = new Animal[5];
        
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
        
        this.animals = animals;
    }

    private Animal[] animals;

    private void hear() {
        for (Animal animal : animals) {
            animal.makeVoice();
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Voice2 voice = new Voice2();
        
        voice.templateMethod();
    }
}
