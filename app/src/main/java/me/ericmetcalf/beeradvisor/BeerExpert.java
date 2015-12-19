package me.ericmetcalf.beeradvisor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ehm216 on 12/18/15.
 */
public class BeerExpert {

    //This is the method that keeps the different values of the
    //brands
    List<String> getBrands(String color){
        List<String> brands = new ArrayList<String>();
        if(color.equals("Amber")){
            brands.add("Jack Amber");
            brands.add("Red Moose");
        }
        else{
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }


}
