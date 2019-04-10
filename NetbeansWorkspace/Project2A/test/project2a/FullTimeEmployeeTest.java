/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2a;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrew
 * @since 4-9-2019 I pledge that this program represents my own program code. I
 * received code from and shared my code with no one.
 */
public class FullTimeEmployeeTest {
    /**
     * Test of getName method, of class FullTimeEmployee.
     */
    @Test
    public void testGetName1() {
        System.out.println("getName1");
        FullTimeEmployee instance = new FullTimeEmployee("Andrew Struthers", 190000.0);
        String expResult = "Andrew Struthers";
        String result = instance.getName();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetName2() {
        System.out.println("getName2");
        FullTimeEmployee instance = new FullTimeEmployee("Jovan Bessette", 190420.69);
        String expResult = "Jovan Bessette";
        String result = instance.getName();
        assertEquals(expResult, result);
    }
}
