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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InvoiceItem that = (InvoiceItem) o;

        if (pricePerUnit != null ? !pricePerUnit.equals(that.pricePerUnit) : that.pricePerUnit != null) return false;
        if (product != null ? !product.equals(that.product) : that.product != null) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = product != null ? product.hashCode() : 0;
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        result = 31 * result + (pricePerUnit != null ? pricePerUnit.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "InvoiceItem{" +
                "product='" + product + '\'' +
                ", quantity=" + quantity +
                ", pricePerUnit=" + pricePerUnit +
                '}';
    }
}
