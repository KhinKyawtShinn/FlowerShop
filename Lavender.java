public class Lavender implements IFlower{

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
    public boolean isIndoor() {
        return false;
    }
}
