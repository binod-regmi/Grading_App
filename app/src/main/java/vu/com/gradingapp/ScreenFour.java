package vu.com.gradingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ScreenFour extends AppCompatActivity {
   // private int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_four);

        TextView tx = (TextView)findViewById(R.id.textViewScreenFour);

        Intent intent = getIntent();
         int number = intent.getIntExtra(ScreenThree.EXTRA_NUMBER1,0);
        tx.setText("" + number);

        calculateGrade(number);


    }

    public void calculateGrade(int a)
    {
        if(a<=24 )
        {
            TextView tx1 = (TextView)findViewById(R.id.textViewDegree);
                    tx1.setText("First Degree");



        }
        else if(a>=25 && a<=38)
        {
            TextView tx1 = (TextView)findViewById(R.id.textViewDegree);
            tx1.setText("Second Degree");

        }
        else if(a>=39 && a<=59)

        {
            TextView tx1 = (TextView)findViewById(R.id.textViewDegree);
            tx1.setText("Third Degree");

        }
        else if(a>=60)
        {
            TextView tx1 = (TextView)findViewById(R.id.textViewDegree);
            tx1.setText("Fourth Degree");
        }
        else
        {
            TextView tx1 = (TextView)findViewById(R.id.textViewDegree);
            tx1.setText("Invalid");

        }

    }
}
