package com.sample;

import com.sample.model.LiquorType;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author koloba
 *
 */
public class LiquorService {

	public List getAvailableBrands(LiquorType type){

        List brands = new ArrayList();

        if(type.equals(LiquorType.WINE)){
            brands.add("Ocean beach");
            brands.add("Carlo rossin");
            brands.add("sweet red");

        }else if(type.equals(LiquorType.WHISKY)){
            brands.add("Glenfiddich");
            brands.add("Johnnie Walker");
            brands.add("Martel ");

        }else if(type.equals(LiquorType.BEER)){
            brands.add("Randler");
            brands.add("Star");
            brands.add("Origin");

        }else {
            brands.add("No Brand Available");
        }
    return brands;
    }
}
