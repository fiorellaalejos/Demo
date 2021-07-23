package duke.choice;

public class Clothing implements Comparable<Clothing>{
    private String description;
    private double price;
    private String size;
    public final static double TAX_RATE = 0.2;
    public final static double MIN_PRICE = 10;

    public Clothing() {
        this.size = "M";
    }

    public Clothing(String description, double price, String size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }

    @Override
    public int compareTo(Clothing o) {
        return this.description.compareTo(o.getDescription());
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price+TAX_RATE*price;
    }

    public void setPrice(double price) {
        if (price < MIN_PRICE){
            this.price  = MIN_PRICE;
        }else{
            this.price = price;
        }

    }

    @Override
    public String toString() {
        return "Clothing{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                ", TAX_RATE=" + TAX_RATE +
                ", MIN_PRICE=" + MIN_PRICE +
                '}';
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
