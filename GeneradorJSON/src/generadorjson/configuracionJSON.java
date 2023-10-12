/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generadorjson;

import java.util.Map;

/**
 *
 * @author Joseph
 */
class configuracionJSON {
    
    private GeneradorJSON gjson;
    private String formato;
    private Map<String, String> clavesPredeterminadas;

    public configuracionJSON(GeneradorJSON generador_json, Map<String, String> clavesPredeterminadas) {
        gjson = new GeneradorJSON();
        this.clavesPredeterminadas = clavesPredeterminadas;
    }

    public GeneradorJSON getGjson() {
        return gjson;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public Map<String, String> getClavesPredeterminadas() {
        return clavesPredeterminadas;
    }

    public void setClavesPredeterminadas(Map<String, String> clavesPredeterminadas) {
        this.clavesPredeterminadas = clavesPredeterminadas;
    }
    
}
