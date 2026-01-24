package com.shopifyy.shopifyy.service.order;

import java.util.List;

import com.shopifyy.shopifyy.dtos.OrderDto;
import com.shopifyy.shopifyy.model.Order;

public interface IOrderService {
    Order placeOrder(Long userId);
    List<OrderDto> getUserOrders(Long userId);

    OrderDto convertToDto(Order order);
}
