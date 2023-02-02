package com.jspider.multithreadings;

import com.jspider.multithreadings.resource.shop.Shop;

public class Supplier extends Thread {
      private Shop shop;
       private int noOfProducts;
       
       public Supplier(Shop shop,int noOfProducts) {
    	   this.shop=shop;
    	   this.noOfProducts=noOfProducts;
       }
       public void restockProduct() {
       shop.restockProduct(noOfProducts);
}
}