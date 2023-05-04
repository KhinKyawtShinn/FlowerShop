public class Tulip implements IFlower{

    @Override
    public String Name(){
        return "Tulip";
    }

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
        return "Perfect and deep love";
    }

    @Override
    public boolean isIndoor(){
        return false;
    }

    @Override
    public double Price(){
        return 30.00;
    }
}
