package product.management.model;

public class Product {
    private int id;
    private String name;
    private String price;
    private String memo;
    private String producer;

    public Product() {
    }

    public Product(int id, String name, String price, String memo, String producer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.memo = memo;
        this.producer = producer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
