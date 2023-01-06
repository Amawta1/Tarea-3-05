/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author USUARIO
 */
public class Canton {
    
    private String nombre;
    private double expancionTerritorial;
    private LocalDate yearFundacion;
    private double nroHabitantes;
    private Provincia provincia;

public Canton(String nombre, double expancionTerritorial, double nroHabitantes, Pais pais, Provincia provincia) {
        this.nombre = nombre;
        this.expancionTerritorial = expancionTerritorial;
        this.yearFundacion = yearFundacion;
        this.nroHabitantes = nroHabitantes;
        this.provincia = provincia;
    }

    public Canton(String nombre, int expancionTerritorial, int nroHabitantes, String pais, String provincia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Canton(String nombre, int expancionTerritorial, LocalDate of) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Canton(String nombre, int expancionTerritorial, LocalDate of, int nroHabitantes, String pais, String provincia) {
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

    public LocalDate getYearFundacion() {
        return yearFundacion;
    }

    public void setYearFundacion(LocalDate yearFundacion) {
        this.yearFundacion = yearFundacion;
    }

    public double getNroHabitantes() {
        return nroHabitantes;
    }

    public void setNroHabitantes(double nroHabitantes) {
        this.nroHabitantes = nroHabitantes;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Canton{" + "nombre=" + nombre + ", expancionTerritorial=" 
                + expancionTerritorial + ", yearFundacion=" + yearFundacion 
                + ", nroHabitantes=" + nroHabitantes + ", provincia=" + provincia + '}';
    }
 
    public int yearCanton() {
        var years = LocalDate.now().getYear() - this.yearFundacion.getYear();
        if (this.yearFundacion.getMonthValue() < LocalDate.now().getMonthValue()) {
            years -= 1;
        }
        if (this.yearFundacion.getMonthValue() == LocalDate.now().getMonthValue()) {
            if (this.yearFundacion.getDayOfMonth() < LocalDate.now().getDayOfMonth()) {
                years -= 1;
            }

        }
        return years;
        
    }

    public int getCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getCodigoCanton() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getNombreCanton() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
