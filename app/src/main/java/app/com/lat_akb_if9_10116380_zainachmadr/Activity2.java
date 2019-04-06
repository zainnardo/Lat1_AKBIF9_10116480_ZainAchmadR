package app.com.lat_akb_if9_10116380_zainachmadr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import app.com.lat_akb_if9_10116380_zainachmadr.Activity3;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }
    public void masuk3 (View view){
        Intent intent = new Intent(Activity2.this, Activity3.class);
        startActivity(intent);
    }
}
