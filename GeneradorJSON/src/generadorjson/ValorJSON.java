/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generadorjson;

/**
 *
 * @author Joseph
 */
class ValorJSON {

    private String tipo;
    private Object valor;

    public ValorJSON(Object valor) {
        this.valor = valor;
        this.tipo = valor.getClass().getSimpleName();
    }

    ValorJSON() {
            
    }

    public String getTipo() {
        return tipo;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

}
