package Age;

import java.util.Scanner;

public class Age {

    private final int LOW_AGE = -2;
    protected int highestAge;

    /**
     * * Initializes this Age object. *
     */
    public Age() {
        this.highestAge = LOW_AGE;
    } //constructor

    /**
     * Determines the highest age scanned in from the keyboard.
     *
     * The sentinel is -1. *
     * 
     * @param sc basic scanner for user input
     * 
     * @return returns highest age from input as an int
     */
    private final int SENTINEL = -1;
    
    public int findHighestAge(Scanner sc) {
        String prompt = "Enter a new highest age (or " + SENTINEL + " to quit)\n>>>";
        int userInput;
        
        while(true){
            System.out.println(prompt);
            userInput = sc.nextInt();
            if(userInput == SENTINEL){
                break;
            }else if(userInput > highestAge){
                highestAge = userInput;
            }
        } // while
        System.out.println("Highest input age was: " + highestAge);
        return highestAge;
    }

} // class Age
