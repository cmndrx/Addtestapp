package demauchient.gmail.com.addtestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = (Button) findViewById(R.id.AddBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstnumedittext = (EditText) findViewById(R.id.firstnumedittext);
                EditText secondnumeditext = (EditText) findViewById(R.id.secondnumedittext);
                TextView resulttextview = (TextView) findViewById(R.id.resultTextView);

                int num1 = Integer.parseInt(firstnumedittext.getText().toString());
                int num2 = Integer.parseInt(secondnumeditext.getText().toString());
                int result = num1 - num2;
                resulttextview.setText(result + "");
            }
        });
    }
}
