package com.java.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BoxCapacity {

	public static void main(String[] args) {
		Box box = new Box("Gold", 200.00, 100.00);
		Box box1 = new Box("Silver", 300.00, 50.00);
		Box box2 = new Box("Bronze", 1000.00, 25.00);

		Double capacity = 1000.00;

		List<Box> boxList = Arrays.asList(box, box1, box2).stream()
				.sorted((a, b) -> b.getPrice().compareTo(a.getPrice())).collect(Collectors.toList());

		List<Box> boxListS = new ArrayList<>();

		boxList.forEach(s -> System.out.println(s.getItem() + " - " + s.getPrice()));

		for (int i = 0; i < boxList.size(); i++) {
			if (capacity > 0) {
				Double quantity = boxList.get(i).getQuantity();
				if (quantity <= capacity) {
					boxListS.add(boxList.get(i));
					capacity = capacity - quantity;
				} else if (quantity > capacity) {
					boxListS.add(new Box(boxList.get(i).getItem(), capacity, boxList.get(i).getPrice()));
				}
			}
		}

		boxListS.forEach(s -> System.out.println(s.getItem() + " - " + s.getQuantity()));
	}

}

class Box {
	String item;
	Double quantity;
	Double price;

	public Box(String item, Double quantity, Double price) {
		super();
		this.item = item;
		this.quantity = quantity;
		this.price = price;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}