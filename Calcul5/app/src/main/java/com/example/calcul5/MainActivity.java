package com.example.calcul5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int valeur1=0,  valeur2=0;
    private String operation ="";
    private Boolean isOp1=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toast.makeText(Context, "Hello!!", Toast.LENGTH_SHORT).show();

        Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnPlus,btnMinus,btnDiv,btnMult,btnAC,btnEqual;
        TextView tvOp;
        btn0=(Button)findViewById(R.id.btn0);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btnPlus=(Button)findViewById(R.id.btnPlus);
        btnMinus=(Button)findViewById(R.id.btnMinus);
        btnMult=(Button)findViewById(R.id.btnMult);
        btnDiv=(Button)findViewById(R.id.btnDiv);
        btnAC=(Button)findViewById(R.id.btnAC);
        btnEqual=(Button)findViewById(R.id.btnEqual);
        tvOp=(TextView)findViewById(R.id.tvOp);
        //btn0.setText("bl");

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tvOp.getText()!="0")
                    tvOp.setText(tvOp.getText()+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tvOp.getText()=="0")
                    tvOp.setText("");
                tvOp.setText(tvOp.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tvOp.getText()=="0")
                    tvOp.setText("");
                tvOp.setText(tvOp.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tvOp.getText()=="0")
                    tvOp.setText("");
                tvOp.setText(tvOp.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tvOp.getText()=="0")
                    tvOp.setText("");
                tvOp.setText(tvOp.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tvOp.getText()=="0")
                    tvOp.setText("");
                tvOp.setText(tvOp.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tvOp.getText()=="0")
                    tvOp.setText("");
                tvOp.setText(tvOp.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tvOp.getText()=="0")
                    tvOp.setText("");
                tvOp.setText(tvOp.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tvOp.getText()=="0")
                    tvOp.setText("");
                System.out.println(tvOp.getText());
                tvOp.setText(tvOp.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvOp.setText(tvOp.getText()+"9");
            }
        });
        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvOp.setText("0");
                valeur1=0;
                valeur2=0;
                operation ="";
                isOp1=false;
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation="-";
                tvOp.setText(tvOp.getText()+"-");
                //valeur1=Integer.valueOf(String.valueOf(tvOp.getText()));
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation="+";
                tvOp.setText(tvOp.getText()+"+");
                //valeur1=Integer.valueOf(String.valueOf(tvOp.getText()));
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation="/";
                tvOp.setText(tvOp.getText()+"/");
                //valeur1=Integer.valueOf(String.valueOf(tvOp.getText()));
            }
        });
        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation="*";
                tvOp.setText(tvOp.getText()+"*");
                //valeur1=Integer.valueOf(String.valueOf(tvOp.getText()));
            }
        });


    }
}