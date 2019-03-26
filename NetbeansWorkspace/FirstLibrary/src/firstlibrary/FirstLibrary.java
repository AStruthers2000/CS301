/*
 * Demo driver
 */
package firstlibrary;

/**
 *
 * @author StruthersA
 * @since 2-26-2018 I pledge that this program represents my own program code. I
 * received code from and shared my code with no one.
 */
public class FirstLibrary {

    public void run() {
        System.out.println("main called run. Now in run");
        new OutputLibrary().out();
        System.out.println("out returned. Now in run");
    }

    public static void main(String[] args) {
        new FirstLibrary().run();
    }

}
