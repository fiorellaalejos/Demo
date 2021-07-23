package duke.choice;

public class Customer {
    //fields
    private String name;
    private String size;
    private Clothing[] items;

    public Customer() {
    }

    public double averageprice(){
        double total = 0.0;
        double average = 0.0;
        for (int i= 0; i<this.items.length ; i++){
            total += this.items[i].getPrice();
        }
        try{
            System.out.println("Number of clothing :"+this.items.length);
            //calculation
            average = total/this.items.length;
        }catch(ArithmeticException e1){
            System.out.println(e1.toString());
        }catch (Exception e2){
            System.out.println(e2.toString());
        }

        return average;
    }

    public Customer(String name, int measurement) {
        this.name = name;
        switch (measurement) {
            case 1:
            case 2:
            case 3:
                setSize("S");
                break;
            case 4:
            case 5:
            case 6:
                setSize("M");
                break;
            case 7:
            case 8:
            case 9:
                setSize("L");
                break;
            default:
                setSize("X");
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
    public void addItems(Clothing[] someItems){
        this.items = someItems;

    }

    public double getTotalClothingCost(){
        double total = 0.0;
        for (Clothing cl: this.items
             ) {
            total += cl.getPrice();
        }
        return total;
    }
    public Clothing[] getItems() {
        return items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public void setSize(int measurement) {
        //this.size = size;
        switch (measurement) {
            case 1:
            case 2:
            case 3:
                setSize("S");
                break;
            case 4:
            case 5:
            case 6:
                setSize("M");
                break;
            case 7:
            case 8:
            case 9:
                setSize("L");
                break;
            default:
                setSize("X");
        }

    }
}
