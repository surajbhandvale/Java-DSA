package com.examples.array;

import java.util.*;
import java.util.stream.Collectors;

public class WeatherStreamSort {
    public static void main(String[] args) {
        List<Weather> weatherList = Arrays.asList(
            new Weather("Mumbai", 32.5),
            new Weather("Delhi", 40.2),
            new Weather("Bangalore", 28.0),
            new Weather("Chennai", 35.0)
        );

        /*List<Weather> sortedByTemp = weatherList.stream()
            .sorted(Comparator.comparingDouble(Weather::getTemperature))
            .collect(Collectors.toList());*/

        //sortedByTemp.forEach(System.out::println);
        //weatherList.stream().sorted((p1, p2) -> p1.getTemperature().compareTo(p2.getTemperature()))
          //      .forEach(System.out::println);
    }
}
