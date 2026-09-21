package com.zepto.orderservice.entity;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name="orders")
public class Order {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private String productName;
    private Integer quantity;
    private BigDecimal totalAmount;
    private String status;
    private LocalDateTime createdAt;

    public Order() {}
    public Long getId(){return id;}
    public void setId(Long id){this.id=id;}
    public Long getUserId(){return userId;}
    public void setUserId(Long userId){this.userId=userId;}
    public String getProductName(){return productName;}
    public void setProductName(String productName){this.productName=productName;}
    public Integer getQuantity(){return quantity;}
    public void setQuantity(Integer quantity){this.quantity=quantity;}
    public BigDecimal getTotalAmount(){return totalAmount;}
    public void setTotalAmount(BigDecimal totalAmount){this.totalAmount=totalAmount;}
    public String getStatus(){return status;}
    public void setStatus(String status){this.status=status;}
    public LocalDateTime getCreatedAt(){return createdAt;}
    public void setCreatedAt(LocalDateTime createdAt){this.createdAt=createdAt;}
}