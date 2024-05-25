// src/main/java/Pedido.java
import java.util.List;

public class Pedido {
    private List<String> platos;
    private List<String> bebidas;

    public Pedido(List<String> platos, List<String> bebidas) {
        this.platos = platos;
        this.bebidas = bebidas;
    }

    public List<String> getPlatos() {
        return platos;
    }

    public void setPlatos(List<String> platos) {
        this.platos = platos;
    }

    public List<String> getBebidas() {
        return bebidas;
    }

    public void setBebidas(List<String> bebidas) {
        this.bebidas = bebidas;
    }
}