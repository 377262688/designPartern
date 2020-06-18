package com.york.designpattern.clone;

import java.util.HashMap;

/**
 * @author york
 * @create 2020-06-18 11:00
 **/
public class CloneTest {

    public static void main(String[] args) {
        HashMap<String,HashMap> ori; ori = new HashMap();
        ori.put("1",new HashMap());
        ori.put("2",new HashMap());

        HashMap<String,HashMap> newMap = (HashMap) ori.clone();
        System.out.println(ori.get("2").get("2"));
        newMap.get("2").put("2",2);
        System.out.println(ori.get("2").get("2"));
    }
}
