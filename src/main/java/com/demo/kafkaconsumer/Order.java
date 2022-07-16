package com.demo.kafkaconsumer;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Order {

    private String orderId;
    private String orderDetails;
}
