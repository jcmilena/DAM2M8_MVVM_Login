package com.example.dam2m8_login_mvvm;

import android.content.Context;

public class MVVM_Repository {

    private Context context;

    //Singleton
    private static MVVM_Repository srepository;

    private MVVM_Repository (){

        //this.context = context;

    }

    public static MVVM_Repository get(){

        if(srepository == null){
            srepository = new MVVM_Repository();
        }
        return srepository;
    }

    ///Metodos acceso a datos M6 necesitare utilizar el Contexto !!!!
    public Boolean checkUser(String user, String pswd){

        //Hago acceso a persistencia (fichero, BBDD, API, ...) y doy respuesta
        return true;
    }


}
