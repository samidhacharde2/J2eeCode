package com.jspider.multithreadings.resource.shop;

public class Shop {
       
int noOfProduct;
    
    public Shop (int noOfProduct) {
    	super();
    	this.noOfProduct=noOfProduct;
    }
    public synchronized void restockProduct(int noOfProduct) {
    	
    	
		int restockProduct = 0;
		noOfProduct +=restockProduct;
    	System.out.println(restockProduct+"Successful added the stock");
    	System.out.println("Now available Produsts: "+noOfProduct);
    }
    
    public synchronized void purchesProducts(int noOfProduct) {
          
    	int noOfProducts = 0;
		int restockProducts = 0;
		if(noOfProducts < restockProducts) {
	
    	}
    }
	public void purchaseProduct(int noOfProduct2) {
		
		System.out.println("Hello");
	}

	
  }
