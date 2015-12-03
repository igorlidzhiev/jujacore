public class EggsBread{
    public static String printPurchases(boolean hasEggs, boolean hasBread) {
        String purchases = null;
        if(hasEggs == true && hasBread == true){
            purchases = "eggs, bread";
        }
        else if(hasEggs == true){
            purchases = "eggs";
        }
        else if(hasBread == true){
            purchases = "bread";
        }
        else purchases = "";
        return purchases;
    }
}

