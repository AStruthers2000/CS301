/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testnetbeans;

/**
 *
 * @author StruthersA
 */
public class TestNetbeans {
    
    @Override
    public String toString(){
        String output = "This is the TestNetbeans toString method";
        return output;
    }
    
    private TestNetbeans(){
        System.out.println("Cool this is the constructor");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello world");
        TestNetbeans app = new TestNetbeans();
        System.out.println(app.toString());
    }
    
}
