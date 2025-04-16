
abstract class Bharatvanshi {
  
    abstract void fight();
}


abstract class Pandav extends Bharatvanshi {
    void obey() {
        System.out.println(getClass().getSimpleName() + " is obedient.");
    }

    void kind() {
        System.out.println(getClass().getSimpleName() + " is kind.");
    }
}


abstract class Kaurav extends Bharatvanshi {
    void kind() {
        System.out.println(getClass().getSimpleName() + " is cruel.");
    }
}


class Arjun extends Pandav {
    
    void fight() {
        System.out.println("Arjun is an excellent fighter.");
    }
}


class Bheem extends Pandav {
    
    void fight() {
        System.out.println("Bheem is a powerful fighter.");
    }


    
    void kind() {
        System.out.println("Bheem is a little less kind.");
    }
}


class Duryodhan extends Kaurav {
    
    void fight() {
        System.out.println("Duryodhan is a strong fighter.");
    }
}


class Vikarn extends Kaurav {
    
    void fight() {
        System.out.println("Vikarn is a noble fighter.");
    }


    
    void kind() {
        System.out.println("Vikarn is kind.");
    }

    void obey() {
        System.out.println("Vikarn is obedient.");
    }
}


public class MahabharatTest {
    public static void main(String[] args) {
        Arjun arjun = new Arjun();
        Bheem bheem = new Bheem();
        Duryodhan duryodhan = new Duryodhan();
        Vikarn vikarn = new Vikarn();

   
        System.out.println("=== Pandavs ===");
        arjun.fight();
        arjun.obey();
        arjun.kind();

        bheem.fight();
        bheem.obey();
        bheem.kind();

     
        System.out.println("\n=== Kauravs ===");
        duryodhan.fight();
        duryodhan.kind();

        vikarn.fight();
        vikarn.kind();
        vikarn.obey();
    }
}
    
       
