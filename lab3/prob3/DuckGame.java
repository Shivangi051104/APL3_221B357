/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class DuckGame {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        Duck woodenDuck = new WoodenDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck lakeDuck = new LakeDuck();

        System.out.println("Rubber Duck:");
        rubberDuck.swim();
        ((Squeakable) rubberDuck).squeak();  

        System.out.println("\nWooden Duck:");
        woodenDuck.swim();
        

        System.out.println("\nRed Head Duck:");
        redHeadDuck.swim();
        ((Flyable) redHeadDuck).fly();  
        ((Quackable) redHeadDuck).quack();  

        System.out.println("\nLake Duck:");
        lakeDuck.swim();
        ((Flyable) lakeDuck).fly();  
        ((Quackable) lakeDuck).quack();  
    }
}


interface Flyable {
    void fly();
}

interface Quackable {
    void quack();
}

interface Squeakable {
    void squeak();
}

// Duck interface
interface Duck {
    void swim();
}

