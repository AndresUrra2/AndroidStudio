package com.aurra.proyectogithub1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class actividaduno extends AppCompatActivity {

    private TextView tv1;
    private ListView lv1;

    private String nombre [] = {"Samuel","Valentina","Andres","Kim","Arriete","Patricio","Ignacio","Brordan","Alexis","Katty"};
    private String edades [] = {"18","19","20","21","22","23","24","25","26","27"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividaduno);

        tv1 = findViewById(R.id.txt_uno);
        lv1 = findViewById(R.id.lv_uno);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item_test, nombre);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                tv1.setText("La edad de "+lv1.getItemAtPosition(i) + " Es " + edades[i] + " años");
            }
        });
    }
}