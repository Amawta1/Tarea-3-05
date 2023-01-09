/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.time.LocalDate;
import java.util.List;
import modelo.Pais;
import servicio.PaisServiceImpl;

/**
 *
 * @author USUARIO
 */
public class PaisControl {

    private PaisServiceImpl paisServiceImpl = new PaisServiceImpl();
   
    

    public String crear(String[] data) {
        var retorno = "No se puede crear Pais";
        
        var nroProvincia = Integer.valueOf(data[0]).intValue();
        var capital = data[1];
        var year = Integer.valueOf(data[2]).intValue();
        var mes = Integer.valueOf(data[3]).intValue();
        var dia = Integer.valueOf(data[4]).intValue();
        var presidente = data[5];
        var continente = data[6];
        var nombre = data[7];
        var codigo = Integer.valueOf(data[8]).intValue();
        
        if (year > LocalDate.now().getYear()) {
            retorno += " El año no es valido ";
        } else {
            if (mes < 1 || mes > 12) {
                retorno += " El mes no es valido ";
            } else {
                if (dia < 0 || dia > 31) {
                    retorno += " El dia no es valido ";
                } else {
                    if (nroProvincia < 0) {
                        retorno += " El numero de provincia no es valido";
                    } 
                    var pais = new Pais(nroProvincia, capital,LocalDate.of(year, mes, dia), presidente, continente, nombre,codigo);
                    this.paisServiceImpl.crear(pais);
                    retorno = "Pais creado exitosamente";
                }
            }
        }
        return retorno;     
    }

    public List<Pais> listar() {
        return this.paisServiceImpl.listar();

    }
    public String modificar(String[] data) {
        var retorno = "No se puede crear Pais";
        
        var nroProvincia = Integer.valueOf(data[0]).intValue();
        var capital = Integer.valueOf(data[1]).intValue();
        var year = Integer.valueOf(data[2]).intValue();
        var mes = Integer.valueOf(data[3]).intValue();
        var dia = Integer.valueOf(data[4]).intValue();
        var presidente = data[5];
        var continente = data[6];
        var nombre = data[7];
        var codigo = Integer.valueOf(data[8]).intValue();
        var paisModificado = Integer.valueOf(data[9]).intValue();
        
        if (year > LocalDate.now().getYear()) {
            retorno += " El año no es valido ";
        } else {
            if (mes < 1 || mes > 12) {
                retorno += " El mes no es valido ";
            } else {
                if (dia < 0 || dia > 31) {
                    retorno += " El dia no es valido ";
                } else {
                    if (nroProvincia < 0) {
                        retorno += " El numero de provincia no es valido";
                    } 
                    var pais = new Pais(nroProvincia, capital,LocalDate.of(year, mes, dia), presidente, continente, nombre,codigo);
                    this.paisServiceImpl.modificar(pais, paisModificado);
                    retorno = "Pais modificado exitosamente";
                }
            }
        }
        return retorno; 
    }

    public void eliminar(String codigos) {
        var codigo = Integer.valueOf(codigos).intValue();
        this.paisServiceImpl.eliminar(codigo);

    }
  
}
