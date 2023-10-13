/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generadorjson;

import java.util.HashMap;
import java.util.Map;

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
        ArchivoJSON archivo = new ArchivoJSON();
        ObjetoJSON objeto = new ObjetoJSON();
        ValorJSON valor = new ValorJSON("Ejemplo");
        objeto.agregarValor(valor);
        archivo.agregarObjeto(objeto);
        return archivo;
    }

    public configuracionJSON getConfiguracion() {
        return configuracion;
    }

    public static void main(String[] args) {
//        GeneradorJSON gjson = new GeneradorJSON();
//        gjson.generarJSON();

        
        GeneradorJSON gjson = new GeneradorJSON();

        // Crear valores para la Persona 1
        ValorJSON nombre1 = new ValorJSON("Juan Perez");
        ValorJSON edad1 = new ValorJSON(25);
        ValorJSON casado1 = new ValorJSON(false);

        // Crear mapa de campos para la Persona 1
        Map<String, ValorJSON> campos1 = new HashMap<>();
        campos1.put("nombre", nombre1);
        campos1.put("edad", edad1);
        campos1.put("casado", casado1);

        // Crear ObjetoJSON para la Persona 1
        ObjetoJSON persona1 = new ObjetoJSON(campos1, null);

        // Crear valores para la Persona 2
        ValorJSON nombre2 = new ValorJSON("Maria Gonzalez");
        ValorJSON edad2 = new ValorJSON(30);
        ValorJSON casado2 = new ValorJSON(true);

        // Crear mapa de campos para la Persona 2
        Map<String, ValorJSON> campos2 = new HashMap<>();
        campos2.put("nombre", nombre2);
        campos2.put("edad", edad2);
        campos2.put("casado", casado2);

        // Crear ObjetoJSON para la Persona 2
        ObjetoJSON persona2 = new ObjetoJSON(campos2, null);

        // Crear valores para la Persona 3
        ValorJSON nombre3 = new ValorJSON("Carlos Lopez");
        ValorJSON edad3 = new ValorJSON(40);
        ValorJSON casado3 = new ValorJSON(false);

        // Crear mapa de campos para la Persona 3
        Map<String, ValorJSON> campos3 = new HashMap<>();
        campos3.put("nombre", nombre3);
        campos3.put("edad", edad3);
        campos3.put("casado", casado3);

        // Crear ObjetoJSON para la Persona 3
        ObjetoJSON persona3 = new ObjetoJSON(campos3, null);

        // Crear ArchivoJSON y agregar los objetos JSON
        ArchivoJSON archivo = new ArchivoJSON();
        archivo.agregarObjeto(persona1);
        archivo.agregarObjeto(persona2);
        archivo.agregarObjeto(persona3);

        // Configurar el archivo JSON en el generador JSON
        gjson.ajson = archivo;

        // Intentar guardar el archivo JSON en el disco
        archivo.guardarEnDisco("salida.json");

        // Imprimir las representaciones en String de los objetos JSON para verificar el contenido
        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
    }

}
