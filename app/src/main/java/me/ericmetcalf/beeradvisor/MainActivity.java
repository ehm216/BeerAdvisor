package me.ericmetcalf.beeradvisor;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickFindBeer(View view){

        //getting the type of beer
        TextView brands = (TextView) findViewById(R.id.brands);

        //reading the value of the spinner
        Spinner color = (Spinner) findViewById(R.id.color);

        //get the selected item of the spinner
        String beerType = String.valueOf(color.getSelectedItem());

        BeerExpert be = new BeerExpert();
        List<String> l = be.getBrands(beerType);

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < l.size(); i++){
            sb.append(l.get(i)).append("\n");
        }

        //change the selected Item
        brands.setText(sb);
    }
}
