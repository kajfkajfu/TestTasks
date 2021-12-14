package model;

import java.util.Objects;

public class Phone {
    private String company;
    private String model;
    private int price;


    public Phone(String company, String model, int price) {
        this.company = company;
        this.model = model;
        this.price = price;
    }

    /**
     * Get the name of the company
     */
    public String getCompany() {
        return company;
    }

    /**
     * Set the name of the company
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * Get the model of a Phone
     */
    public String getModel() {
        return model;
    }

    /**
     * Set the model of a Phone
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Get the price of a Phone
     */
    public int getPrice() {
        return price;
    }

    /**
     * Set the price of a Phone
     */
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return price == phone.price && Objects.equals(company, phone.company) && Objects.equals(model, phone.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(company, model, price);
    }
}
