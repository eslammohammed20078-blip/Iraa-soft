/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package n1;

/**
 *
 * @author Eslam
 */
public class Char {

    private char ch;

    public Char(char ch) {
        this.ch = ch;
    }

    public void convert() {
        if (ch >= 'a' && ch <= 'z') {
            System.out.println((char)(ch - 32));
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println((char)(ch + 32));
        }
    }
} 

