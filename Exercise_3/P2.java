interface Testable {
    void display();
}


class Test implements Testable {
    public void display() {
        System.out.println("Display from Test class");
    }
}


abstract class AbsTest implements Testable {
    
}

class SubTest extends AbsTest {
    public void display() {
        System.out.println("Display from SubTest (child of AbsTest)");
    }
}

public class Main {
    public static void main(String[] args) {
        Test t = new Test();
        t.display();

        SubTest s = new SubTest();
        s.display();
    }
}
