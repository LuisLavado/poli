/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package multi_calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author: LUIS LAVADO
 */
public class operaciones_basicas {

    String c = "";
    double resultado = 0;
    private String[] args;

    void sumar() {
        String a = JOptionPane.showInputDialog("Ingrese un valor");
        double j = Double.parseDouble(a);
        String b = JOptionPane.showInputDialog(resultado + j + " + ");
        double k = Double.parseDouble(b);
        double result = j + k;
        resultado = resultado + result;
        JOptionPane.showMessageDialog(null, " resultado = " + resultado);
        c = JOptionPane.showInputDialog("resultado = " + resultado + "\n(+): Para seguir con la suma" + "\n(-): restar" + "\n(x): multiplicar" + "\n(/): dividir" + "\n(p): sacar su potencia" + "\n(r): sacar la raiz cuadrada" + "\n(m): volver al menú" + "\n(s): salir");
        opciones(c, resultado);
    }

    void restar() {
        String a = JOptionPane.showInputDialog("Ingrese un valor:");
        double j = Double.parseDouble(a);
        String b = JOptionPane.showInputDialog(resultado + j + " - ");
        resultado = -resultado;
        double k = Double.parseDouble(b);
        double result = j - k;
        resultado = result - resultado;
        JOptionPane.showMessageDialog(null, " resultado = " + resultado + "\n");
        c = JOptionPane.showInputDialog("resultado = " + resultado + "\n \n(-): Para seguir con la resta" + "\n(+): sumar" + "\n(x): multiplicar" + "\n(/): dividir" + "\n(p): sacar su potencia" + "\n(r): sacar la raiz cuadrada" + "\n(m): volver al menú" + "\n(s): salir");
        opciones(c, resultado);
    }

    void multiplicar() {
        String a = JOptionPane.showInputDialog("Ingrese un valor");
        double j = Double.parseDouble(a);
        String b = JOptionPane.showInputDialog(resultado + j + " x ");
        double k = Double.parseDouble(b);
        resultado = j * k;
        JOptionPane.showMessageDialog(null, " resultado = " + resultado + "\n");
        c = JOptionPane.showInputDialog("resultado = " + resultado + "\n \n(x): para seguir multiplicando" + "\n(+): sumar" + "\n(-): restar" + "\n(/): dividir" + "\n(p): sacar su potencia" + "\n(r): sacar la raiz cuadrada" + "\n(m): volver al menú" + "\n(s): salir");
        opciones(c, resultado);
    }

    void dividir() {
        String a = JOptionPane.showInputDialog("Ingrese un valor");
        double j = Double.parseDouble(a);
        String b = JOptionPane.showInputDialog(resultado + j + " / ");
        double k = Double.parseDouble(b);
        while (k == 0) {
            b = JOptionPane.showInputDialog("La división entre cero no existe\n" + resultado + j + " / ");
            k = Double.parseDouble(b);
        }
        resultado = j / k;
        JOptionPane.showMessageDialog(null, " resultado = " + resultado + "\n");
        c = JOptionPane.showInputDialog("resultado = " + resultado + "\n \n(/): Para seguir diviendo" + "\n(+): sumar" + "\n(/): restar" + "\n(x): multiplicar" + "\n(p): sacar su potencia" + "\n(r): sacar la raiz cuadrada" + "\n(m): volver al menú" + "\n(s): salir");
        opciones(c, resultado);
    }

    void operaciones() {
        String operar = JOptionPane.showInputDialog("(+): SUMA" + "\n(-): RESTA" + "\n(x): MULTIPLICACIÓN" + "\n(/): DIVISIÓN" + "\n(p): POTENCIACIÓN" + "\n(r): RAIZ CUADRADA"+ "\n(m): volver al menú principal" + "\n(s): SALIR");
        boolean condicion = true;
        do {
            condicion = true;
            otras_operaciones op = new otras_operaciones();
            switch (operar) {
                case "+":
                    sumar();
                    break;
                case "-":
                    restar();
                    break;
                case "x":
                    multiplicar();
                    break;
                case "/":
                    dividir();
                    break;
                case "p":
                    op.potencia();
                    break;
                case "P":
                    op.potencia();
                    break;
                case "r":
                    op.raiz_cuadrada();
                    break;
                case "R":
                    op.raiz_cuadrada();
                    break;
                case "m":
                    Multi_Calculadora e = new Multi_Calculadora();
                    e.main(args);
                    break;
                case "M":
                    Multi_Calculadora ej = new Multi_Calculadora();
                    ej.main(args);
                    break;
                case "s":
                    break;
                case "S":
                    break;
                default:
                    String end = JOptionPane.showInputDialog("No a elegido ninguna operación.\n" + "(+): SUMA" + "\n(-): RESTA" + "\n(x): MULTIPLICACIÓN" + "\n(/): DIVISIÓN" + "\n(p): POTENCIACIÓN" + "\n(r): RAIZ CUADRADA"+ "\n(m): volver al menú principal" + "\n(s): SALIR");
                    operar = end;
                    condicion = false;
                    break;
            }
        } while (!condicion);
    }

