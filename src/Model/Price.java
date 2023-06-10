package Model;

import CompanyExersiceOne.PriceController;

public class Price {
    private int price_id;
    private String product_name;
    private int price;
    private int employee_id;

    public Price(int price_id, String product_name, int price, int employee_id) {
        this.price_id = price_id;
        this.product_name = product_name;
        this.price = price;
        this.employee_id = employee_id;
    }
    public Price() {

    }
    // getter

    public int getPrice_id() {
        return price_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public int getPrice() {
        return price;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    // setter
    public void setPrice_id(int price_id) {
        this.price_id = price_id;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }
}
