/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
abstract class Beverage {
    protected void pour(int qty) {
        System.out.println("Pour " + qty + "ml of beverage in the glass");
    }

    protected abstract void addCondiment();

    protected void stir() {
        System.out.println("Stir the beverage");
    }

    protected void serve() { 
        System.out.println("Serve through waiter");
    }

    public void templateMethod(int qty) {
        pour(qty);          
        addCondiment();    
        stir();
        serve();
    }
}
