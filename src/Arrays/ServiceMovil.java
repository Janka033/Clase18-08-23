package Arrays;

public class ServiceMovil {
    Cliente cliente;
    private int numeroCelular;

    public ServiceMovil(Cliente cliente, int numeroCelular) {
        this.cliente = cliente;
        this.numeroCelular = numeroCelular;
    }

    @Override
    public String toString() {
        return "ServiceMovil{" +
                "cliente=" + cliente +
                ", numeroCelular='" + numeroCelular + '\'' +
                '}';
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }
}
