package app.com.lat_akb_if9_10116380_zainachmadr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void masuk2 (View view){
        Intent intent = new Intent(MainActivity.this, Activity2.class);
        startActivity(intent);
    }
}
