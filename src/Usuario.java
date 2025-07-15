public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        // ligando TV:
        System.out.println("Tv Ligada? " + smartTv.ligada);
        smartTv.ligar();
        System.out.println("Tv Ligada? " + smartTv.ligada);

        // funcionamento volume:

        System.out.println("-".repeat(30));
        System.out.println("Volume Atual: " + smartTv.volume);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume Atual: " + smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        // funcionamento canal:
        System.out.println("-".repeat(30));
        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        System.out.println("Canal Atual: " + smartTv.canal);

        // desligando a TV:
        System.out.println("-".repeat(30));
        System.out.println("Tv Ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Tv Ligada? " + smartTv.ligada);
    }
}
