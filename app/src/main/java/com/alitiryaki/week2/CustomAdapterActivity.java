package com.alitiryaki.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapterActivity extends ListActivity {

    final List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter);

        animals.add(new Animal("Ant", R.drawable.ic_launcher_foreground));
        animals.add(new Animal("Ant", R.drawable.ic_launcher_foreground));
        animals.add(new Animal("Ant", R.drawable.ic_launcher_foreground));
        animals.add(new Animal("Ant", R.drawable.ic_launcher_foreground));
        animals.add(new Animal("Ant", R.drawable.ic_launcher_foreground));
        animals.add(new Animal("Ant", R.drawable.ic_launcher_foreground));
        animals.add(new Animal("Ant", R.drawable.ic_launcher_foreground));
        animals.add(new Animal("Ant", R.drawable.ic_launcher_foreground));

        final ListView listView = (ListView) findViewById(R.id.listview);
        AnimalAdapter adapter = new AnimalAdapter(this, animals);
        listView.setAdapter(adapter);
    }
}