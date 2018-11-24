package com.company.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<String>();
        if (color.equals("amber")) {
            brands.add("Amber 1");
            brands.add("Amber 2");
        } else if (color.equals("light")) {
            brands.add("Light 1");
            brands.add("Light 2");
        } else if (color.equals("dark")) {
            brands.add("Dark 1");
            brands.add("Dark 2");
        } else {
            brands.add("Brown 1");
            brands.add("Brown 2");
        }
        return brands;
    }
}
