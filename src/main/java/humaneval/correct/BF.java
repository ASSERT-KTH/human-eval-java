package humaneval.correct;

import java.util.ArrayList;
import java.util.Arrays;

/* There are eight planets in our solar system: the closerst to the Sun 
is Mercury, the next one is Venus, then Earth, Mars, Jupiter, Saturn, 
Uranus, Neptune.
Write a function that takes two planet names as strings planet1 and planet2. 
The function should return a tuple containing all planets whose orbits are 
located between the orbit of planet1 and the orbit of planet2, sorted by 
the proximity to the sun. 
The function should return an empty tuple if planet1 or planet2
are not correct planet names. 
Examples
bf("Jupiter", "Neptune") ==> ("Saturn", "Uranus")
bf("Earth", "Mercury") ==> ("Venus")
bf("Mercury", "Uranus") ==> ("Venus", "Earth", "Mars", "Jupiter", "Saturn") */

public class BF {
    public static ArrayList<String> bf(String planet1, String planet2) {
        ArrayList<String> planet_names = new ArrayList<String>(Arrays.asList(
            "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"
        ));

        ArrayList<String> result = new ArrayList<String>();
        if ((! planet_names.contains(planet1)) || (! planet_names.contains(planet2)))
            return result;
        int planet1_index = planet_names.indexOf(planet1);
        int planet2_index = planet_names.indexOf(planet2);
        if (planet1_index < planet2_index) {
            for (int i = planet1_index + 1; i < planet2_index; i += 1)
                result.add(planet_names.get(i));
        } else {
            for (int i = planet2_index + 1; i < planet1_index; i += 1)
                result.add(planet_names.get(i));
        }
        return result;
    }
}
