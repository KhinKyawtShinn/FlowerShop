public class Camellia implements IFlower{

    @Override
    public String Name(){
        return "Camellia";
    }

    @Override
    public String Color(){
        return "Rosy pink";
    }

    @Override
    public String Fragrance(){
        return "No smell";
    }

    @Override
    public String Language(){
        return "Symbol of love, adoration and longing";
    }

    @Override
    public boolean isIndoor(){
        return false;
    }

    @Override
    public double Price(){
        return 20.00;
    }
}
