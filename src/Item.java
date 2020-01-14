public class Item {
    private String partNumber;
    private String partDescription;
    private double pricePerItem;

    public Item(String n, String d, double p){
        partNumber = n;
        partDescription = d;
        pricePerItem = p;
    }
    public double getTotalPrice(int quantity){
        return quantity*pricePerItem;
    }
    public String toString(){
        return "Item: " + partNumber +"\nPrice: $" + pricePerItem
        + "\nDescription: " + partDescription + "\n";
    }
}
