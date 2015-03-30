/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package multi_calculadora;

import javax.swing
        .JOptionPane;

/**
 *
 * @author LUIS LAVADO
 */
public class Multi_Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String opcion = JOptionPane.showInputDialog("****BIENVENIDO A MULTIEJERCICIOS****\n"
                + "\nELIGA UNA OPCIÓN: \n" + "\n(1): OPERACIONES BÁSICAS" + "\n(2): OTRAS OPERACIONES " + "\n(3): SALIR ");
        boolean condicion = true;
        do {
            switch (opcion) {
                case "1":
                    operaciones_basicas ob = new operaciones_basicas();
                    ob.operaciones();
                    break;
                case "2":
                    mas_operaciones mo = new mas_operaciones();
                    mo.operaciones();
                    break;
                case "s":
                    break;
                case "S":
                    break;
                default:
                    String end = JOptionPane.showInputDialog("No a elegido ninguna operación.\n"+ "\n(1): OPERACIONES BÁSICAS" + "\n(2): OTRAS OPERACIONES " + "\n(3): SALIR ");
                    opcion = end;
                    condicion = false;
                    break;
            }
        } while (!condicion);
    }
}
