/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package multi_calculadora;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author LUIS LAVADO
 */
public class mas_operaciones {
    int resul[][];
    ArrayList n1 = new ArrayList();
    ArrayList n2 = new ArrayList();
    ArrayList n3 = new ArrayList();

    public void tablaDeMultiplicar() {
        int a, b, c = 0;
        for (a = 1; a <= 12; a++) {
            for (b = 1; b <= 12; b++) {
                c = a * b;
                
            }
        } JOptionPane.showMessageDialog(null, n1 + " x " + n2 + " = " + n3 +
                n1 + " x " + n2 + " = " + n3+
                n1 + " x " + n2 + " = " + n3 +
                n1 + " x " + n2 + " = " + n3 +
                n1 + " x " + n2 + " = " + n3 +
                n1 + " x " + n2 + " = " + n3 +
                n1 + " x " + n2 + " = " + n3 +
                n1 + " x " + n2 + " = " + n3 +
                n1 + " x " + n2 + " = " + n3 +
                n1 + " x " + n2 + " = " + n3 +
                n1 + " x " + n2 + " = " + n3 +
                n1 + " x " + n2 + " = " + n3);
    }

    public static void factorial() {
        String a = JOptionPane.showInputDialog("Factorial hasta: ");
        double num = Double.parseDouble(a);
        double fac = 1;
        for (fac = 1; num != 0; num--) {//mientras el número sea diferente de "0"
            fac = fac * num; //disminuira has llegar a "0".
        }
        System.out.println("El factorial es:" + fac);
    }

    public void determinar_SiEsPrimo() {
        double n;
        double i;
        double p = 0;
        String s = JOptionPane.showInputDialog("Valor a Determinar:");
        n = Double.parseDouble(s);
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                p = p + 1;
            }
        }
        if (p == 2) {
            JOptionPane.showMessageDialog(null, n + " si es un número primo");
        } else {
            JOptionPane.showMessageDialog(null, n + " no es un número primo");
        }
    }

    void Es_o_No_perfecto() {
        double i, suma = 0, n;
        String s = JOptionPane.showInputDialog("Valor a Determinar:");
        n = Double.parseDouble(s);
        for (i = 1; i < n; i++) {  // i son los divisores. Se divide desde 1 hasta n-1 
            if (n % i == 0) {
                suma = suma + i;     // si es divisor se suma
            }
        }
        if (suma == n) {  // si el numero es igual a la suma de sus divisores es perfecto
            JOptionPane.showMessageDialog(null, n + " si es un número Perfecto");
        } else {
            JOptionPane.showMessageDialog(null, n + " No es un número perfecto");

        }
    }

    void Perfectos_entre1y1000() {
        int i, j, suma;
        for (i = 1; i <= 1000; i++) {    // i es el número que vamos a comprobar
            suma = 0;
            for (j = 1; j < i; j++) {  // j son los divisores. Se divide desde 1 hasta i-1 
                if (i % j == 0) {
                    suma = suma + j;     // si es divisor se suma
                }
            }
            if (i == suma) {           // si el numero es igual a la suma de sus divisores es perfecto
                JOptionPane.showMessageDialog(null, "Numeros perfectos entre 1 y 1000\n" + i);
            }
        }
    }

    void NumPerfecto_hastaX() {
        String a = JOptionPane.showInputDialog("Números perfectos hasta: ");
        double x = Double.parseDouble(a);
        int i, j, suma;
        for (i = 1; i <= x; i++) {    // i es el número que vamos a comprobar
            suma = 0;
            for (j = 1; j < i; j++) {  // j son los divisores. Se divide desde 1 hasta i-1 
                if (i % j == 0) {
                    suma = suma + j;     // si es divisor se suma
                }
            }
            if (i == suma) {           // si el numero es igual a la suma de sus divisores es perfecto
                JOptionPane.showMessageDialog(null, "Numeros perfectos entre 1 y 1000\n" + i);
            }
        }
    }

    void operaciones() {
        String operar = JOptionPane.showInputDialog("(a): TABLA DE MULTIPLICAR" + "\n(b): FACTORIAL" + "\n(c): DETERMINAR SI UN NÚMERO ES PRIMO " + "\n(d): DETERMINAR SI UN NÚMERO ES PERFECTO"
                + "\n(e): NÚMEROS PERFECTOS ENTRE 1 Y 1000" + "\n(f): NUMEROS PRIMOS HASTA X" + "\n(s): salir");
        boolean condicion = true;
        //do{condicion= true; 
        switch (operar) {
            case "a":
                if (operar.equals("A") || operar.equals("a")) {
                    tablaDeMultiplicar();

                    break;
                }
            case "b":
                factorial();
                break;
            case "c":
                determinar_SiEsPrimo();
                break;
            case "d":
                Es_o_No_perfecto();
                break;
            case "e":
                Perfectos_entre1y1000();
                break;
            case "f":
                NumPerfecto_hastaX();
                break;
            case "s":
                break;
            default:
                break;
        }
    }
}
