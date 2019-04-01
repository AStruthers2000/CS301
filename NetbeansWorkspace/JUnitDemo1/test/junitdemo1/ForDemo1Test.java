/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitdemo1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrew
 */
public class ForDemo1Test {
    
    public ForDemo1Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sum method, of class ForDemo1.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        assertEquals(0, new ForDemo1().sum(0,0));
        assertEquals(12000, new ForDemo1().sum(1460,12000-1460));
        assertEquals(-900, new ForDemo1().sum(1800,-2700));
        assertEquals(4, new ForDemo1().sum(2,2));
        assertEquals(10,new ForDemo1().sum(5,5));
    }   
}
