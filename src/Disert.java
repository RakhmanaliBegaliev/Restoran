public class Disert extends Menu{
    public Disert(String name, int price, String volume) {
        super(name, price, volume);
    }

    @Override
    void speedOfFoodCooking() {
        System.out.println("25 minutes");
    }
}
