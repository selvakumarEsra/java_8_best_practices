package me.typesafe;

import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class Streams {


    @Test
    public void filterAndMapListUsingJava7(){
        List<String> names = Lists.newArrayList();
        List<String> results = Lists.newArrayList();
        names.add("India");
        names.add("Singapore");
        names.add("China");

        for (String name:names) {
            if("Singapore".equals(name)){
                results.add(name+" SG");
            }
        }

//        Assert.assertEquals(results.get(1));

    }


}
