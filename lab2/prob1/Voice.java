
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
        for (Animal animal : animals) {
            animal.makeVoice();
        }
    }
}