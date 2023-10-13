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

    @Override
    public String toString() {
        StringBuilder json = new StringBuilder("{");

        // Agregar los campos al JSON
        if (campos != null && !campos.isEmpty()) {
            for (Map.Entry<String, ValorJSON> entry : campos.entrySet()) {
                json.append("\"").append(entry.getKey()).append("\": ");
                ValorJSON valor = entry.getValue();
                if (valor.getTipo().equals("String")) {
                    json.append("\"").append(valor.getValor()).append("\", ");
                } else {
                    json.append(valor.getValor()).append(", ");
                }
            }
            // Eliminar la última coma y espacio
            json.setLength(json.length() - 2);
        }

        json.append("}");

        return json.toString();
    }

    public ObjetoJSON(Map<String, ValorJSON> campos, List<ValorJSON> valores) {
        this.campos = campos;
        this.valores = valores;
    }

    public void agregarValor(ValorJSON vjson) {
        valores.add(vjson);
    }
    
    public void agregarCampo(String nombre, int valorJSON) {
        ValorJSON vjson = new ValorJSON(valorJSON);
        campos.put(nombre, vjson);
    }
    
    public void eliminarCampo(String nombre) {
        campos.remove(nombre);
    }

    public ValorJSON getCampos(String nombre) {
        return campos.get(nombre);
    }
    
}
