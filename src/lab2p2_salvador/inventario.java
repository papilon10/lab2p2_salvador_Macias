/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_salvador;

/**
 *
 * @author Apple
 */
import java.util.ArrayList;

public class inventario {

    public ArrayList<stack> lista_stacks = new ArrayList<>();
    public int objeto;

    public inventario() {
    }

    public inventario(int objeto) {
        this.objeto = objeto;
    }

    public ArrayList<stack> getLista_stacks() {
        return lista_stacks;
    }

    public void setLista_stacks(ArrayList<stack> lista_stacks) {
        this.lista_stacks = lista_stacks;
    }

    public int getObjeto() {
        return objeto;
    }

    public void setObjeto(int objeto) {
        this.objeto = objeto;
    }

    @Override
    public String toString() {
        return "inventario{" + "lista_stacks=" + lista_stacks + ", objeto=" + objeto + '}';
    }

}
