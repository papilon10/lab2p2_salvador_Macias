/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_salvador;

/**
 *
 * @author Apple
 */
public class objeto {

    public String nombre;
    public int durabilidad;

    public objeto() {
    }

    public objeto(String nombre, int durabilidad) {
        this.nombre = nombre;
        this.durabilidad = durabilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDurabilidad() {
        return durabilidad;
    }

    public void setDurabilidad(int durabilidad) {
        this.durabilidad = durabilidad;
    }

    @Override
    public String toString() {
        return "objeto{" + "nombre=" + nombre + ", durabilidad=" + durabilidad + '}';
    }

}
