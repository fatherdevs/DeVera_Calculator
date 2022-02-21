package mcm.edu.ph.devera_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText var1txt, var2txt; //declared the edit text boxes
    Button division, subtraction, addition, multiplication, percent; //declared the 5 buttons
    TextView output;

    double var1, var2;


    @Override
    protected void onCreate(Bundle savedInstanceState) { //this method is responsible for creating the display we can see in our app
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //buttons
        addition = findViewById(R.id.addition);
        subtraction = findViewById(R.id.subtraction);
        multiplication= findViewById(R.id.multiplication);
        division = findViewById(R.id.division);
        percent = findViewById(R.id.percent);


        //Answer text view
        output =findViewById(R.id.output);



        addition.setOnClickListener(this);
        subtraction.setOnClickListener(this);
        multiplication.setOnClickListener(this);
        division.setOnClickListener(this);
        percent.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {


        //variable text boxes
        var1txt = findViewById(R.id.input);
        var2txt = findViewById(R.id.Inputtwo);

        //RAW text --> String --Double

        var1 =Double.parseDouble(var1txt.getText().toString());
        var2 =Double.parseDouble(var2txt.getText().toString());



        switch (v.getId()){
            case R.id.addition:
                output.setText(Double.toString(var1+var2));

                break;
            case R.id.subtraction:
                output.setText(Double.toString(var1-var2));

                break;
            case R.id.multiplication:
                output.setText(Double.toString(var1*var2));

                break;
            case R.id.division:
                output.setText(Double.toString(var1/var2));

                break;
            case R.id.percent:
                output.setText(Double.toString(var1%var2));

                break;

        }



    }
}

