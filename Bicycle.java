/**
 * Created by t00185230 on 12/10/2017.
 */
public class Bicycle {

    private String Owner;
    private float price;
    private char type;

    public Bicycle() {
        setOwner("Unknown");
        setPrice(0.0f);
        setType('n');
    }

    public Bicycle(String owner, float price, char type) {
        setOwner(owner);
        setPrice(price);
        setType(type);
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    public void setType(char type) {
        this.type = type;
    }

    public char getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    public String getOwner() {
        return Owner;
    }

    @Override
    public String toString() {
        return " Owner " + getOwner() + " Type" + getType() + " Price" + getPrice() + "/n/n";
    }
}