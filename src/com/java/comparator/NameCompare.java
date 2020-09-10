package com.java.comparator;

import java.util.Comparator;

public class NameCompare implements Comparator<Friend> {

	@Override
	public int compare(Friend f1, Friend f2) {
		// TODO Auto-generated method stub
		return f1.getName().compareTo(f2.getName());
	}

}
