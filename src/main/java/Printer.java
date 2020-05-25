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
        int beforePrint = this.getSheets();
        int pagesToPrint = numPages * numCopies;
        int afterPrint = beforePrint - pagesToPrint;
        this.setSheets(afterPrint);
        int tonerBefore = this.getToner();
        int tonerAfter = tonerBefore - pagesToPrint;
        this.setToner(tonerAfter);
    }



}

//    Add a method to print that takes in a number of pages and number of copies.
//        The print method will only run if the printer has enough paper. If it runs
//        it will reduce the value of the paper left by number of copies * number of pages.
//        Add a toner volume property to the class.
//        Modify the printer so that it reduces the toner by 1 for each page printed.