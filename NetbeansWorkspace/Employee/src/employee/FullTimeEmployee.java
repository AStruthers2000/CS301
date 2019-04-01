package employee;

/**
 * @author Andrew
 * @since 3-28-2019 I pledge that this program represents my own program code. I
 * received code from and shared my code with no one.
 */
public class FullTimeEmployee implements Employee{
    
    protected String name;
    protected double grossPay;
    
    public FullTimeEmployee(){
        name = "";
        grossPay = 0.00;
    } //default constructor
    
    /**
     * 
     * @param name - name of the employee
     * @param grossPay - gross pay of the employee
     */
    public FullTimeEmployee(String name, double grossPay){
        this.name = name;
        this.grossPay = grossPay;
    } //2-parameter constructor

    @Override
    public String getName() {
        return name;
    } //getName()

    @Override
    public double getGrossPay() {
        return grossPay;
    } //getGrossPay()
    
    @Override
    public String toString(){
        return name + " " + MONEY.format(grossPay) + " FULL TIME";
    } //toString()
}
