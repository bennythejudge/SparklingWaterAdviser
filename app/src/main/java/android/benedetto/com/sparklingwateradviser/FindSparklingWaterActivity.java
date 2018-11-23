package android.benedetto.com.sparklingwateradviser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class FindSparklingWaterActivity extends Activity {
    private WaterExpert expert = new WaterExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_sparkling_water);
    }

    // responds to button clicks
    public void onClickFindSparklingWater(View view) {
        Spinner type_selected = (Spinner) findViewById(R.id.list_of_waters);
        TextView water_selected = (TextView) findViewById(R.id.water_selected);

        // set the selected entry in the TextView
        List<String> brands = expert.getBrands( String.valueOf(type_selected.getSelectedItem()));
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand:brands) {
            brandsFormatted.append(brand).append('\n');
        }
        // display the waters
        water_selected.setText(brandsFormatted);
    }

}
