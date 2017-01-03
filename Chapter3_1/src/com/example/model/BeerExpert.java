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
	// this method just get longer answer more precise when you select from form
	// it give you one answer size is ...
	public String getOneSize(String body) {
        String result = body;
        switch (body) {
            case "12oz": {
                result = "size is 12";
                break;
            }
            case "16oz": {
                result = "size is 16";
                break;
            }
            case "22oz": {
                result = "size is 22";
            }
        }
        return result;
    }
}
