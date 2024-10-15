package com.example.gridviewkullanm;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private GridView mgridview;
    private String[] sayilar={"1","2","3","4","5","6",
                               "7","8","9","10"};

    private ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mgridview=findViewById(R.id.main_activity_gridview);

        adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,sayilar);
        mgridview.setAdapter(adapter);

        mgridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),sayilar[position], Toast.LENGTH_SHORT).show();
            }
        });
        

    }
}