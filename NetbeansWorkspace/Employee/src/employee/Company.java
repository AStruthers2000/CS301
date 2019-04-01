package employee;

import java.util.*;
import java.io.*;

/**
 * @author Andrew
 * @since 3-28-2019 I pledge that this program represents my own program code. I
 * received code from and shared my code with no one.
 */
public class Company {

    public static void main(String[] args) throws FileNotFoundException {
        new Company().run();
    } //main()

    /**
     * Determines and prints out the best paid of the full-time employees
     * scanned in from a specified file.
     *
     */
    public void run() throws FileNotFoundException {
        final String INPUT_PROMPT = "Please enter the path for the file of employees: ";

        final String BEST_PAID_MESSAGE
                = "\n\nThe best-paid employee (and gross pay) is ";

        final String NO_INPUT_MESSAGE
                = "\n\nError: There were no employees scanned in.";

        String fileName;

        System.out.print(INPUT_PROMPT);
        fileName = new Scanner(System.in).nextLine();
        Scanner sc = new Scanner(new File(fileName));

        FullTimeEmployee bestPaid = findBestPaid(sc);

        if (bestPaid == null) {
            System.out.println(NO_INPUT_MESSAGE);
        } else {
            System.out.println(BEST_PAID_MESSAGE + bestPaid.toString());
        }
    } //run()

    /**
     * @param sc – the Scanner object used to scan in the employees.
     *
     * @return the best paid of all the full-time employees scanned in, or null
     * there were no employees scanned in.
     */
    public FullTimeEmployee findBestPaid(Scanner sc) {
        FullTimeEmployee full,
                bestPaid = new FullTimeEmployee();

        while (sc.hasNext()) {
            full = getNextEmployee(sc);
            if (full.getGrossPay() > bestPaid.getGrossPay()) {
                bestPaid = full;
            }
        } //while   
        if (bestPaid.getGrossPay() == 0.00) {
            return null;
        }
        return bestPaid;
    } //findBestPaid()

    /**
     * @param sc – the Scanner object over the file.
     *
     * @return the next full-time employee scanned in from sc.
     */
    protected FullTimeEmployee getNextEmployee(Scanner sc) {
        Scanner lineScanner = new Scanner(sc.nextLine());

        String name = lineScanner.next();

        double grossPay = lineScanner.nextDouble();

        return new FullTimeEmployee(name, grossPay);
    } //getNextEmployee()
}
