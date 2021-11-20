package com.example.du_an_1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class LoginTabFragment extends Fragment {
    TextInputLayout edtLogin,edtPass;
    Button btnLogin;
    float v = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.login_tab_fragment, container, false);



        //Anh xa
        edtLogin = root.findViewById(R.id.edtLogin);
        edtPass = root.findViewById(R.id.edtPass);
        btnLogin = root.findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextInputEditText edt = root.findViewById(R.id.edtEmailHoacSDTinput);
                String cc = edt.getText().toString();
                Toast.makeText(getActivity(), ""+cc, Toast.LENGTH_SHORT).show();
            }
        });










        edtLogin.setTranslationX(800);
        edtPass.setTranslationX(800);
        btnLogin.setTranslationX(800);

        edtLogin.setAlpha(v);
        edtPass.setAlpha(v);
        btnLogin.setAlpha(v);

        edtLogin.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        edtPass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        btnLogin.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();

        return root;
    }
}
