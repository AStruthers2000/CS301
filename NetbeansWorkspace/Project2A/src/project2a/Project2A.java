/*
 * Learn jUnit
 * Project 2 A
 */
package project2a;

/**
 *
 *
 * @author Andrew
 * @since 4-9-2019 I pledge that this program represents my own program code. I
 * received code from and shared my code with no one.
 *
 * @author lulofse Exercise 0E1
 * @since 03/26/19 I pledge that this program represents my own program code. I
 * received code from and shared my code with no one.
 */
public class Project2A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Project2A().run();
    }

    public void run() {

        // demo JUnit test with this working project 
        FullTimeEmployee fTobj1 = new FullTimeEmployee("Ed", 1000000.00);
        FullTimeEmployee fTobj2 = new FullTimeEmployee("Wiley", 10.00);

        System.out.println("Name= " + fTobj1.getName() + "   pay= "
                + fTobj1.getGrossPay() + "  ");

        System.out.println("Name= " + fTobj2.getName() + "   pay= "
                + fTobj2.getGrossPay() + "  ");

        System.out.println(fTobj1.toString());
        System.out.println(fTobj1.toString());
    }    
}
/*
Name= Ed   pay= 1000000.0  
Name= Wiley   pay= 10.0  
Ed1000000.0 FULL TIME
Ed1000000.0 FULL TIME
*/