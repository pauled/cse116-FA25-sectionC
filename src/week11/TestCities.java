package week11;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.*;

public class TestCities {
    private void compareCities(City expected,City actual){
        assertEquals(expected.getCountry(),actual.getCountry());
        assertEquals(expected.getRegion(),actual.getRegion());
        assertEquals(expected.getPopulation(),actual.getPopulation());
        assertEquals(expected.getName(),actual.getName());
        assertEquals(expected.getLocation().getLatitude(),
                actual.getLocation().getLatitude(),.001);
        assertEquals(expected.getLocation().getLongitude(),
                actual.getLocation().getLongitude(),.001);
    }
    public void compareCountryHashMaps(
            HashMap<String, ArrayList<City>> expected,
            HashMap<String, ArrayList<City>> actual){
        assertEquals(expected.size(),actual.size());
        for (String country : expected.keySet()){
            assertTrue(actual.containsKey(country));
            ArrayList<City> expectedCities=expected.get(country);
            ArrayList<City> actualCities=actual.get(country);
            assertEquals(expectedCities.size(),actualCities.size());
            for (int i=0;i<expectedCities.size();i++){
                compareCities(expectedCities.get(i),actualCities.get(i));
            }
        }
    }

    @Test
    public void testSingleCity(){
        String filename="data/cities_test_1.csv";
        HashMap<String, ArrayList<City>> actual=
                CitiesExample.loadCountries(filename);
        HashMap<String, ArrayList<City>> expected=new HashMap<>();
        expected.put("us",new ArrayList<>(Arrays.asList(
                new City("buffalo","NY","us",
                        279557,new Location(42.8863889,-78.878611))
        )));
        compareCountryHashMaps(expected,actual);
    }
}
