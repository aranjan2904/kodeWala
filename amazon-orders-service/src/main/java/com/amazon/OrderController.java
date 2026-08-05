package com.amazon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.amazon.request.OrderRequest;

@Controller()
public class OrderController {
	
	@GetMapping("/orders/{id}")
	public String getOrder(@PathVariable("id") String orderId) {
		
		System.out.println("oder id received  from page is " + orderId);
		return "order-details";
	}
	
	@PostMapping("placeOrder")
	public String placeOrder(@ModelAttribute OrderRequest orderRequest) {

	    String item = orderRequest.getItem();
	    double price = orderRequest.getPrice();
	    int qty = orderRequest.getQty();
	    String mobile = orderRequest.getMobile();

	    System.out.println("Item Name : " + item);
	    System.out.println("Price     : " + price);
	    System.out.println("Quantity  : " + qty);
	    System.out.println("Mobile    : " + mobile);

	    return "order-confirmation";
	}

}
