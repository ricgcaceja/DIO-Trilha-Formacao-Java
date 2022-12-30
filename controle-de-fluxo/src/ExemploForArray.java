public class ExemploForArray {
    public static void main(String[] args) {
        //O arrray abaixo é um conjunto de elementos  do tipo String.
        String alunos[] = { "José", "Maria", "Pedro", "Alexandre", "Paulo"};

        //Abaixo temos uma forma antiga de interar o for com arrays        
        for(int x=0; x<alunos.length; x++){
            System.out.println("O aluno do índice x=" + x + " é " + alunos[x]);

         }

         System.out.println();

        //Abaixo temos uma forma mais limpa de se trabalhar com arrays
        for(String aluno : alunos){
            System.out.println(" O nome do aluno é: " + aluno);
        }
    }
}
