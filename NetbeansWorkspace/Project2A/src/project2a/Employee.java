/*
 * Collins Employee interface, edited
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
 * @author lulofse
 * Exercise 0E1 
 * @since 03/26/19
 * I pledge that this program represents my own program code. 
 * I received code from and shared my code with no one.
 */
interface Employee {
    
   /**
    *  Returns this Employee object’s name.  
    *
    *  @return this Employee object’s name.   
    * 
    */
   String getName();


   /**
    *  Returns this Employee object’s gross pay.  
    *
    *  @return this Employee object’s gross pay.   
    * 
    */
   double getGrossPay();


   /**
    *  Returns a String representation of this Employee object 
    *
    *  @return a String representation of this Employee object.
    *
    */
   String toString();

} // interface Employee