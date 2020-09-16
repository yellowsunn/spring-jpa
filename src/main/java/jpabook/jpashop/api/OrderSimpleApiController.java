package jpabook.jpashop.api;

import jpabook.jpashop.OrderSearch;
import jpabook.jpashop.domain.Order;
import jpabook.jpashop.domain.OrderItem;
import jpabook.jpashop.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class OrderSimpleApiController {

    private final OrderRepository orderRepository;

    @GetMapping("/api/v1/simple-orders")
    public List<Order> ordersV1() {
        List<Order> all = orderRepository.findAll();
////        all.forEach(order -> {
////            order.getMember().getName(); //Lazy 강제 초기화
////            order.getDelivery().getAddress(); //Lazy 강제 초기화
////        });
        return all;
    }
}
