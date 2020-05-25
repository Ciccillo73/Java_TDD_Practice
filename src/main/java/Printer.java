public class Printer {

    private int sheets;
    private int toner;

    public Printer(int sheets, int toner) {
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

    public void print(int numPages, int numCopies){
        int tonerBefore = this.getToner();
        int beforePrint = this.getSheets();
        int pagesToPrint = numPages * numCopies;

        if(ifEnoughPaper(pagesToPrint)){
            int afterPrint = beforePrint - pagesToPrint;
            this.setSheets(afterPrint);
            int tonerAfter = tonerBefore - pagesToPrint;
            this.setToner(tonerAfter);
        }
    }

    public boolean ifEnoughPaper(int totalPagesToPrint){
        if(this.getSheets() >= totalPagesToPrint){
            return true;
        }else{
            return false;
        }
    }

}

