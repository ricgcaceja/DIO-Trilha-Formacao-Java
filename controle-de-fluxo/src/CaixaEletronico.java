public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        double saldo = 25.0;
        double valorSolicitado = 27.0;

        //Abaixo temos uma condicional Simples.
        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
        }

        System.out.println("Saldo atual R$" + saldo);
    }
}
