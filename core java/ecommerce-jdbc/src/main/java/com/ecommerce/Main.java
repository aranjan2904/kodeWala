	package com.ecommerce;
	
	import java.util.Scanner;

	
	
	import com.ecommerce.exception.DuplicateEmailException;
	import com.ecommerce.exception.EmptyCartException;
	import com.ecommerce.exception.InsufficientStockException;
	import com.ecommerce.exception.ProductNotFoundException;
	import com.ecommerce.model.Customer;
	import com.ecommerce.model.Seller;
	import com.ecommerce.service.CartService;
	import com.ecommerce.service.CustomerService;
	import com.ecommerce.service.OrderService;
	import com.ecommerce.service.ProductService;
	import com.ecommerce.service.SellerService;
	
	public class Main {
	
	    private Scanner sc = new Scanner(System.in);
	
	    private CustomerService customerService = new CustomerService();
	    private SellerService sellerService = new SellerService();
	    private ProductService productService = new ProductService();
	    private CartService cartService = new CartService();
	    private OrderService orderService = new OrderService();
	
	    public static void main(String[] args) {
	
	        Main app = new Main();
	        app.start();  
	
	    }
	    
	    //----------------------START----------------------------------//
	    
	    private void showMainMenu() {
	
	        System.out.println();
	        System.out.println("==================================");
	        System.out.println("     MINI E-COMMERCE SYSTEM");
	        System.out.println("==================================");
	        System.out.println("1. Seller");
	        System.out.println("2. Customer");
	        System.out.println("0. Exit");
	        System.out.print("\nEnter Choice : ");
	    }
	    
	
	    public void start() {
	
	    	int choice = -1;
	
	        do {
	
	            showMainMenu();
	
	            try {
	
	                choice = Integer.parseInt(sc.nextLine());
	
	            } catch (NumberFormatException e) {
	
	                System.out.println("\n Please enter a number.");
	                continue;
	            }
	
	            switch(choice){
	 
	            case 1:
	                sellerHome();
	                break;
	
	            case 2:
	                customerHome();
	                break;
	
	            case 0:
	                System.out.println("Thank You...");
	                break;
	
	            default:
	                System.out.println("Invalid Choice.");
	            }
	
	        } while (choice != 0);
	
	    }
	
	 
	    
	    //-----------------------------------SELLER-------------------------------------------//
	    
	    private void showSellerHome() {
	    	System.out.println();
	        System.out.println("========== SELLER ==========");
	        System.out.println("1. Register");
	        System.out.println("2. Login");
	        System.out.println("0. Back");
	        System.out.print("Enter Choice : ");
	    }
	    
	    
	    private void sellerHome() {
	
	        int choice = -1;
	
	        do {
	
	           showSellerHome();
	
	            try {
	                choice = Integer.parseInt(sc.nextLine());
	            } catch (NumberFormatException e) {
	                System.out.println("Enter a valid number.");
	                continue;
	            }
	
	            switch(choice){
	
	            case 1:
	                try {
	                    sellerService.sellerRegistration();
	                } catch (DuplicateEmailException e) {
	                    System.out.println("\n " + e.getMessage());
	                }
	                break;
	
	            case 2:
	
	                Seller seller = sellerService.sellerLogin();
	
	                if(seller!=null){
	                    sellerMenu(seller);
	                }
	
	                break;
	
	               
	            case 0:
	                break;
	
	            default:
	                System.out.println("Invalid Choice.");
	            }
	
	        }while(choice!=0);
	    }
	    
	    //-------------------------------CUSTOMER---------------------------------------------//
	    
	    private void showCustomerHome() {
	    	
	    	System.out.println();
	        System.out.println("========== CUSTOMER ==========");
	        System.out.println("1. View Products");
	        System.out.println("2. Search Product");
	        System.out.println("3. Register");
	        System.out.println("4. Login");
	        System.out.println("0. Back");
	        System.out.print("Enter Choice : ");
	    }
	
		private void customerHome() {
	
	        int choice = -1;
	
	        do {
	
	            showCustomerHome();
	
	            try {
	                choice = Integer.parseInt(sc.nextLine());
	            } catch (NumberFormatException e) {
	                System.out.println("Enter a valid number.");
	                continue;
	            }
	
	            switch(choice){
	
	            case 1:
	                productService.viewAllProducts();
	                break;
	
	            case 2:
	                try {
	                    productService.searchProduct();
	                } catch (ProductNotFoundException e) {
	                    System.out.println("\n " + e.getMessage());
	                }
	                break;
	
	            case 3:
	                try {
	                    customerService.customerRegistration();
	                } catch (DuplicateEmailException e) {
	                    System.out.println("\n " + e.getMessage());
	                }
	                break;
	
	            case 4:
	
	                Customer customer = customerService.customerLogin();
	
	                if(customer!=null){
	                    customerMenu(customer);
	                }
	
	                break;
	
	            case 0:
	                break;
	
	            default:
	                System.out.println("Invalid Choice.");
	            }
	
	        }while(choice!=0);
	    }
		
		//----------------------------------SELLER PANEL-------------------------------------------//
		
		
		private void showSellerPanel() {
			
			System.out.println();
	        System.out.println("============= SELLER PANEL =============");
	        System.out.println("1. Add Product");
	        System.out.println("2. Upload Products From CSV");
	        System.out.println("3. View My Products");
	        System.out.println("4. Update Product");
	        System.out.println("0. Logout");
	        System.out.print("Enter Choice : ");
		}
	
	    private void sellerMenu(Seller seller) {
	
	    	int choice = -1;
	
	        do {
	
	            showSellerPanel();
	
	            try {
	
	                choice = Integer.parseInt(sc.nextLine());
	
	            } catch (NumberFormatException e) {
	
	                System.out.println("\n Please enter a number.");
	                continue;
	            }
	
	            switch(choice){
	
	            case 1:
	                productService.addProduct(seller.getSellerId());
	                break;
	
	            case 2:
	                productService.uploadProductsFromCSV(seller.getSellerId());
	                break;
	
	            case 3:
	                productService.viewSellerProducts(seller.getSellerId());
	                break;
	
	            case 4:
	                productService.updateProduct();
	                break;
	
	            case 0:
	                System.out.println("Logged Out.");
	                break;
	
	            default:
	                System.out.println("Invalid Choice.");
	
	            }
	
	        } while (choice != 0);
	
	    }
	    //-----------------------------------CUSTOMER PANEL----------------------------------------------//
	    
	    private void showCustomerMenu() {
	    	
	    	System.out.println();
	        System.out.println("============ CUSTOMER PANEL ============");
	        System.out.println("1. View All Products");
	        System.out.println("2. Search Product");
	        System.out.println("3. Add To Cart");
	        System.out.println("4. View Cart");
	        System.out.println("5. Update Cart");
	        System.out.println("6. Remove Product");
	        System.out.println("7. Place Order");
	        System.out.println("8. Order History");
	        System.out.println("0. Logout");
	        System.out.print("Enter Choice : ");
	
	    }
	
	    private void customerMenu(Customer customer) {
	
	    	int choice = -1;
	
	        do {
	        	
	        	showCustomerMenu();
	            
	            try {
	
	                choice = Integer.parseInt(sc.nextLine());
	
	            } catch (NumberFormatException e) {
	
	                System.out.println("\n Please enter a number.");
	                continue;
	            }
	
	            switch (choice) {
	
	            case 1:
	                productService.viewAllProducts();
	                break;
	
	            case 2:
	                try {
						productService.searchProduct();
					} catch (ProductNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	                break;
	
	            case 3:
	                try {
	                    cartService.addToCart(customer.getCustomerId());
	                } catch (InsufficientStockException e) {
	                    System.out.println("\n " + e.getMessage());
	                }
	                break;
	
	            case 4:
	                cartService.viewCart(customer.getCustomerId());
	                break;
	
	            case 5:
	                cartService.updateCart();
	                break;
	
	            case 6:
	                cartService.removeProduct();
	                break;
	
	            case 7:
	            	try {
	            	    orderService.placeOrder(customer.getCustomerId());
	            	} catch (EmptyCartException e) {
	            	    System.out.println("\n" + e.getMessage());
	            	}
	                break;
	
	            case 8:
	                orderService.viewOrders(customer.getCustomerId());
	                break;
	
	            case 0:
	                System.out.println("Logged Out.");
	                break;
	
	            default:
	                System.out.println("Invalid Choice.");
	
	            }
	
	        } while (choice != 0);
	
	    }
	
	}