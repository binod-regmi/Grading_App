package vu.com.gradingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText)findViewById(R.id.editText);
        Password = (EditText)findViewById(R.id.editText2);
        Login = (Button)findViewById(R.id.button);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });
    }

    private void validate(String userName, String userPassword){
        if((userName.equals("admin")) && (userPassword.equals("admin"))){
            Intent intent = new Intent(MainActivity.this, ScreenTwo.class);
            startActivity(intent);

        }else{
            Toast toast=Toast.makeText(getApplicationContext(),"Username or password is not Correct, Please Try again",Toast.LENGTH_LONG);
            //toast.setMargin(30,200);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();


        }
    }

    }

