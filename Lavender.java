public class Lavender implements IFlower{


    @Override
    public String Name() {
        return "Lavender";
    }
    
    @Override
    public String Color() {
        return "Purple";
    }

    @Override
    public String Fragrance() {
        return "Light, fresh, herbal";
    }

    @Override
    public String Language() {
        return "Serenity, grace, calmness";
    }

    @Override
    public boolean IsIndoor() {
        return false;
    }

    @Override
    public double Price() {

        return 20.00;
    }
}
