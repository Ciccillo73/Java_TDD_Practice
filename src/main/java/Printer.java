public class Printer {

    private int sheetsLeft;
    private int toner;

    public Printer(int sheetsLeft, int toner) {
        this.sheetsLeft = sheetsLeft;
        this.toner = toner;
    }
    public int getSheetsLeft(){
        return this.sheetsLeft;
    }

    public int getToner(){
        return this.toner;
    }

    public void setSheetsLeft(int newToner){
        this.toner = newToner;
    }



}
