package me.typesafe;

import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class Streams {


    @Test
    public void filterAndMapListUsingJava7(){
        List<String> names = getCountries();

        List<String> results = Lists.newArrayList();
        for (String name:names) {
            if("Singapore".equals(name)){
                results.add(name+" SG");
            }
        }

        for(String name: results){
            System.out.print(name);
        }
    }


    @Test
    public void filterAndMapListUsingJava8(){

    }

    private List<String> getCountries() {
        List<String> names = Lists.newArrayList();
        names.add("India");
        names.add("Singapore");
        names.add("China");
        return names;
    }

}
