package com.example.dam2m8_login_mvvm.ViewModel;

import com.example.dam2m8_login_mvvm.MVVM_Repository;

import androidx.lifecycle.ViewModel;

public class LoginViewModel extends ViewModel {

    //Variables
    MVVM_Repository miRepositorio = MVVM_Repository.get();


    public Boolean checkUser(String user, String pswd){

       return miRepositorio.checkUser(user, pswd);

    }

}
