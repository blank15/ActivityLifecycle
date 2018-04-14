package id.blank.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("Posisi","onCreate Activity2");

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Posisi","onStart Activity2");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("Posisi","onResume Activity2");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("Posisi","onStop Activity2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("Posisi","onDestroy Activity2");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("Posisi","onPause Activity2");
    }
}
