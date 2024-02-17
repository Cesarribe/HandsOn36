package org.example.shop;

import java.util.ArrayList;
import java.util.Date;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
//@RequiredArgsConstructor(onConstructor = @__(@PersistenceConstructor))
@Document
    public class Order {
        private String customerId;
        private Date orderDate;
        private ArrayList<Object> items;

        public Order(String customerId, Date orderDate, ArrayList<LineItem> itens) {
            this(customerId, orderDate, new ArrayList<>());
        }

        public Order(String customerId, Date orderDate, ArrayList<Object> items) {
            this.customerId = customerId;
            this.orderDate = orderDate;
            this.items = items;
        }


        public Order addItem(LineItem item) {

            this.items.add(item);
            return this;
        }
    }


