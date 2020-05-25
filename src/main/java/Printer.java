public class Printer {

    private int sheets;
    private int toner;

    public Printer(int sheetsLeft, int toner) {
        this.sheets = sheets;
        this.toner = toner;
    }
    public int getSheets(){
        return this.sheets;
    }

    public int getToner(){
        return this.toner;
    }

    public void setSheets(int newSheets){
        this.sheets = newSheets;
    }


    public void setToner(int newToner){
        this.toner = newToner;
    }


}
