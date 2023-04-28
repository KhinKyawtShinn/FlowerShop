public class Tulip implements IFlower{

    @Override
    public String Color() {
        return "White";
    }

    @Override
    public String Fragrance() {
        return "Honey-like";
    }

    @Override
    public String Language(){
        return "perfect and deep love";
    }

    @Override
    public boolean IsIndoor(){
        return false;
    }

    @Override
    public double Price(){
        return 30.00;
    }
}
