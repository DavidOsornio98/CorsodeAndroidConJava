package com.cursoandroid.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.cursoandroid.helloworld.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String age =  binding.ageEdit.getText().toString();

                if (!age.isEmpty()) {
                    int ageInt = Integer.parseInt(age);

                    int result = ageInt * 7;

                    String resultString = getString(R.string.resul_format, result);
                    binding.resulText.setText(resultString);
                } else {
                    Log.e("MainAcivity", "Age field is empty");
                    Toast.makeText(MainActivity.this, getString(R.string.you_have_insert_an_age), Toast.LENGTH_SHORT).show();
                    //Toast.makeText(this,"Debes insertar una edad", Toast.LENGTH_LONG).show();
                    //Toast.makeText(this,'Selecciona una eda', Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}