package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8;
    public TableRow table1, table2;
    public ImageButton talk, see, place, people, message, song;
    public ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        table1 = (TableRow)findViewById(R.id.tableRow);
        table2 = (TableRow) findViewById(R.id.tableRow2);
        tv1 = (TextView) findViewById(R.id.name);
        tv2 = (TextView) findViewById(R.id.city);
        tv3 = (TextView) findViewById(R.id.chat_text);
        tv4 = (TextView) findViewById(R.id.gallery_text);
        tv5 = (TextView) findViewById(R.id.loc_text);
        tv6 = (TextView) findViewById(R.id.textView3);
        tv7 = (TextView) findViewById(R.id.textView4);
        tv8 = (TextView) findViewById(R.id.bell);
        image = (ImageView) findViewById(R.id.imageView);

    }

    public boolean createMenu(Menu menu){
        getMenuInflater().inflate(R.menu.dot_menu, menu);
        return true;
    }
}