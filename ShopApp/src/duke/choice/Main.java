package duke.choice;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Customer c1 = new Customer("Pinky", 4);

        Clothing item1 = new Clothing("Blue Jacket" ,20.9,"M");;
        Clothing item2 = new Clothing("Orange T-shirt", 10.5,"S");
        double tax = 0.2;
        double total =0.0;
        Clothing[] items = {item1,item2, new Clothing("Green Scarf", 5,"S"), new Clothing("Blue T-Shirt", 10.5,"S")};

        System.out.println("Customer : "+c1.toString());

        int mesurement  =5;

        switch (mesurement){
            case 1:
                case 2 :
                case 3 :
                    c1.setSize("S");
                    break;
            case 4:
            case 5:
                case 6:
                    c1.setSize("M");
                    break;
            case 7:
            case 8:
            case 9:
                c1.setSize("L");
                break;
            default:
                c1.setSize("XL");
        }
        System.out.println("Customer : "+c1.toString());



        for (Clothing clothe: items) {

            if (c1.getSize().equals(clothe.getSize())){
                System.out.println("Clothing : "+clothe.getDescription()+" ,"+clothe.getSize()+" ,"+clothe.getPrice());
                System.out.println("tax_rate : "+Clothing.TAX_RATE);

            }
        }
        System.out.println("total : "+total);

        c1.addItems(items);
        System.out.println("Second for");
        for (Clothing clo:c1.getItems()
             ) {
            System.out.println("Clothing : "+clo.toString());
        }
        System.out.println("Total : "+c1.getTotalClothingCost());

        double average = c1.averageprice();
        System.out.println("Average price : "+average);

        Arrays.sort(c1.getItems());
        System.out.println("After sort");
        for (Clothing clothe: items) {
                System.out.println("Clothing : "+clothe.getDescription()+" ,"+clothe.getSize()+" ,"+clothe.getPrice());
        }
    }
}
