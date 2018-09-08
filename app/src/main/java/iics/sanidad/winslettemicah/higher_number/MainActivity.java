package iics.sanidad.winslettemicah.higher_number;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button pressMeButton = (Button) findViewById(R.id.pressMeButton);
        pressMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText editText1 = (EditText) findViewById(R.id.editText1);
                EditText editText2 = (EditText) findViewById(R.id.editText2);
                TextView textView = (TextView) findViewById(R.id.textView);
                int firstNum = Integer.parseInt(editText1.getText().toString());
                int secondNum = Integer.parseInt(editText2.getText().toString());
                String result;

                if(firstNum > secondNum) {
                    result = "Higher Number is : " + firstNum;
                    textView.setText(result);
                }
                else if(firstNum < secondNum) {
                    result = "Higher Number is : " + secondNum;
                    textView.setText(result);
                }
                else if(firstNum == secondNum){
                    result = "The two numbers are equal.";
                    textView.setText(result);
                }
                else {
                    System.out.println("Your input is not valid");
                    textView.setText("null");
                }




            }

        });
    }
}
