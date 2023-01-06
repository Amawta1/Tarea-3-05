/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Canton;

/**
 *
 * @author USUARIO
 */
public class CantonServiceImpl implements CantonService {
    
   private static List<Canton> cantonList;

    public CantonServiceImpl() {
        this.cantonList = new ArrayList<>();
    }

    @Override
    public void crear(Canton canton) {
        this.cantonList.add(canton);
    }

    @Override
    public Canton buscarPorCodigo(int codigo) {
        Canton retorno = null;
        for (var canton : this.cantonList) {
            if (codigo == canton.getCodigoCanton()) {
                retorno = canton;
                break;
            }
        }
        return retorno;
    }

    @Override
    public List<Canton> listar() {
        return this.cantonList;
    }

    @Override
    public Canton buscarPorNombre(String nombre) {
        Canton retorno = null;

        for (var canton : this.cantonList) {
            if (nombre.equals(canton.getNombreCanton())) {
                retorno = canton;
                break;
            }
        }

        return retorno;
    }

    @Override
    public void modificar(Canton canton, int codigo) {
        var indice = -1;
        for (var cantones : this.cantonList) {
            indice++;
            if (codigo == cantones.getCodigoCanton()) {
                this.cantonList.set(indice, canton);
            }
        }
    }

    @Override
    public void eliminar(int codigo) {
        var indice = -1;
        for (var cantones : this.cantonList) {
            indice++;
            if (codigo == cantones.getCodigoCanton()) {
                this.cantonList.remove(indice);

            }

        }
    }
}
