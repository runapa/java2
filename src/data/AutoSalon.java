package data;

public class AutoSalon {
    private static final int CAR_QUANTITY = 5;
    private static final double INTEREST = 0.2;

    private Auto[] places;
    private long balance;

    public AutoSalon(long balance) {
        this.balance = balance;
        places = new Auto[CAR_QUANTITY];
    }

    public void buyAuto(Auto auto) throws Exception{
        int freePlace = getFreePlace();
        if(freePlace < 0){

            throw new Exception("No free places, sell an Auto");
            //System.out.println("No free places, sell an Auto");
            //return;
        }
        this.balance = this.balance - auto.getPrice();
        places[freePlace] = auto;
    }

    private int getFreePlace(){
        for (int i = 0; i < places.length; i++) {
            if(places[i] == null){
                return i;
            }
        }
        return -1;
    }

    public void printreport(){
        //TODO HW;
        //Place - Price
        for (int i = 0; i < places.length; i++) {
            if(places[i] != null){
                System.out.print("[");
                System.out.print(i + 1 + " - " + places[i].getPrice());
                System.out.print("]");
                System.out.println();
            }
        }
        System.out.println("The balance is: " + this.balance);
    }

    public Auto sellAuto(){
        //TODO HW;
        int finalPrice;
        for (int i = 0; i < places.length; i++) {
            if(places[i] != null){
                finalPrice = (int)(places[i].getPrice() * getInterest());
                System.out.println("The auto sold for " + finalPrice);
                places[i] = null;
                break;
            }
        }
        return null;
    }

    public Auto sellAutoByPlace(int place){
        place -= 1;
        int finalPrice;
        if(place < 0 || place > places.length){
            System.out.println("Wrong place");
        }
        if(places[place] != null){
            finalPrice = (int)(places[place].getPrice() * getInterest());
            System.out.println("The auto sold for " + finalPrice);
            this.balance =  this.balance + finalPrice;
            places[place] = null;
        }
        return null;
    }

    private double  getInterest(){
        return 1 + INTEREST;
    }
}
