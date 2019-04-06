package app.com.lat_akb_if9_10116380_zainachmadr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        Intent intent = getIntent();
        //mengambil nilai dari intent
        String message = intent.getStringExtra(Activity3.EXTRA_MESSAGE);
        //mengambil nilai yang diteruskan dari class mainactivity
        TextView textView = (TextView)findViewById(R.id.txt2);
        //inisialisasi objek textview
        textView.setText(message);
        //menampilkan output nilai dari editext
    }
    public void keluar(View view){

    }
}
