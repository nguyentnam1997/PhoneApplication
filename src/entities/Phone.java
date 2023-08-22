package entities;

public class Phone {
    private static int autoId;
    private int id;
    private String name;
    private String brand;
    private String describe;
    private double price;
    private int quantity;

    public Phone(String name, String brand, String describe, double price, int quantity) {
        this.id = ++ autoId;
        this.name = name;
        this.brand = brand;
        this.describe = describe;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setManufacturer(String brand) {
        this.brand = brand;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", describe='" + describe + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
