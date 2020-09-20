package jpabook.jpashop.repository.order.query;

import jpabook.jpashop.domain.Address;
import jpabook.jpashop.domain.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class OrderFlatDto {

    private Long orderId;
    private String name;
    private LocalDateTime orderDate; //주문 시간
    private OrderStatus orderStatus;
    private Address address;

    private String itemName; //상품명
    private int orderPrice; //주문 가격
    private int count; //주문 수량
}
