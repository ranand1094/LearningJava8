package com.java.problems;

import java.util.Arrays;
import java.util.Scanner;

interface Building {
	void floorCompleted(int floorNumber);

	void printStatus(int floorNumber);

	void printNumberOfFloors();
}
class School implements Building {

	int[] floorArray;
	int totFloors;

	public School(int noOfFloors) {

		floorArray = new int[noOfFloors];
		totFloors = (noOfFloors - 1);
		Arrays.fill(floorArray, 0);
		System.out.println("A school is being constructed");
	}

	@Override
	public void floorCompleted(int floorNumber) {
		floorNumber = ((floorNumber - 1) == -1)?0:floorNumber - 1;

		if (floorNumber <= totFloors && floorNumber >= 0) {
			floorArray[floorNumber] = 1;
			System.out.println("Construction for floor number " + (floorNumber + 1) + " completed in school");
		} else
			System.out.println("Floor number " + (floorNumber + 1) + " does not exist in school");
	}

	@Override
	public void printStatus(int floorNumber) {
		floorNumber = ((floorNumber - 1) == -1)?0:floorNumber - 1;
		if (floorNumber <= totFloors && floorNumber >= 0) {
			int floor = floorArray[floorNumber];
			if (floor == 1)
				System.out.println("Construction for floor number " + (floorNumber + 1) + " completed in school");
			else
				System.out.println("Construction for floor number " + (floorNumber + 1) + " not completed in school");
		} else
			System.out.println("Floor number " + (floorNumber + 1) + " does not exist in school");
	}

	@Override
	public void printNumberOfFloors() {
		System.out.println("The school has " + (totFloors + 1) + " floors");
	}

}

class Hospital implements Building {

	int[] floorArray;
	int totFloors;

	public Hospital(int noOfFloors) {

		floorArray = new int[noOfFloors];
		totFloors = noOfFloors - 1;
		Arrays.fill(floorArray, 0);
		System.out.println("A hospital is being constructed");
	}

	@Override
	public void floorCompleted(int floorNumber) {
		floorNumber = ((floorNumber - 1) == -1)?0:floorNumber - 1;

		if (floorNumber <= totFloors && floorNumber >= 0) {
			floorArray[floorNumber] = 1;
			System.out.println("Construction for floor number " + (floorNumber + 1) + " completed in hospital");
		} else
			System.out.println("Floor number " + (floorNumber + 1) + " does not exist in hospital");
	}

	@Override
	public void printStatus(int floorNumber) {
		floorNumber = ((floorNumber - 1) == -1)?0:floorNumber - 1;

		if (floorNumber <= totFloors && floorNumber >= 0) {
			int floor = floorArray[floorNumber];
			if (floor == 1)
				System.out.println("Construction for floor number " + (floorNumber + 1) + " completed in hospital");
			else
				System.out.println("Construction for floor number " + (floorNumber + 1) + " not completed in hospital");
		} else
			System.out.println("Floor number " + (floorNumber + 1) + " does not exist in hospital");
	}

	@Override
	public void printNumberOfFloors() {
		System.out.println("The hospital has " + (totFloors + 1) + " floors");
	}

}

class AltiFloor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] floors = sc.nextLine().split(" ");

		School s = new School(Integer.parseInt(floors[0]));
		Hospital h = new Hospital(Integer.parseInt(floors[1]));
		s.printNumberOfFloors();
		h.printNumberOfFloors();

		String[] floorNumbers = sc.nextLine().split(" ");
		for (int i = 0; i < floorNumbers.length; i++) {
			s.floorCompleted(Integer.parseInt(floorNumbers[i]));
		}

		floorNumbers = sc.nextLine().split(" ");
		for (int i = 0; i < floorNumbers.length; i++) {
			s.printStatus(Integer.parseInt(floorNumbers[i]));
		}

		floorNumbers = sc.nextLine().split(" ");
		for (int i = 0; i < floorNumbers.length; i++) {
			h.floorCompleted(Integer.parseInt(floorNumbers[i]));
		}

		floorNumbers = sc.nextLine().split(" ");
		for (int i = 0; i < floorNumbers.length; i++) {
			h.printStatus(Integer.parseInt(floorNumbers[i]));
		}
	}
}
