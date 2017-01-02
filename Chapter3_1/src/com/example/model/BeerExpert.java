package com.example.model;
import java.util.*;
// Model class [MVC]
public class BeerExpert  {
	// Get List of String as answer , we get parameter color from form
	// and we pass here and check one of suggestion, then we combine answer 
	// concatinate with param body from form , its selected size
	public List<String> getBrands(String color, String body) {
        ArrayList<String> arrayList = new ArrayList<String>();
        if (color.equals("amber")) {
            arrayList.add("Jack Amber" + body);
            arrayList.add("Red Moose" + body);
        } else {
            arrayList.add("Jail Pale Ale " + body);
            arrayList.add("Gout Stout " + body);
        }
        return arrayList;
    }
	
}
