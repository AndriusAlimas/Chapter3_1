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
	public String getOneSize(String size) {
        String result = size;
        switch (size) {
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
	// this method take paramValues_size array and reads all elements get count
	// number and value of element and store to new created List with information , that
	// information are String so we return List of Strings
	public List<String> getAllSize(String[] size_array) {
        ArrayList<String> sizeList = new ArrayList<String>();
        if (size_array.length > 0) {
            int n = 0;
            for (String temp : size_array) {
                sizeList.add("number - " + ++n + " is value of " + temp);
            }
        } else {
            sizeList.add("empty");
        }
        return sizeList;
    }
}
