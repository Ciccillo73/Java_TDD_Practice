public class WaterBottle {
    private int volume ;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public int sub(){
        return this.volume - 10;
    }

    public int setEmpty(){
        return this.volume = 0;
    }

}
