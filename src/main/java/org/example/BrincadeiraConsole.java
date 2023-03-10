package org.example;

public class BrincadeiraConsole {
    public static void main(String[] args) {
        int side = 8;
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("");
            }
            for (int j = 0; j < 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = side -1 ; i >= 1 ; i--) {
            for (int j = 1; j <= side -i ; j++) {
                System.out.print("");
            }
            for (int k = 1; k <= 2 * i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
