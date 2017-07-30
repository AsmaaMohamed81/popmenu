package com.example.ok.popmenu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button1 = (Button) findViewById(R.id.button1);

        final int[] index = {0};
         final int[] picc =new int[]{R.drawable.eng1,R.drawable.eng2,R.drawable.eng3};
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView pic=(ImageView)findViewById(R.id.pic);
                pic.setImageResource(picc[index[0]]);
                index[0]++;
                if(index[0] >2){
                    index[0] =0;
                }
            }
        }); //closing the setOnClickListener method
    }
}

