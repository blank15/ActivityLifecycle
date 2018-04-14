package id.blank.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Posisi","onCreate Activity1");
        Button buttonGoToActivty = findViewById(R.id.buttonGoToActivity);
        Button buttonPopUp = findViewById(R.id.buttonPopup);

        buttonGoToActivty.setOnClickListener(this);
        buttonPopUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonGoToActivity:
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
                break;
            case R.id.buttonPopup:

        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Posisi","onStart Activity1");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("Posisi","onResume Activity1");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("Posisi","onStop Activity1");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("Posisi","onDestroy Activity1");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("Posisi","onPause Activity1");
    }
}
