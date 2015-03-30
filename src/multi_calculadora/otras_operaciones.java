/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package multi_calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class otras_operaciones {
    String c = "";
    double resultado = 0;
    operaciones_basicas op = new operaciones_basicas();
    public void potencia() {
        double resultado = 1;
        double n, n1;  
        String a = JOptionPane.showInputDialog("Ingrese valor: ");
        n = Double.parseDouble(a);
        String b = JOptionPane.showInputDialog("Potencia de " + n + " elevado a: ");
        n1 = Double.parseDouble(b);
        for (double i = 1; i <= n1; i++) {
            resultado = resultado * n;
        }
        JOptionPane.showMessageDialog(null, "potencia de " + n + " elevado a " + n1 + " es " + resultado);
        c = JOptionPane.showInputDialog("resultado es: " + resultado + "\n(p): seguir con la potencia " +"\n(+): sumar"+ "\n(-): restar" + "\n(x): multiplicar" + "\n(/): dividir" +"\n(r): sacar la raiz cuadrada"+"\n(m): volver al menú" + "\n(s): salir");
        operaciones_basicas ob= new operaciones_basicas();
        ob.opciones(c, resultado);        
    }

    void raiz_cuadrada() {
        String a = JOptionPane.showInputDialog("Ingrese valor: ");
        resultado = Double.parseDouble(a);
        double j= resultado;
        resultado= Math.sqrt(resultado);
        JOptionPane.showMessageDialog(null, "La raiz cuadrada de " + j + " es: " + resultado); //metodo que calcula la raiz cuadrada Math ES UNA clase. out es un objeto
        //System es es una clase, println es un llamado.
        c = JOptionPane.showInputDialog("La raiz cuadrada de " + j + " es: " + resultado + "\n(p): seguir sacando raiz " +"\n(+): sumar"+ "\n(-): restar" + "\n(x): multiplicar" + "\n(/): dividir" +"\n(p): sacar su potencia"+"\n(m): volver al menú" + "\n(s): salir");
        operaciones_basicas ob= new operaciones_basicas();
        ob.opciones(c, resultado);
    }
    void sacar_potencia(double resultado){
        double n=0;
        String b = JOptionPane.showInputDialog("Potencia de " + resultado + " elevado a: ");
        double n1 = Double.parseDouble(b);
        n = resultado;
        resultado=1;
        for (double i = 1; i <= n1; i++) {
            resultado = resultado*n;
        }
        JOptionPane.showMessageDialog(null, "potencia de " + n + " elevado a " + n1 + " es " + resultado);
        c = JOptionPane.showInputDialog("resultado es: " + resultado + "\n(p): seguir con la potencia " +"\n(+): sumar"+ "\n(-): restar" + "\n(x): multiplicar" + "\n(/): dividir" +"\n(r): sacar la raiz cuadrada"+"\n(m): volver al menú" + "\n(s): salir");
        operaciones_basicas ob= new operaciones_basicas();
        ob.opciones(c, resultado);
    }
    void raiz(double resultado){
        double j= resultado;
        resultado= Math.sqrt(resultado);
        JOptionPane.showMessageDialog(null, "La raiz cuadrada de " + j + " es: " + resultado);
        c = JOptionPane.showInputDialog("La raiz cuadrada de " + j + " es: " + resultado + "\n(p): seguir sacando raiz " +"\n(+): sumar"+ "\n(-): restar" + "\n(x): multiplicar" + "\n(/): dividir" +"\n(p): sacar su potencia"+"\n(m): volver al menú" + "\n(s): salir");
        operaciones_basicas ob= new operaciones_basicas();
        ob.opciones(c, resultado);
    }
}
