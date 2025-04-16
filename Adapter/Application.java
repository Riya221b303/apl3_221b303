public class Application{
    public static void main(String[] args) {
        Crow crow = new indianCrow();
        Swan swan = new CrowAdapter(crow); // Use the CrowAdapter here
        client(swan);
    }

    public static void client(Swan swan){
        swan.eat();
        swan.swim();
        swan.sing();
    }
}