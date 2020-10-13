package com.rosana.petagramdos.activities;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.rosana.petagramdos.R;
import com.rosana.petagramdos.util.JavaMailAPI;

import java.util.Objects;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        Context context = this;

        Toolbar toolbarFavoritePets = findViewById(R.id.toolbarFavoritePets);
        toolbarFavoritePets.setNavigationOnClickListener(view -> finish());

        TextInputEditText etName = findViewById(R.id.et_name);
        TextInputEditText etEmail = findViewById(R.id.et_email);
        TextInputEditText etMessage = findViewById(R.id.et_message);
        MaterialButton btnSend = findViewById(R.id.btn_send);
        btnSend.setOnClickListener(view -> {
            JavaMailAPI javaMailAPI = new JavaMailAPI( context,
                    Objects.requireNonNull(etEmail.getText()).toString(),
                    Objects.requireNonNull(etName.getText()).toString(),
                    Objects.requireNonNull(etMessage.getText()).toString());
            javaMailAPI.execute();
        });
    }
}
