package desafio2;

public class Vagao extends Carga implements Transporte {

    @Override
    public void calculaFrete() {
        double frete = getPeso() *0.2 + getValor()*0.1;
        if (getPeso()<15000) {
            frete+=5000;
        }
        System.out.println(frete);
    }
}
