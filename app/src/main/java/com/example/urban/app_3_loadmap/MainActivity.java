package com.example.urban.app_3_loadmap;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showMap(View view){
        EditText edtLat = (EditText) findViewById(R.id.editTextLatitude);
        EditText edtLng = (EditText) findViewById(R.id.editTextLongitude);
        String lat = edtLat.getText().toString();
        String lng = edtLng.getText().toString();
        Double dLat = Double.parseDouble(lat);
        Double dLng = Double.parseDouble(lng);
        //show map
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:"+dLat+","+dLng));
        startActivity(intent);
    }
}
