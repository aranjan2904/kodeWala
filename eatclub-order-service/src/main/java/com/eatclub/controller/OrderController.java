package com.eatclub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.UUID;

import com.eatclub.request.OrderRequest;

@Controller
public class OrderController {

	

	@PostMapping("placeOrder")
	public String placeOrder(@ModelAttribute OrderRequest orderRequest, Model model) {

	    String orderId = "EC-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();

	    model.addAttribute("orderId", orderId);
	    model.addAttribute("customerName", orderRequest.getCustomerName());
	    model.addAttribute("item", orderRequest.getItem());
	    model.addAttribute("quantity", orderRequest.getQuantity());
	    model.addAttribute("address", orderRequest.getAddress());
	    model.addAttribute("payment", orderRequest.getPayment());

	    return "confirm-order";
	}}