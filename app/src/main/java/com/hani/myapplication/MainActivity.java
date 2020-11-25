package com.hani.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

        ImageButton btnKucing,btnAnjing,btnsapi;
        public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            inisialisasiView();
        }

        private void inisialisasiView() {
            btnKucing = findViewById(R.id.btn_buka_ras_kucing);
            btnAnjing = findViewById(R.id.btn_buka_ras_anjing);
            btnsapi = findViewById(R.id.btn_buka_ras_sapi);
            btnKucing.setOnClickListener(view -> bukaGaleri("Kucing"));
            btnAnjing.setOnClickListener(view -> bukaGaleri("Anjing"));
            btnsapi.setOnClickListener(view -> bukaGaleri("Sapi"));
        }

        private void bukaGaleri(String jenisHewan) {
            Log.d("MAIN","Buka activity kucing");
            Intent intent = new Intent(this, GaleryActivity.class);
            intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
            startActivity(intent);
        }
    }

