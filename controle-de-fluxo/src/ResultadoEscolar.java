public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        //Abaixo temos uma condicional Composta/Encadeada.
        if (nota >= 7) {
            System.out.println("Aluno Aprovado!");
        }else if(nota >= 5 && nota < 7){
            System.out.println("Prova de Recuperação!");
        }else {
            System.out.println("Aluno Reprovado!");
        }
    }
}
