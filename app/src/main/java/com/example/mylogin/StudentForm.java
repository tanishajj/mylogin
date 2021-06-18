package com.example.mylogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

public class StudentForm extends AppCompatActivity {

    ImageView imageview;
    EditText edit_id, edit_firstname, edit_lastname, edit_phone, edit_email, edit_password, edit_final_password, edit_pincode;
    Spinner spinner_country,spinner_state,spinner_city;
    Button button_insert, button_update, button_delete, button_get, button_clear;

    StudentDBHelper db;
    Data data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_form);

        edit_id=findViewById(R.id.edit_id);
        edit_firstname=findViewById(R.id.edit_firstname);
        edit_lastname=findViewById(R.id.edit_lastname);
        edit_phone=findViewById(R.id.edit_phone);
        edit_email=findViewById(R.id.edit_email);
        edit_password=findViewById(R.id.edit_password);
        edit_final_password=findViewById(R.id.edit_final_password);
        edit_pincode=findViewById(R.id.edit_pincode);
        spinner_country=findViewById(R.id.spinner_country);
        spinner_state=findViewById(R.id.spinner_state);
        spinner_city=findViewById(R.id.spinner_city);
        button_insert=findViewById(R.id.button_insert);
        button_update=findViewById(R.id.button_update);
        button_delete=findViewById(R.id.button_delete);
        button_get=findViewById(R.id.button_get);
        button_clear=findViewById(R.id.button_clear);
        imageview=findViewById(R.id.imageview);

        db = new StudentDBHelper(this);
        data= new Data();

        button_insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sid=edit_id.getText().toString();
                db.insertData(sid);
            }
        });
        button_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button_get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        button_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}