    void resta(double resultado) {
        String b = JOptionPane.showInputDialog(resultado + " - ");
        double k = Double.parseDouble(b);
        double result = resultado - k;
        resultado = result;
        JOptionPane.showMessageDialog(null, " resultado = " + resultado + "\n");
        c = JOptionPane.showInputDialog("resultado = " + resultado + "\n \n(-): Para seguir con la resta" + "\n(+): sumar" + "\n(x): multiplicar" + "\n(/): dividir" + "\n(p): sacar su potencia" + "\n(r): sacar la raiz cuadrada" + "\n(m): volver al menú principal" + "\n(s): salir");
        opciones(c, resultado);
    }

    void suma(double resultado) {
        String b = JOptionPane.showInputDialog(resultado + " + ");
        double k = Double.parseDouble(b);
        double result = resultado + k;
        resultado = result;
        JOptionPane.showMessageDialog(null, " resultado = " + resultado + "\n");
        c = JOptionPane.showInputDialog("resultado = " + resultado + "\n \n(+): Para seguir con la suma" + "\n(-): resta" + "\n(x): multiplicar" + "\n(/): dividir" + "\n(p): sacar su potencia" + "\n(r): sacar la raiz cuadrada" + "\n(m): volver al menú principal" + "\n(s): salir");
        opciones(c, resultado);
    }

    void multiplica(double resultado) {
        //do {
        String b = JOptionPane.showInputDialog(resultado + " x ");
        double k = Double.parseDouble(b);
        resultado = resultado * k;
        JOptionPane.showMessageDialog(null, " resultado = " + resultado + "\n");
        c = JOptionPane.showInputDialog("resultado = " + resultado + "\n \n(x): Para seguir multiplicando" + "\n(+): sumar" + "\n(-): restar" + "\n(/): dividir" + "\n(p): sacar su potencia" + "\n(r): sacar la raiz cuadrada" + "\n(m): volver al menú" + "\n(s): salir");
        opciones(c, resultado);
    }

    void divide(double resultado) {
        String b = JOptionPane.showInputDialog(resultado + " / ");
        double k = Double.parseDouble(b);
        while (k == 0) {
            b = JOptionPane.showInputDialog("La división entre cero no existe\n" + resultado + " / ");
            k = Double.parseDouble(b);
        }
        resultado = resultado / k;
        JOptionPane.showMessageDialog(null, " resultado = " + resultado + "\n");
        c = JOptionPane.showInputDialog("resultado = " + resultado + "\n \n(/): Para seguir diviendo" + "\n(+): sumar" + "\n(/): restar" + "\n(x): multiplicar" + "\n(p): sacar su potencia" + "\n(r): sacar la raiz cuadrada" + "\n(m): volver al menú" + "\n(s): salir");
        opciones(c, resultado);
    }

    void opciones(String c, double resultado) {
        String operar = c;
        boolean condicion = true;
        do {
            condicion = true;
            otras_operaciones op = new otras_operaciones();
            switch (operar) {
                case "+":
                    suma(resultado);
                    break;
                case "-":
                    resta(resultado);
                    break;
                case "x":
                    multiplica(resultado);
                    break;
                case "/":
                    divide(resultado);
                    break;
                case "p":
                    op.sacar_potencia(resultado);
                    break;
                case "P":
                    op.sacar_potencia(resultado);
                    break;
                case "r":
                    op.raiz(resultado);
                    break;
                case "R":
                    op.raiz(resultado);
                    break;
                case "m":
                    Multi_Calculadora e = new Multi_Calculadora();
                    e.main(args);
                    break;
                case "M":
                    Multi_Calculadora ej = new Multi_Calculadora();
                    ej.main(args);
                    break;
                case "s":
                    break;
                case "S":
                    break;
                default:
                    String end = JOptionPane.showInputDialog("No a elegido ninguna operación.\n" + "(+): SUMA" + "\n(-): RESTA" + "\n(x): MULTIPLICACIÓN" + "\n(/): DIVISIÓN" + "\n(s): salir");
                    operar = end;
                    condicion = false;
                    break;
            }
        } while (!condicion);
    }
}
