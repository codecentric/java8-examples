package de.codecentric.java8examples;

import java.util.List;

public class Invoice {

    private String sender;
    private String recipient;
    private List<InvoiceItem> items;

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public List<InvoiceItem> getItems() {
        return items;
    }

    public Invoice(String sender, String recipient, List<InvoiceItem> items) {
        this.sender = sender;
        this.recipient = recipient;
        this.items = items;
    }
}
