package app.com.lat_akb_if9_10116380_zainachmadr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity3 extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "app.com.lat_akb_if9_10116405_fahrihfatahilah";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);


        }
    public void masuk(View view){
        Intent intent = new Intent(this,Activity4.class);
        //inisialisasi intent
        EditText editnama = (EditText)findViewById(R.id.txtnama);
        EditText editumur = (EditText)findViewById(R.id.txtumur);
        //inisialisasi editext
        String message = editnama.getText().toString();


        intent.putExtra(EXTRA_MESSAGE,message);


        //dengan tipe data key value
        startActivity(intent);

    }
}
