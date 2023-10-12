/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generadorjson;

/**
 *
 * @author Joseph
 */
public class GeneradorJSON {
    
    private ArchivoJSON ajson;
    private configuracionJSON configuracion;

    public void generarJSON() {
        ObjetoJSON objeto = new ObjetoJSON();
        ValorJSON valor = new ValorJSON();
        objeto.agregarValor(valor);
        
        ajson.agregarObjeto(objeto);
    }
    public ArchivoJSON generarArchivoJSON() {
        
        return null;
        
    }

    public configuracionJSON getConfiguracion() {
        return configuracion;
    }
    
    public static void main(String[] args) {
        GeneradorJSON gjson = new GeneradorJSON();
        gjson.generarJSON();
    }
    
}
