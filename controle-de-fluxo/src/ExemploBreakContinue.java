public class ExemploBreakContinue {
    public static void main(String[] args) {
        
        System.out.println("Usando Break");
        for(int numero = 1; numero <=5 ; numero++){           
            if(numero == 3)
                break;
            System.out.println(numero);    
        }

        System.out.println("-----------------");

        System.out.println("Usando Continue");
        for(int numero = 1; numero <=5 ; numero++){           
            if(numero == 3)
                continue;
            System.out.println(numero);    
        }
    
    
    
    }
}
