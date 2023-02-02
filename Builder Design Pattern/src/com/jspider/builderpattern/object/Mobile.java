package com.jspider.builderpattern.object;

public class Mobile {

	private String brand;
	private String model;
	private int ram;
	private int memory;
	private int front_cam;
	private int rare_cam;
	private double price;
	private int battery;
	private String color;
	private double processor;
	
	public Mobile(String brand, String model, int ram, int memory, int front_cam, int rare_cam, double price,
			int battery, String color, double processor) {
		super();
		this.brand = brand;
		this.model = model;
		this.ram = ram;
		this.memory = memory;
		this.front_cam = front_cam;
		this.rare_cam = rare_cam;
		this.price = price;
		this.battery = battery;
		this.color = color;
		this.processor = processor;
	}
	@Override
	public String toString() {
		return "===Mobile=== \n"
	           +"Brand: " + brand +"\n" 
			   +"Model: " + model + "\n"
	           +"Ram: " + ram +"\n"
			   +"Memory: " + memory +"\n"
	           +"Front_cam: "+ front_cam +"\n"
			   +"Rare_cam: " + rare_cam + "\n"
	           +"Price: " + price +"\n"
			   +"Battery: " + battery + "\n"
	           +"Color: "+ color +"\n"
			   +"Processor: " + processor ;
	}
	
}
