class RedHeadDuck implements Duck, Flyable, Quackable {
    @Override
    public void swim() {
        System.out.println("Red Head Duck swims.");
    }

    @Override
    public void fly() {
        System.out.println("Red Head Duck flies.");
    }

    @Override
    public void quack() {
        System.out.println("Red Head Duck quacks.");
    }
}
