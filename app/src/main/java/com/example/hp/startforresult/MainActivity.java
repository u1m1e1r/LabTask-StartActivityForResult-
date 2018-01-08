package com.example.hp.startforresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 5) {
            if (resultCode == RESULT_OK) {

                Toast t = Toast.makeText(getApplicationContext(),"hello",Toast.LENGTH_LONG);
                t.show();
            }
        }

    }

    public void onclick(View view){
        Intent i = new Intent(getApplicationContext(),Two.class);
        startActivityForResult(i,5);
    }
}
