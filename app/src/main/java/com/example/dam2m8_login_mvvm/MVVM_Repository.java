package com.example.dam2m8_login_mvvm;

public class MVVM_Repository {

    //Singleton
    private static MVVM_Repository srepository;

    private MVVM_Repository (){

    }

    public MVVM_Repository get(){

        if(srepository == null){
            srepository = new MVVM_Repository();
        }
        return srepository;
    }

    ///Metodos acceso a datos M6 !!!!
    public Boolean checkUser(String user, String pswd){

        //Hago acceso a persistencia (fichero, BBDD, API, ...) y doy respuesta
        return true;
    }


}
