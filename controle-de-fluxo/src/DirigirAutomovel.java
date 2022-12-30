public class DirigirAutomovel {
    public static void main(String[] args) {
        int idade = 15;
        boolean PossuiCarteiraMotorista = true;
        
        //Abaixo temos um operador Ternário
        String autorizacao = idade >= 16 && PossuiCarteiraMotorista == true ?  "Você pode dirigir automóvel!" : "Você não pode dirigir automóvel!";
    
        System.out.println(autorizacao);
    }
}
