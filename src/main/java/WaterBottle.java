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

    public void empty(){
        this.setVolume(0);
    }

    public void full(){
        this.setVolume(100);
    }

}
