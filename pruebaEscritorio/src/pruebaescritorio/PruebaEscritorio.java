/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaescritorio;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author PersonaL-CTI
 */
public class PruebaEscritorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int k;
        int residuo;
        int j = 0;

        System.out.println("Ingrese un numero");
        k = entrada.nextInt();
        int k1 = k;

        while (k1 > 0) {
            residuo = obtenerResiduo(k1);
            System.out.printf("%d * 10 elevador a la potencia %d\n", residuo, j);
            k1 = obtenerDivision(k1);
            j = j + 1;
        }

    }

    public static int obtenerResiduo(int a) {
        int residuo;
        residuo = a % 10;
        return residuo;
    }

    public static int obtenerDivision(int a) {
        a = a / 10;
        return a;
    }

}
