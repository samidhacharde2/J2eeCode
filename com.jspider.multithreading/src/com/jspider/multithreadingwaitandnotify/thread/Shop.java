package com.jspider.multithreadingwaitandnotify.thread;

public class Shop {
   int noOfProducts;
   
   public Shop(int noOfProducts) {
	   super();
	   this.noOfProducts=noOfProducts;
   }
   public synchronized void restockProduct(int restockProduct) {
	     noOfProducts += restockProduct;
	     System.out.println(restockProduct+"Succesfully added the Stock");
	     System.out.println("Now available Product:"+ noOfProducts);
	     this.notify();
   }
   public synchronized void purcheseProduct(int purcheseProduct) {
	   if(noOfProducts < purcheseProduct) {
		   System.out.println(purcheseProduct+"Product not available,Please Wait");
		   try {
			this.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	   noOfProducts -= purcheseProduct;
	   System.out.println(purcheseProduct+"Sucessfully Purchased");
	   System.out.println("Now available Product: "+noOfProducts);
   }
}
