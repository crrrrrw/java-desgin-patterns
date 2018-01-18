package com.crw.study.flyweight.example2;

import java.util.HashMap;

public class FlyWeightFactory {

    public FlyWeightFactory() {
    }

    private HashMap<String, ConcreteFlyWeight> flyWeights =
            new HashMap<String, ConcreteFlyWeight>();

    public ConcreteFlyWeight factory(String str) {
        ConcreteFlyWeight flyWeight;
        flyWeight = flyWeights.get(str);

        if (null == flyWeight) {
            flyWeight = new ConcreteFlyWeight(str);
            flyWeights.put(str, flyWeight);
        }
        return flyWeight;
    }

    public int getFlyWeightSize() {
        return flyWeights.size();
    }

}
