package com.tanvi.block02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listViewAnimals = (ListView) findViewById((R.id.listView));
        final ArrayAdapter<CharSequence> adapterAniamls = ArrayAdapter.createFromResource(this ,
                R.array.animalsArray,
                android.R.layout.simple_list_item_1);
        listViewAnimals.setAdapter(adapterAniamls);

        listViewAnimals.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String message = getString(R.string.toastmessage)+adapterAniamls.getItem(i) + " !";
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}