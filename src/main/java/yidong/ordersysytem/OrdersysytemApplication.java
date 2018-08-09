package yidong.ordersysytem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("yidong.mapper")
public class OrdersysytemApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrdersysytemApplication.class, args);
    }
}


