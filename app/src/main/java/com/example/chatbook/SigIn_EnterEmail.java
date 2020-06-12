package com.example.chatbook;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SigIn_EnterEmail extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_sig_in__enter_email, container, false);

        view.findViewById(R.id.btnSignInEmailNextToProfile).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Navigation.findNavController(view).navigate(R.id.action_sigIn_EnterEmail_to_signIn_uploadProfile);

            }
        });

        return view;
    }
}