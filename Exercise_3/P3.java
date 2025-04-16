interface FlyBehavior {
    void fly();
}

interface SoundBehavior {
    void makeSound();
}

class NoFly implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly.");
    }
}

class CanFly implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying!");
    }
}

class Squeak implements SoundBehavior {
    public void makeSound() {
        System.out.println("Squeak!");
    }
}

class Mute implements SoundBehavior {
    public void makeSound() {
        System.out.println("<< Silence >>");
    }
}

class Quack implements SoundBehavior {
    public void makeSound() {
        System.out.println("Quack!");
    }
}

abstract class Duck {
    FlyBehavior flyBehavior;
    SoundBehavior soundBehavior;

    public void swim() {
        System.out.println("All ducks can swim!");
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performSound() {
        soundBehavior.makeSound();
    }

    public abstract void display();
}

class RubberDuck extends Duck {
    RubberDuck() {
        flyBehavior = new NoFly();
        soundBehavior = new Squeak();
    }

    public void display() {
        System.out.println("I'm a Rubber Duck.");
    }
}

class WoodenDuck extends Duck {
    WoodenDuck() {
        flyBehavior = new NoFly();
        soundBehavior = new Mute();
    }

    public void display() {
        System.out.println("I'm a Wooden Duck.");
    }
}

class RedHeadDuck extends Duck {
    RedHeadDuck() {
        flyBehavior = new CanFly();
        soundBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a RedHead Duck.");
    }
}

class LakeDuck extends Duck {
    LakeDuck() {
        flyBehavior = new CanFly();
        soundBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a Lake Duck.");
    }
}

public class Main {
    public static void main(String[] args) {
        Duck d1 = new RubberDuck();
        d1.display();
        d1.swim();
        d1.performFly();
        d1.performSound();
        System.out.println();

        Duck d2 = new WoodenDuck();
        d2.display();
        d2.swim();
        d2.performFly();
        d2.performSound();
        System.out.println();

        Duck d3 = new RedHeadDuck();
        d3.display();
        d3.swim();
        d3.performFly();
        d3.performSound();
        System.out.println();

        Duck d4 = new LakeDuck();
        d4.display();
        d4.swim();
        d4.performFly();
        d4.performSound();
    }
}
