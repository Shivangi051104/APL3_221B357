class Voice {
    Animal[] animals;
    
    void prepareVoice() {
        animals = new Animal[]{
            new Cow(),
            new Dog(),
            new Pig(),
            new Goat(),
            new Lion()
        };
    }
    
    void hear() {
        if (animals == null) {
            System.out.println("Error: Call prepareVoice() first!");
            return;
        }
        for (Animal animal : animals) {
            animal.makeVoice();
        }
    }
}
