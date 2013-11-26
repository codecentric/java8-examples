package de.codecentric.java8examples;

import java.math.BigDecimal;

public class InvoiceItem {

    private String product;
    private Integer quantity;
    private BigDecimal pricePerUnit;

    public String getProduct() {
        return product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public BigDecimal getPricePerUnit() {
        return pricePerUnit;
    }

    public InvoiceItem(String product, Integer quantity, BigDecimal pricePerUnit) {
        this.product = product;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }
}
