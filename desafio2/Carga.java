package desafio2;

public class Carga {
    private double valor; 
    private double peso;

    public Carga() {
        this.valor = valor;
        this.peso = peso;
    }
    public Carga(double valor, double peso) {
        this.valor = valor;
        this.peso = peso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Carga{" + "valor= " + valor + ", peso= " + peso + '}';
    }
}
