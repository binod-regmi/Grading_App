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

public class ScreenThree extends AppCompatActivity {

   public static final String EXTRA_NUMBER1 = "vu.vom.gradingapp.EXTRA_NUMBER1";
    private int finalTotal = 0;
    private int total =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_three);

        Button btnScreenThird = (Button)findViewById(R.id.btnThirdScreen);
        btnScreenThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openScreenFour();

            }
        });




    }
     public void  openScreenFour()
     {
         EditText a,b,c,d,e,f,g;
         int first, second, third, fourth, fifth, sixth, seventh;

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

         g = (EditText)findViewById(R.id.editText72);
         seventh = Integer.parseInt(g.getText().toString());


         total = first + second + third + fourth + fifth + sixth + seventh;

         if ((first > 0 && first < 6) && (second > 0 && second < 6) && (third > 0 && third < 6) && (fourth > 0 && fourth < 6) && (fifth > 0 && fifth < 6) && (sixth > 0 && sixth < 6)) {


             Intent intent = new Intent(this, ScreenFour.class);


             int number = getIntent().getIntExtra(ScreenTwo.EXTRA_NUMBER, 0);

             finalTotal = total + number;


             intent.putExtra(EXTRA_NUMBER1, finalTotal);
             startActivity(intent);

         }
         else
         {
             Toast toast = Toast.makeText(getApplicationContext(), "Please enter the digits between 1-5", Toast.LENGTH_LONG);
             toast.setGravity(Gravity.CENTER, 0, 0);
             toast.show();
         }


        // Intent intent = getIntent();
        // int number = i.getIntExtra(ScreenTwo.EXTRA_NUMBER,0);


     }
}
