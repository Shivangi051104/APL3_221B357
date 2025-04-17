public class Application {

    public static void main(String[] args) {
        Crow crow = new Indian_Crow();
        Swan crowAdapter = new CrowAdapter(crow);
        client(crowAdapter);
    }

    public static void client(Swan swan) {
        swan.eat();
        swan.swim();
        swan.sing();
    }
}
