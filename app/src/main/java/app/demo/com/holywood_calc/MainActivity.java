package app.demo.com.holywood_calc;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context ctx = MainActivity.this;
        final EditText num = findViewById(R.id.num);
        class Calc{
            int num, res;
            String op;
            public void execute(){
                switch (op){

                }
            }
            int getNum(){return num;}
            void setNum(){this.num = num;}
        }

        findViewById(R.id.plus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ctx,"들어온 값: "+ num.getText().toString(),Toast.LENGTH_LONG).show();
                int int1 = Integer.parseInt(num.getText().toString());
                //sum = int1 + int2;
                Calc c = new Calc();
                Log.d("입력값: ",num.getText().toString());
                //c.execute();
            }
        });
        findViewById(R.id.minus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int int1 = Integer.parseInt(num.getText().toString());
                //sum = int1 + int2;

            }
        });
        findViewById(R.id.multi).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int int1 = Integer.parseInt(num.getText().toString());
                //sum = int1 + int2;

            }
        });
        findViewById(R.id.divid).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int int1 = Integer.parseInt(num.getText().toString());
                //sum = int1 + int2;

            }
        });

        findViewById(R.id.equal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        findViewById(R.id.reset).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    }
}
