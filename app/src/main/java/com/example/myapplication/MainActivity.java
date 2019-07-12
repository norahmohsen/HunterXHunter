package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {
    EditText enteredUser, enteredPass;
    String correctPass = "1";
    String correctUser = "1";
    Button login, signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enteredPass = findViewById(R.id.passwordEditText);
        enteredUser = findViewById(R.id.userNameEditText);

        login = findViewById(R.id.loginButton);
        login.setOnClickListener(this);
        signUp = findViewById(R.id.signupButton);
        signUp.setOnClickListener(this);

    }//onCreate


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.loginButton:
                String enteredPassString = enteredPass.getText().toString();
                String enteredUserString = enteredUser.getText().toString();
                if (enteredPassString.equalsIgnoreCase(correctPass) && enteredUserString.equalsIgnoreCase(correctUser)) {
                    Toast.makeText(getApplicationContext(), getResources().getString(R.string.login_succ_message), Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                } else {
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);

                    // Setting Dialog Title
                    alertDialog.setTitle(getResources().getString(R.string.login_error));

                    // Setting Dialog Message
                    alertDialog.setMessage(getResources().getString(R.string.login_error_message));

                    // Setting Icon to Dialog
                    alertDialog.setIcon(R.drawable.delete);

                    // Setting Positive "Yes" Button
                    alertDialog.setPositiveButton(getResources().getString(R.string.login_error_ok), new DialogInterface.OnClickListener() {

                        public void onClick(DialogInterface dialog, int which) {

                            // Write your code here to invoke YES event
                            Toast.makeText(getApplicationContext(), getResources().getString(R.string.login_error_ok_clicked), Toast.LENGTH_SHORT).show();
                        }
                    });

                    // Setting Negative "NO" Button
                    alertDialog.setNegativeButton(getResources().getString(R.string.login_error_cancel), new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // Write your code here to invoke NO event
                            Toast.makeText(getApplicationContext(), getResources().getString(R.string.login_error_cancel_clicked), Toast.LENGTH_SHORT).show();
                            dialog.cancel();
                        }
                    });

                    // Showing Alert Message
                    alertDialog.show();
                }
            case R.id.signupButton:
                enteredPass.setText("");
                enteredUser.setText("");
                break;
            //
        }  //switch
    }//onclick

}
