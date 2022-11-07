package com.packages.stream.challenge;

import java.util.List;
import java.util.stream.Collectors;

public class PlanetUtils {



    public List<Planet>  getPlanetsBeginsWithM(List<Planet> planets){

        return  SolarSystem.getPlanets().stream()
                .filter(planet -> planet.getName().startsWith("M"))
                .collect(Collectors.toList());

    }

    public List<Planet> getPlanetsWithRings(List<Planet> planets){
        return planets.stream()
                .filter(planet -> planet.isHasRings())
                .collect(Collectors.toList());

    }
     public  List<Planet> getPlanetsWithMoreThanThreeMoons(List<Planet> planets){
        return planets.stream()
                .filter(planet -> planet.getNumberOfMoons()>3)
                .collect(Collectors.toList());

     }

     public  List<Planet> getPlanetsWithDensityGreaterThanFive(List<Planet> planets){
        return planets.stream()
                .filter(planet -> planet.getDensity()>5)
                .collect(Collectors.toList());
     }
}
