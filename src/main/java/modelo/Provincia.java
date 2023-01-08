/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USUARIO
 */
public class Provincia {

    private String nombre;
    private double expancionTerritorial;
    private Pais pais;
    private double nroHabitantes;
    private int codigo;

    public Provincia(String nombre, double expancionTerritorial, Pais pais, double nroHabitantes, int codigo) {
        this.nombre = nombre;
        this.expancionTerritorial = expancionTerritorial;
        this.pais = pais;
        this.nroHabitantes = nroHabitantes;
        this.codigo = codigo;
    }

    public Provincia(String nombre, double expancionTerritorial, String pais, double nroHabitantes, int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getExpancionTerritorial() {
        return expancionTerritorial;
    }

    public void setExpancionTerritorial(double expancionTerritorial) {
        this.expancionTerritorial = expancionTerritorial;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public double getNroHabitantes() {
        return nroHabitantes;
    }

    public void setNroHabitantes(double nroHabitantes) {
        this.nroHabitantes = nroHabitantes;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Provincia{" + "nombre=" + nombre + ", expancionTerritorial=" + 
                expancionTerritorial + ", pais=" + pais + ", nroHabitantes=" + 
                nroHabitantes + ", codigo=" + codigo + '}';
    }

    public int getCodigoProvincia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
