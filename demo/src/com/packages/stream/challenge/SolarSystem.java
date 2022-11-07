package com.packages.stream.challenge;

import java.util.ArrayList;
import java.util.List;

public class SolarSystem {

    public static List<Planet> getPlanets(){
        List<Planet> planetList = new ArrayList<>();
        Planet a = new Planet("a");
        a.setDensity(5);
        a.setHasRings(false);
        a.setNumberOfMoons(3);
        planetList.add(a);

        Planet b = new Planet("b");
        b.setDensity(15);
        b.setHasRings(true);
        b.setNumberOfMoons(13);
        planetList.add(b);

        Planet c = new Planet("c");
        c.setDensity(58);
        c.setHasRings(false);
        c.setNumberOfMoons(30);
        planetList.add(c);

        Planet d = new Planet("d");
        d.setDensity(56);
        d.setHasRings(true);
        d.setNumberOfMoons(123);
        planetList.add(d);

        return planetList;
    }
}
