
class Kaurav extends Bharatvanshi {

    public Kaurav(String name) {
        super(name);
    }

   
    public void disobey() {
        System.out.println(name + " disobeys the rules.");
    }

    public void cruel() {
        System.out.println(name + " is cruel.");
    }

    @Override
    public void fight() {
        System.out.println(name + " is fighting fiercely.");
    }
}
