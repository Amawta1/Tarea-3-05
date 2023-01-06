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
    private int inicioCedula;
    private Pais pais;
    private double nroHabitantes;

public Provincia(String nombre, double expancionTerritorial, int inicioCedula, Pais pais, double nroHabitantes) {
        this.nombre = nombre;
        this.expancionTerritorial = expancionTerritorial;
        this.inicioCedula = inicioCedula;
        this.pais = pais;
        this.nroHabitantes = nroHabitantes;
    }

    public Provincia(String nombre, double expancionTerritorial, String inicioCedula, String pais, double nroHabitantes) {
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

    public int getInicioCedula() {
        return inicioCedula;
    }

    public void setInicioCedula(int inicioCedula) {
        this.inicioCedula = inicioCedula;
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

    @Override
    public String toString() {
        return "Provincia{" + "nombre=" + nombre + ", expancionTerritorial=" + expancionTerritorial + ", inicioCedula=" + inicioCedula + ", pais=" + pais + ", nroHabitantes=" + nroHabitantes + '}';
    }

    public int getCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getCedula() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getCodigoProvincia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



}

