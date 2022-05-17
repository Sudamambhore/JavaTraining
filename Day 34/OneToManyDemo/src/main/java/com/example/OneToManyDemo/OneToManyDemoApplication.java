package com.example.OneToManyDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OneToManyDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context ;
		context = SpringApplication.run(OneToManyDemoApplication.class, args);
		CartRepository cart = context.getBean(CartRepository.class);
		ItemsRepository item = context.getBean(ItemsRepository.class);
		Cart c1 = new Cart(1,"Sudam");
		   cart.save(c1);
		   System.out.println("Cart Save Successfully !");
		   
		   Items  i1 = new Items(100,"Mouse",500,c1);
		   item.save(i1);
		   System.out.println("Items Save Successfully !");
		   
		   Items  i2 = new Items(200,"KeyBoard",800,c1);
		   item.save(i2);
		   System.out.println("Items Save Successfully !");
		   
	}

}
