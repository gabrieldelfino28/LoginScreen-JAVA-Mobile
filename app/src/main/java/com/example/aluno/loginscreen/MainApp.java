package com.example.aluno.loginscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.aluno.myapplication.R;

import java.util.HashMap;

public class MainApp extends AppCompatActivity {

    private static final HashMap<String, String> usuariosMap = new HashMap<>();
    EditText editTextLogin;
    EditText editTexPass;
    Button btnLimpar;
    Button btnOk;

    {
        usuariosMap.put("gabriel","123");
        usuariosMap.put("nicolas","123");
        usuariosMap.put("guilherme","123");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editTextLogin = findViewById(R.id.editTextLogin);
        editTexPass = findViewById(R.id.editTextPassword);
        btnLimpar = findViewById(R.id.btnLimparCampos);
        btnOk = findViewById(R.id.btnOk);

        this.btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nomeDeUsuarioInformado = editTextLogin.getText().toString();
                String senhaDeUsuarioInformada = editTexPass.getText().toString();

                Toast.makeText(getApplicationContext(),
                        "editTextLogin.getText()="+editTextLogin.getText(),
                        Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),
                        "editTextPass.getText()="+editTexPass.getText(),
                        Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),
                        "editTextLogin.getText().toString="+editTextLogin.getText().toString(),
                        Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),
                        "editTextPass.getText().toString="+editTexPass.getText().toString(),
                        Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),
                        "senhaDeUsuarioInformada="+senhaDeUsuarioInformada,
                        Toast.LENGTH_LONG).show();
                //Se a chava "nomeDeUsuarioInformado existir, o get retorna a senha
                String passwCadastrado = MainApp.usuariosMap.get(nomeDeUsuarioInformado);

                if(passwCadastrado != null && passwCadastrado.equals(senhaDeUsuarioInformada)){
                    Toast.makeText(getApplicationContext(),"Login Sucesso",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(getApplicationContext(), "Login Falhou", Toast.LENGTH_SHORT).show();
                }
            }

        });

    }
}
