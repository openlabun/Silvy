/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generadorjson;

import java.io.FileWriter;
import java.io.IOException;
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
        objetos_json.remove(objeto_json);
    }

    public void guardarEnDisco(String nombreArchivo) {
        try ( FileWriter file = new FileWriter(nombreArchivo)) {
            for (ObjetoJSON objeto : objetos_json) {
                file.write(objeto.toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
