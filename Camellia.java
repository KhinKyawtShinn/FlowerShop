public abstract class Camellia implements IFlower{

    @Override
    public String Name(){
        return "Camellia";
    }
    public String Color(){
        return "Rosy pink";
    };

    public String Fragrance(){
        return "No smell";
    };

    public String Language(){
        return "Symbol of love, adoration and longing";
    };

    public Boolean isIndoor(){
        return false;
    };

    public double Price(){
        return 20.00;
    };

}
