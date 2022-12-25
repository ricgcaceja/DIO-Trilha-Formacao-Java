public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        //Ligando a TV      
        smartTv.ligar();
        System.out.println("TV Ligada ?: " + smartTv.ligada);
        System.out.println();

        //Testando mudar de canal
        System.out.println("Canal atual ?: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Novo Status - Canal atual ?: " + smartTv.canal);
        System.out.println();

        //Testando a interação com o volume da TV
        System.out.println("Volume atual ?: " + smartTv.volume);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual ?: " + smartTv.volume);
        System.out.println();       
        
        //Desligando a TV   
        smartTv.desligar();
        System.out.println("Novo Status - TV Ligada ?: " + smartTv.ligada);
    
    
    }
}
