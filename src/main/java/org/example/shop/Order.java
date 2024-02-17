package org.example.shop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
//@RequiredArgsConstructor(onConstructor = @__(@PersistenceConstructor))
@Document
public class Order {

    private String id;
    private String customerId;
    private Date orderDate;
    private List<LineItem> items;

    public Order(String customerId, Date orderDate, List<LineItem> items) {
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.items = items;
    }


    public Order(String customerId, Date orderDate, ArrayList items) {
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.items = items;
    }


    public Order addItem(LineItem item) {

        this.items.add(item);
        return this;
    }
}