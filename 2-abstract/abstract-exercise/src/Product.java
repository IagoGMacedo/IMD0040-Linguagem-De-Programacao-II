public class Product extends Entity {

    private String name;

    private double price;

    public Product(String p_name, double p_price){
        name = p_name;
        price = p_price;
    }



    @Override
    public String fileName() {
        return "Product"+getName()+".txt";
    }

    @Override
    public boolean validar() {
        return !(price < 0);
    }

    public double getPrice() {
        return price;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
