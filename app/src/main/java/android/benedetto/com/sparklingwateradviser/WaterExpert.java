package android.benedetto.com.sparklingwateradviser;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class WaterExpert {

    public List<String> getBrands(String water_type) {
        Log.d("WaterExpert", "water: " + water_type);
        List<String> brands = new ArrayList<>();
        if (water_type.equals("strong")) {
            brands.add("Apollinaire");
            brands.add("Rosport Vert");
        } else {
            brands.add("not strong brand");
        }
        return brands;
    }
}
