public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "G";

        //Abaixo temos o controle de fluxo usando Switch/Case
        switch (sigla) {
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MÉDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
                break;
            }           
        
        }
    }

