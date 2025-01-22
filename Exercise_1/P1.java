
class Mother {
    int x = 5;

    void show() {
        System.out.println("Value of x in Mother: " + x);
    }
}

class Child extends Mother {
   
}


public class Application {
    public static void main(String[] args) {

        Mother m = new Mother();
        m.show(); 

        Child ch = new Child();
        ch.show(); 
    }
}
