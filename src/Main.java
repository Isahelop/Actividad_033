public class Main{
    public static void main(String[] args){
        Tv miTv = new Tv(0,15,false);

        miTv.setChannel(35);

        miTv.turnOn();

        miTv.setChannel(35);

        miTv.channelDown();

        miTv.volumeDown();

        miTv.volumeUp();
        miTv.volumeUp();
        miTv.volumeDown();
    }
}