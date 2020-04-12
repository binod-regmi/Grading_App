package vu.com.gradingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class ScreenTwo extends AppCompatActivity {

    public static final String EXTRA_NUMBER = "vu.vom.gradingapp.EXTRA_NUMBER";
    private int total = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_two);

        Button btnScreenTwo=(Button)findViewById(R.id.btnSecScreen);
        btnScreenTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openScreenThree();

            }
        });
    }

    public void openScreenThree() {
        EditText a, b, c, d, e, f;
        int first, second, third, fourth, fifth, sixth;

        a = (EditText) findViewById(R.id.editText12);
        first = Integer.parseInt(a.getText().toString());

        b = (EditText) findViewById(R.id.editText22);
        second = Integer.parseInt(b.getText().toString());

        c = (EditText) findViewById(R.id.editText32);
        third = Integer.parseInt(c.getText().toString());

        d = (EditText) findViewById(R.id.editText42);
        fourth = Integer.parseInt(d.getText().toString());

        e = (EditText) findViewById(R.id.editText52);
        fifth = Integer.parseInt(e.getText().toString());

        f = (EditText) findViewById(R.id.editText62);
        sixth = Integer.parseInt(f.getText().toString());

        total = first + second + third + fourth + fifth + sixth;


        if ((first > 0 && first < 6) && (second > 0 && second < 6) && (third > 0 && third < 6) && (fourth > 0 && fourth < 6) && (fifth > 0 && fifth < 6) && (sixth > 0 && sixth < 6))
        {

            Intent i = new Intent(this, ScreenThree.class);
            i.putExtra(EXTRA_NUMBER, total);
            startActivity(i);
        }
        else
            {
            Toast toast = Toast.makeText(getApplicationContext(), "Please enter the digits between 1-5", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
    }

}


