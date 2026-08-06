package com.blinkit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.blinkit.model.Product;
import com.blinkit.service.ProductService;
import com.blinkit.service.ProductServiceImpl;

@Controller
public class ProductController {

    
	private final ProductService productService;

	public ProductController(ProductService productService) {
	    this.productService = productService;
	}

    @GetMapping("/")
    public String getAllProducts(Model model) {

        List<Product> productList = productService.getAllProducts();

        model.addAttribute("products", productList);

        return "customer/products";
    }
    
    @GetMapping("/search")
    public String searchProducts(@RequestParam("keyword") String keyword, Model model) {

        List<Product> products = productService.searchProducts(keyword);

        model.addAttribute("products", products);

        return "customer/products";
    }
}