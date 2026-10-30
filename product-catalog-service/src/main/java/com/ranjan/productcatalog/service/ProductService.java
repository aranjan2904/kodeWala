package com.ranjan.productcatalog.service;

import com.ranjan.productcatalog.dto.ProductRequest;
import com.ranjan.productcatalog.entity.Product;
import com.ranjan.productcatalog.exception.ProductNotFoundException;
import com.ranjan.productcatalog.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional(readOnly = true)
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException(id));
    }

    @Transactional(readOnly = true)
    public List<Product> searchByName(String name) {
        return productRepository.findByNameContainingIgnoreCase(name);
    }

    @Transactional(readOnly = true)
    public List<Product> getByCategory(String category) {
        return productRepository.findByCategoryIgnoreCase(category);
    }

    public Product createProduct(ProductRequest request) {
        Product product = new Product(
                request.name().trim(),
                request.description(),
                request.price(),
                request.category().trim(),
                request.stockQuantity(),
                request.active() == null || request.active()
        );
        return productRepository.save(product);
    }

    public Product updateProduct(Long id, ProductRequest request) {
        Product product = getProductById(id);
        product.update(
                request.name().trim(),
                request.description(),
                request.price(),
                request.category().trim(),
                request.stockQuantity(),
                request.active() == null || request.active()
        );
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        Product product = getProductById(id);
        productRepository.delete(product);
    }
}
