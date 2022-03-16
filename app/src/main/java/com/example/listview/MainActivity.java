package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<Jidlo> data;
    ListView listViewJidla;

    private List<Jidlo> getData(){
        List<Jidlo> data = new ArrayList();
        data.add(new Jidlo("Steak s americkými bramborami"));
        data.add(new Jidlo("Jahodové knedlíky s cukrem"));
        data.add(new Jidlo("Čočka s vejcem"));
        return data;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = getData();

        listViewJidla = findViewById(R.id.listview_oblibena_jidla);

        ArrayAdapter<Jidlo> adapter = new ArrayAdapter<>();
    }
}