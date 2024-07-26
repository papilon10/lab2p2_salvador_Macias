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

            }

            break;
            case "9": {

            }

            break;
            case "10": {

            }

            break;
            case "11": {
                for (int i = 0; i < inventario.size(); i++) {
                    System.out.println(inventario = inventario + i + ") " + inventario.get(i) + "\n";
                
            
            ); 
        }
                
            }

            break;
            default:
                JOptionPane.showMessageDialog(null, "opcion ingresada es invalida");
        }//fin switch

    }//fin menu

}
