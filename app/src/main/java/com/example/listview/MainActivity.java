package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

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

        ArrayAdapter<Jidlo> adapter = new ArrayAdapter<>(
                this, //okno, kde adaptér běží
                // XML pro jednu položku listu
                android.R.layout.simple_list_item_1,
                data
        );
        listViewJidla.setAdapter(adapter);

        listViewJidla.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Object object = listViewJidla.getItemAtPosition(i);
                Jidlo jidlo = (Jidlo)object;
                Toast.makeText(getBaseContext(), jidlo.getNazev(), Toast.LENGTH_SHORT).show();
            }
        });

        //ukázka tlačítka pro vložení do listu
        Button number_btn = findViewById(R.id.number_btn);
        number_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nahodneCislo = (int) (Math.random()*100+1);
                data.add(new Jidlo("Číslo: " + nahodneCislo));
                adapter.notifyDataSetChanged();
            }
        });

        //udělat insert pro nazev a recept

        //ukázka vytvoření random number
        //int nahodneCislo = (int) (Math.random()*100+1);

        //ukázka vytvoření toastu
        //Toast.makeText(this, "Číslo: " + nahodneCislo, Toast.LENGTH_LONG).show();
    }

    //pridat tlacitko generovat cislo
}