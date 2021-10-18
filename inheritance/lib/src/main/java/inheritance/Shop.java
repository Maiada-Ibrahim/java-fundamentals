package inheritance;

public class Shop extends Place {


    public Shop(String name,  double price) {
        super(name, price);

    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", dollar=" + getDollar() +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDollar() {
        return dollar;
    }

    public void setDollar(double dollar) {
        this.dollar = dollar;
    }
}
