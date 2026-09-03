public class Tv {
    private int channel;
    private int nivelVolumen;
    private boolean on;

    public Tv(int channel,int nivelVolumen,boolean on){
        if(channel >= 0 && channel <= 100) {
            this.channel = channel;
        }
        else{
            this.channel = 0;
        }
        if(nivelVolumen >= 0 && nivelVolumen <= 100){
            this.nivelVolumen = nivelVolumen;
        }
        else{
            this.nivelVolumen = 50;
        }
        if(on == false){
            this.nivelVolumen = 0;
            this.channel = 0;
        }
        else{
            this.on = on;
        }
    }

    public boolean isOn(){
        if(on == true)
            return true;
        return false;
    }
    public void turnOn(){
        on = true;
        System.out.println("Tv encendida");
    }

    public void turnOff(){
        on = false;
        System.out.println("Tv apagada");
    }

    public void setChannel(int newChannel){
        if(isOn()){
            this.channel = newChannel;
            System.out.println("Canal: " + channel);
        }
        else {
            System.out.println("Tv apagada, por favor prendela no seas burro");
        }
    }

    public void channelUp(){
        if(isOn()){
            if(channel == 100){
                this.channel = 0;
            }
            else{
                this.channel += 1;
            }
            System.out.println("Canal: " + channel);
        }
        else{
            System.out.println("Tv apagada");
        }

    }

    public void channelDown(){
        if(isOn()){
            if(channel == 0){
                this.channel = 100;
            }
            else{
                this.channel -= 1;
            }
            System.out.println("Canal: " + channel);
        }
        else {
            System.out.println("Tv apagada");
        }
    }

    public void volumeUp(){
        if(isOn()){
            if(nivelVolumen >= 100){
                System.out.println("Volumen maximo ");
            }
            else{
                nivelVolumen += 1;
                System.out.println("Vol: " + nivelVolumen);
            }
        }
        else{
            System.out.println("Tv apagada");
        }
    }

    public void volumeDown(){
        if(isOn()){
            if(nivelVolumen <= 0 )
                System.out.println("Volumen minimo");
            else{
                this.nivelVolumen -= 1;
                System.out.println("Vol: " + nivelVolumen);
            }
        }
        else{
            System.out.println("Tv apagada");
        }
    }
}
