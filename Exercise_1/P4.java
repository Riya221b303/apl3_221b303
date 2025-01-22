class Mother {
    Mother(int x) {
        System.out.println("Constructor in Mother with value: " + x);
    }
}

class Child extends Mother {
    Child(int x) {
        super(x); 
    }
}

public class Application {
    public static void main(String[] args) {
        Child obj = new Child(42);
    }
}
