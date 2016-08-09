package me.typesafe;


import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Lambdas {

    @Test
    public void ananymousInnerClassUsingJava7(){

        List<String> team = loadTeam();
        Collections.sort(team, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        for(String name: team){
            System.out.print(name);
        }
    }

    @Test
    public void ananymousInnerClassUsingJava8(){
        List<String> team = loadTeam();
        team.sort((t1,t2) -> t1.compareTo(t2));
        team.forEach(System.out::print);
    }

    @Test
    public void abstractionUsingLambdaJava8(){


    }

    private List<String> loadTeam() {
        List<String> team = Lists.newArrayList();
        team.add("TEDA");
        team.add("Singapore");
        team.add("Chennai");
        return team;
    }

}
