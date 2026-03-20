/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m1;
import java.util.Scanner;
/**
 *
 * @author Eslam
 */
public class M1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);

        CapitalOrSmallOrDigit obj = new CapitalOrSmallOrDigit(x);
        obj.check();
    }
}

