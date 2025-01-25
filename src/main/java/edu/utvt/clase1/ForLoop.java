package edu.utvt.clase1;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        int loops = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el numero de ciclos requeridos: ");
        loops = sc.nextInt();

        for (int count = 1; count <= loops; count++) {
            System.out.println("Numero actual de iteracion "+ count );
        }
    }
}
