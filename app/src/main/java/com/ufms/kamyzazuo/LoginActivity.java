package com.ufms.kamyzazuo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {
    Button bttlogin;
    EditText email,senha;
    String emailS,senhaS;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        bttlogin=findViewById(R.id.bttlogin);
        email=findViewById(R.id.edttxtemail);
        senha=findViewById(R.id.edtTxtTsenha);

        mAuth= FirebaseAuth.getInstance();

        bttlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                emailS=email.getText().toString().trim();
                senhaS=senha.getText().toString();
                if(TextUtils.isEmpty(emailS)){
                    email.setError("Email é necessaria");
                    return;
                }
                if(TextUtils.isEmpty(senhaS)){
                    email.setError("Senha é necessaria");
                    return;
                }
                mAuth.signInWithEmailAndPassword(emailS,senhaS).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(LoginActivity.this, "Login concluido com sucesso", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(),MenuDoFunc.class));
                        }
                        else{
                            Toast.makeText(LoginActivity.this, "Erro ao realizar o login", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
    }
}