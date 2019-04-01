package employee;

/**
 * @author Andrew
 * @since 3-28-2019 I pledge that this program represents my own program code. I
 * received code from and shared my code with no one.
 */
public class HourlyEmployee extends FullTimeEmployee implements Employee {

    public final static int MAX_REGULAR_HOURS = 40;

    public final static double OVERTIME_FACTOR = 1.5;

    protected int hoursWorked;

    protected double payRate, regularPay, overtimePay;

    /**
     * Default constructor that initializes everything
     */
    public HourlyEmployee() {
        hoursWorked = 0;
        payRate = 0.00;
        regularPay = 0.00;
        overtimePay = 0.00;
    } // default constructor

    /**
     * @param name - the specified name.
     * @param hoursWorked - the specified hours worked.
     * @param payRate - the specified pay rate.
     *
     */
    public HourlyEmployee(String name, int hoursWorked, double payRate) {
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;

        if (hoursWorked <= MAX_REGULAR_HOURS) {
            regularPay = hoursWorked * payRate;
            overtimePay = 0.00;
        } // if
        else {
            regularPay = MAX_REGULAR_HOURS * payRate;
            overtimePay = (hoursWorked - MAX_REGULAR_HOURS)
                    * (payRate * OVERTIME_FACTOR);
        } // else    
        grossPay = regularPay + overtimePay;
    } // 3-parameter constructor

    /**
     * @return the hours worked by this full-time HourlyEmployee object.
     */
    public int getHoursWorked() {
        return hoursWorked;
    } //getHoursWorked()

    /**
     * @return the pay rate this full-time HourlyEmployee object.
     */
    public double getPayRate() {
        return payRate;
    } //getPayRate()

    /**
     * @return the regular pay this full-time HourlyEmployee object.
     */
    public double getRegularPay() {
        return regularPay;
    } //getRegularPay()

    /**
     * @return the overtime pay this full-time HourlyEmployee object.
     */
    public double getOvertimePay() {
        return overtimePay;
    } //getOvertimePay()

    /**
     * @return a String representation of this full-time HourlyEmployee object.
     */
    public String toString() {
        return super.toString() + " HOURLY";
    } //toString()
}
