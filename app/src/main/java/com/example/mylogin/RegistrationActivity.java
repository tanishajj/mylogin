package com.example.mylogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity {

    EditText inputName,inputEmail,inputpassword,inputConfermPassword;
    Button RButton;
    TextView textAccount;
    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        inputName=findViewById(R.id.inputName);
        inputEmail=findViewById(R.id.inputEmail);
        inputpassword=findViewById(R.id.inputpassword);
        inputConfermPassword=findViewById(R.id.inputConfermPassword);
        RButton=findViewById(R.id.RButton);
        textAccount=findViewById(R.id.textAccount);
        DB=new DBHelper(this);

        textAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RegistrationActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });

        RButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent login_intent=new Intent(RegistrationActivity.this,LoginActivity.class);
//                startActivity(login_intent);
                String user = inputName.getText().toString();
                String mail = inputEmail.getText().toString();
                String pass = inputpassword.getText().toString();
                String repass = inputConfermPassword.getText().toString();

                if(user.equals("")||mail.equals("")||pass.equals("")||repass.equals(""))
                    Toast.makeText(RegistrationActivity.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                else{
                    if(pass.equals(repass)){
                        Boolean checkuser = DB.checkusername(user);
                        if(checkuser==false){
                            Boolean insert = DB.insertData(user,mail,pass);
                            if(insert==true){
                                Toast.makeText(RegistrationActivity.this, "Registered successfully", Toast.LENGTH_SHORT).show();
                                Intent intent1 = new Intent(RegistrationActivity.this,LoginActivity.class);
                                startActivity(intent1);
                            }else{
                                Toast.makeText(RegistrationActivity.this, "Registration failed", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else{
                            Toast.makeText(RegistrationActivity.this, "User already exists! please sign in", Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        Toast.makeText(RegistrationActivity.this, "Passwords not matching", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}