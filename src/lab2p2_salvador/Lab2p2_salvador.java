/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_salvador;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Apple
 */
public class Lab2p2_salvador {

    /**
     * @param args the command line arguments
     */
    public static ArrayList inventario = new ArrayList();
    public static Scanner lea = new Scanner(System.in);

    public static void main(String[] args) {

        menu();
        inventario.add(new objeto("madera", 0));
        inventario.add(new objeto("madera", 0));
        inventario.add(new objeto("madera", 0));
        inventario.add(new objeto("madera", 0));
        inventario.add(new objeto("piedra", 0));
        inventario.add(new objeto("piedra", 0));
        inventario.add(new objeto("piedra", 0));

    }

    public static void menu() {
        String opcion = JOptionPane.showInputDialog(null, "Ingrese una opcion"
                + "\n0.Mover arriba"
                + "\n1.Mover abajo"
                + "\n2.Mover izquierda"
                + "\n3.Mover derecha"
                + "\n4.Obtener objeto arriba"
                + "\n5.Obtener objeto abajo"
                + "\n6.Obtener objeto izquierda"
                + "\n7.Obtener objeto derecha"
                + "\n8.Craftear palo"
                + "\n9.Craftear pico"
                + "\n10.Craftear hacha"
                + "\n11.Craftear antorcha"
                + "\n12.Eliminar objeto inventario"
                + "\n13.Ver inventario"
        );

        switch (opcion) {
            case "1": {

            }

            break;

            case "2": {

            }

            break;
            case "3": {

            }

            break;
            case "4": {

            }

            break;
            case "5": {

            }

            break;
            case "6": {

            }

            break;
            case "7": {

            }

            break;
            case "8": {
                inventario.add(new objeto("palo", 0));
                JOptionPane.showMessageDialog(null, "El palo se ha creado exitosamente...");
            }

            break;
            case "9": {
                inventario.add(new objeto("pico", 0));
                JOptionPane.showMessageDialog(null, "El pico se ha creado exitosamente...");

            }

            break;
            case "10": {
                inventario.add(new objeto("hacha", 0));
                JOptionPane.showMessageDialog(null, "La hacha se ha creado exitosamente...");

            }

            break;
            case "11": {
                inventario.add(new objeto("antorcha", 0));
                JOptionPane.showMessageDialog(null, "La antorcha se ha creado exitosamente...");

            }
            case "12": {
                if (inventario.isEmpty()) {
                    System.out.println("el inventario no cuenta con recursos...");

                } else {
                    for (int i = 0; i < inventario.size(); i++) {
                        System.out.println(
                                inventario.indexOf(inventario.get(i)) + "-"
                                + inventario.get(i)
                        );

                    }

                }
                String i = JOptionPane.showInputDialog("Ingrese el indice del objeto a eliminar: ");
                inventario.remove(i);
                JOptionPane.showMessageDialog(null, "el objeto se ha eliminado con exito");
            }
            case "13": {
                if (inventario.isEmpty()) {
                    System.out.println("el inventario no cuenta con recursos...");

                } else {
                    for (int i = 0; i < inventario.size(); i++) {
                        System.out.println(
                                inventario.indexOf(inventario.get(i)) + "-"
                                + inventario.get(i)
                        );

                    }

                }

            }

            break;
            default:
                JOptionPane.showMessageDialog(null, "opcion ingresada es invalida");
        }//fin switch

    }//fin menu

}
