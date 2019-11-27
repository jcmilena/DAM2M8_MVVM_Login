package com.example.dam2m8_login_mvvm.View;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;


import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.Navigation;

import com.example.dam2m8_login_mvvm.R;
import com.example.dam2m8_login_mvvm.ViewModel.LoginViewModel;

public class LoginFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    EditText userEditText, pswdEditText;
    Button loginButton, registerButton;

    LoginViewModel loginViewModel;

    public LoginFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LoginFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LoginFragment newInstance(String param1, String param2) {
        LoginFragment fragment = new LoginFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        loginViewModel =
                ViewModelProviders.of(this).get(LoginViewModel.class);

        // Inflate the layout for this fragment
        View ui_layout = inflater.inflate(R.layout.fragment_login, container, false);

        userEditText = ui_layout.findViewById(R.id.usuarioEditText);
        pswdEditText = ui_layout.findViewById(R.id.passwordEditText);
        loginButton = ui_layout.findViewById(R.id.loginButton);
        registerButton = ui_layout.findViewById(R.id.registerButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(loginViewModel.checkUser(userEditText.getText().toString(),
                        pswdEditText.getText().toString())){

                    //***** CAMBIO DE VISTA CON SUPPORT FRAGMENT MANAGER ******
                    //getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    //        new HomeFragment()).commit();


                    //CAMBIO DE VISTA CON NAVIGATION CONTROLLER
                    Navigation.findNavController(v).navigate(R.id.homeFragment);

                }
            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.mapViewFragment);
            }
        });

        return ui_layout;

    }

}
