package inheritance;

public class Shop extends Place {
    private String description;

    public Shop(String name, double price, double stars, String description) {
        super(name, price, stars);
        this.description = description;
    }

    @Override
    public String toString() {
        if (getReviewlist().isEmpty()) {
            return "Shop{" +
                    "name='" + getName() + '\'' +
                    ", description='" + this.description + '\'' +
                    ", dollar=" + getPrice() +
                    "$}";
        } else {
            return "Shop{" +
                    "name='" + getName() + '\'' +
                    ", description='" + this.description + '\'' +
                    ", dollar=" + getPrice() +
                    "$}" + getReviewlist();


        }

    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
