
import java.util.Scanner;

public class Estagiario implements ReembolsoDespesas{

    //Atributo
    private double bolsa;

    public Estagiario(){

    }

    public Estagiario(double bolsa) {
        this.bolsa = bolsa;
    }
    @Override
    public boolean reembolso() {
        return false;
    }

    public void informeValorBolsa(){
        Scanner input = new Scanner(System.in);
        System.out.print("Favor informar o valor da Bolsa de estágio: R$ ");
        bolsa = input.nextDouble();
        System.out.println("O valor da bolsa de estágio é de R$ " + bolsa);
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
}
