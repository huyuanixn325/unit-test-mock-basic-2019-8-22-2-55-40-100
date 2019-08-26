package cashregister;

public class StuPurchase extends Purchase {
    public StuPurchase(Item[] items) {
        super(items);
    }

    public StuPurchase() {
        super(new Item[0]);
    }

    @Override
    public String asString() {
        return "egg\t1.0\n";
    }
}
