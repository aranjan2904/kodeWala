package com.zepto.orderservice.dto;
import java.math.BigDecimal;
public class CreateOrderRequest {
    private Long userId;
    private String productName;
    private Integer quantity;
    private BigDecimal totalAmount;
    public CreateOrderRequest(){}
    public Long getUserId(){return userId;}
    public void setUserId(Long userId){this.userId=userId;}
    public String getProductName(){return productName;}
    public void setProductName(String productName){this.productName=productName;}
    public Integer getQuantity(){return quantity;}
    public void setQuantity(Integer quantity){this.quantity=quantity;}
    public BigDecimal getTotalAmount(){return totalAmount;}
    public void setTotalAmount(BigDecimal totalAmount){this.totalAmount=totalAmount;}
}