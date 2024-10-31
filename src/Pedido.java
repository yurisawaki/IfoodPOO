import java.util.ArrayList;
import java.util.List;

public class Pedido {
    //Composicao e Information hiding
    private Cliente cliente;
    private Restaurante restaurante;
    private Pagamento pagamento;

    public Pedido(Cliente cliente, Restaurante restaurante) {
        this.cliente = cliente;
        this.restaurante = restaurante;
    }


    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }
}
