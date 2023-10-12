/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generadorjson;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Joseph
 */
public class ObjetoJSON {
    
    private Map<String, ValorJSON> campos;
    private List<ValorJSON> valores;

    public ObjetoJSON() {
    }

    public ObjetoJSON(Map<String, ValorJSON> campos, List<ValorJSON> valores) {
        this.campos = campos;
        this.valores = valores;
    }

    public void agregarValor(ValorJSON vjson) {
        valores.add(vjson);
    }
    
    public void agregarCampo(String nombre, int ValorJSON) {
        
    }
    
    public void eliminarCampo(String nombre) {
        
    }

    public ValorJSON getCampos(String nombre) {

        return null;

    }
    
}
