package com.google.yuqiqi.appportfolio;

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

    public void showToastPopularMovie(View view){
        Toast toast = Toast.makeText(getApplicationContext(),R.string.PopularMovieMessage,Toast.LENGTH_SHORT);
        toast.show();

    }
    public void showToastStoctHawk(View view){
        Toast toast = Toast.makeText(getApplicationContext(),R.string.StoctHawkMessage,Toast.LENGTH_SHORT);
        toast.show();
    }
    public void showToastBuildItBigger(View view){
        Toast toast = Toast.makeText(getApplicationContext(),R.string.BuildItBiggerMessage,Toast.LENGTH_SHORT);
        toast.show();
    }
    public void showToastMakeYourAppMaterial(View view){
        Toast toast = Toast.makeText(getApplicationContext(),R.string.MakeYourAppMaterialMessage,Toast.LENGTH_SHORT);
        toast.show();
    }
    public void showToastGoUbiquitous(View view){
        Toast toast = Toast.makeText(getApplicationContext(),R.string.GoUbiquitousMessage,Toast.LENGTH_SHORT);
        toast.show();
    }
    public void showToastCatstone(View view){
        Toast toast = Toast.makeText(getApplicationContext(),R.string.CatstoneMessage,Toast.LENGTH_SHORT);
        toast.show();
    }

}
