package com.example.dam2m8_login_mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.dam2m8_login_mvvm.View.LoginFragment;

public class MainActivity extends AppCompatActivity {

    FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        fm = getSupportFragmentManager();
        fm.beginTransaction().replace(R.id.fragment_container, new LoginFragment()).commit();


    }
}
