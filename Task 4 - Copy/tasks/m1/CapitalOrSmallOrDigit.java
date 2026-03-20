/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m1;

/**
 *
 * @author Eslam
 */
public class CapitalOrSmallOrDigit {
    private char ch;

    public CapitalOrSmallOrDigit(char ch) {
        this.ch = ch;
    }

    public void check() {
        if (ch >= '0' && ch <= '9') {
            System.out.println("IS DIGIT");
        } else {
            System.out.println("ALPHA");
            if (ch >= 'A' && ch <= 'Z') {
                System.out.println("IS CAPITAL");
            } else if (ch >= 'a' && ch <= 'z') {
                System.out.println("IS SMALL");
            }
        }
    }
}

