/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generadorjson;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Joseph
 */
class ArchivoJSON {
    
    private List<ObjetoJSON> objetos_json;

    public ArchivoJSON() {
        objetos_json = new ArrayList<>();
    }
    public void agregarObjeto(ObjetoJSON objeto_json) {
        objetos_json.add(objeto_json);
    }
    public void eliminarObjetoJSON(ObjetoJSON objeto_json) {
        
    }
    public void guardarEnDisco(String nombreArchivo) {
        
    }
    
}
