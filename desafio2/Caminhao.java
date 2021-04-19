package desafio2;

public class Caminhao extends Carga implements Transporte {
    @Override
    public void calculaFrete() {
        double frete = getPeso() *0.12 + getValor()*0.3;
        if (getPeso()>40000) {
            frete*=0.75;
        }
        System.out.println(frete);
    }
}
