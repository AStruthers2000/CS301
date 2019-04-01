package employee;

import java.text.DecimalFormat;

/**
 * @author Andrew
 * @since 3-28-2019 I pledge that this program represents my own program code. I
 * received code from and shared my code with no one.
 */
public interface Employee {

    final static DecimalFormat MONEY = new DecimalFormat("$0.00");
    //Format used by the getGrossPay() method to make the money look good

    /**
     * 
     * @return the name of the Employee object
     */
    String getName();

    /**
     * 
     * @return the gross pay of the Employee object as a double using the DecimalFormat MONEY
     */
    double getGrossPay();

    /**
     * 
     * @return a string giving information on the Employee object
     */
    @Override
    String toString();

}
