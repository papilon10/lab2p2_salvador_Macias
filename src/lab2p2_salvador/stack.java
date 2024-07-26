/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_salvador;

/**
 *
 * @author Apple
 */
public class stack {

    public objeto Objeto;
    public int cantidad;

    public stack() {
    }

    public stack(objeto Objeto, int cantidad) {
        this.Objeto = Objeto;
        this.cantidad = cantidad;
    }

    public objeto getObjeto() {
        return Objeto;
    }

    public void setObjeto(objeto Objeto) {
        this.Objeto = Objeto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "stack{" + "Objeto=" + Objeto + ", cantidad=" + cantidad + '}';
    }

}
