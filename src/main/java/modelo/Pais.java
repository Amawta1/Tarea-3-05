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
public class Pais {
    
    private int nroProvincias;
    private String capital;
    private LocalDate yearDescubrimiento;
    private String presidente;
    private String continente;
    private String nombre;

    public Pais(int nroProvincias, String capital, String presidente,String continente,String nombre) {
        this.nroProvincias = nroProvincias;
        this.capital = capital;
        this.yearDescubrimiento = yearDescubrimiento;
        this.presidente = presidente;
        this.continente = continente;
        this.nroProvincias = nroProvincias;
    }

    public Pais(int nroProvincia, int capital, LocalDate of, String presidente, String continente, String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getNroProvincias() {
        return nroProvincias;
    }

    public void setNroProvincias(int nroProvincias) {
        this.nroProvincias = nroProvincias;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public LocalDate getYearDescubrimiento() {
        return yearDescubrimiento;
    }

    public void setYearDescubrimiento(LocalDate yearDescubrimiento) {
        this.yearDescubrimiento = yearDescubrimiento;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Pais{" + "nroProvincias=" + nroProvincias + ", capital=" 
                + capital + ", yearDescubrimiento=" + yearDescubrimiento 
                + ", presidente=" + presidente + ", continente=" + continente + ", nombre=" + nombre + '}';
    }

   

   public int yearPais() {
        var years = LocalDate.now().getYear() - this.yearDescubrimiento.getYear();
        if (this.yearDescubrimiento.getMonthValue() < LocalDate.now().getMonthValue()) {
            years -= 1;
        }
        if (this.yearDescubrimiento.getMonthValue() == LocalDate.now().getMonthValue()) {
            if (this.yearDescubrimiento.getDayOfMonth() < LocalDate.now().getDayOfMonth()) {
                years -= 1;
            }

        }
        return years;
    }

    public int getCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getPais() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getCodigoPais() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getNombrePais() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
