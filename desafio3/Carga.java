package desafio3;

public class Carga {

    public String calculaFrete(double peso, double valor) {
            double freteCaminhao= peso *0.12 + valor*0.3;
            if (peso>40000) {
                freteCaminhao+=5000;
            }
            double freteVagao= peso *0.2 + valor*0.1;
            if (peso<15000) {
                freteCaminhao+=5000;
            }
            if (freteCaminhao<=freteVagao) {
                return "Transporte escolhido = Caminhao";
            }
            return "Transporte escolhido = Vagão";
    }
