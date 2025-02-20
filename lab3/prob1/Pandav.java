
class Pandav extends Bharatvanshi {
    int kindnessLevel;

    public Pandav(String name, int kindnessLevel) {
        super(name);
        this.kindnessLevel = kindnessLevel;
    }
    public void obey() {
        System.out.println(name + " is obedient.");
    }

    public void kind() {
        if (kindnessLevel > 5) {
            System.out.println(name + " is very kind.");
        } else {
            System.out.println(name + " is somewhat kind.");
        }
    }

    @Override
    public void fight() {
        System.out.println(name + " is fighting with skill.");
    }
}
