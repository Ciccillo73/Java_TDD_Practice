public class WaterBottle {
    private int volume ;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public void drink(){
        int startDrink = this.getVolume();
        int afterDrink = startDrink - 10;
        this.setVolume(afterDrink);
    }

    public int setEmpty(){
        return this.volume = 0;
    }

}
