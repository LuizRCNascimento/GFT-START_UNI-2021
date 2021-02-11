package desafio2;

public class Teste {
    public static void main(String[] args) {


        Vagao v1 = new Vagao(18550,27500);
        System.out.println(v1);

        Caminhao c1 = new Caminhao(1000,200);
        System.out.println(c1);

        v1.calculaFrete();
        c1.calculaFrete();
    }
}
