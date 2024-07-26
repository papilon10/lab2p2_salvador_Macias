/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_salvador;

/**
 *
 * @author Apple
 */
public class mapa {

    public char[][] matriz_chars;
    public int[] matriz_enteros;
    public int filas;
    public int columnas;

    public mapa() {
    }

    public mapa(char[][] matriz_chars, int[] matriz_enteros, int filas, int columnas) {
        this.matriz_chars = matriz_chars;
        this.matriz_enteros = matriz_enteros;
        this.filas = filas;
        this.columnas = columnas;
    }

    public char[][] getMatriz_chars() {
        return matriz_chars;
    }

    public void setMatriz_chars(char[][] matriz_chars) {
        this.matriz_chars = matriz_chars;
    }

    public int[] getMatriz_enteros() {
        return matriz_enteros;
    }

    public void setMatriz_enteros(int[] matriz_enteros) {
        this.matriz_enteros = matriz_enteros;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    @Override
    public String toString() {
        return "mapa{" + "matriz_chars=" + matriz_chars + ", matriz_enteros=" + matriz_enteros + ", filas=" + filas + ", columnas=" + columnas + '}';
    }

}
