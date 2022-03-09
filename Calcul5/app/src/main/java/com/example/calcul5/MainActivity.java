package com.example.calcul5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> operands=new ArrayList<>();
    private String operation ="";
    private int result=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toast.makeText(Context, "Hello!!", Toast.LENGTH_SHORT).show();

        Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnPlus,btnMinus,btnDiv,btnMult,btnAC,btnEqual;
        TextView tvOp,tvAllOp;
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
        tvAllOp=(TextView)findViewById(R.id.tvAllOp);
        tvOp=(TextView)findViewById(R.id.tvOp);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tvOp.getText().toString().isEmpty()) {
                    tvOp.setText("0");
                }else if(tvOp.getText().toString()!="0"){
                    tvOp.setText(tvOp.getText()+"0");
                }
                operation="";
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tvOp.getText().toString().isEmpty() || tvOp.getText().toString()=="0"){
                    tvOp.setText("1");
                }else{
                    tvOp.setText(tvOp.getText() + "1");
                }
                operation="";
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tvOp.getText().toString().isEmpty() || tvOp.getText().toString()=="0"){
                    tvOp.setText("2");
                }else{
                    tvOp.setText(tvOp.getText() + "2");
                }
                operation="";
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tvOp.getText().toString().isEmpty() || tvOp.getText().toString()=="0"){
                    tvOp.setText("3");
                }else{
                    tvOp.setText(tvOp.getText() + "3");
                }
                operation="";
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tvOp.getText().toString().isEmpty() || tvOp.getText().toString()=="0"){
                    tvOp.setText("4");
                }else{
                    tvOp.setText(tvOp.getText() + "4");
                }
                operation="";
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tvOp.getText().toString().isEmpty() || tvOp.getText().toString()=="0"){
                    tvOp.setText("5");
                }else{
                    tvOp.setText(tvOp.getText() + "5");
                }
                operation="";
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tvOp.getText().toString().isEmpty() || tvOp.getText().toString()=="0"){
                    tvOp.setText("6");
                }else{
                    tvOp.setText(tvOp.getText() + "6");
                }
                operation="";
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tvOp.getText().toString().isEmpty() || tvOp.getText().toString()=="0"){
                    tvOp.setText("7");
                }else{
                    tvOp.setText(tvOp.getText() + "7");
                }
                operation="";
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tvOp.getText().toString().isEmpty() || tvOp.getText().toString()=="0"){
                    tvOp.setText("8");
                }else{
                    tvOp.setText(tvOp.getText() + "8");
                }
                operation="";
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tvOp.getText().toString().isEmpty() || tvOp.getText().toString()=="0"){
                    tvOp.setText("9");
                }else{
                    tvOp.setText(tvOp.getText() + "9");
                }
                operation="";
            }
        });
        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvOp.setText("");
                tvAllOp.setText("");
                operands=new ArrayList<>();
                operation ="";
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!tvOp.getText().toString().isEmpty() &&
                        operation!="-" &&
                        operation!="+" &&
                        operation!="/" &&
                        operation!="*") {
                    operation = "-";
                    tvAllOp.setText(tvAllOp.getText() +""+ tvOp.getText() + "-");
                    operands.add(tvOp.getText().toString());
                    operands.add("-");
                    tvOp.setText("");
                }
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!tvOp.getText().toString().isEmpty() &&
                        operation!="-" &&
                        operation!="+" &&
                        operation!="/" &&
                        operation!="*") {
                    operation = "+";
                    tvAllOp.setText(tvAllOp.getText() +""+ tvOp.getText() + "+");
                    operands.add(tvOp.getText().toString());
                    operands.add("+");
                    tvOp.setText("");
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!tvOp.getText().toString().isEmpty() &&
                        operation!="-" &&
                        operation!="+" &&
                        operation!="/" &&
                        operation!="*") {
                    operation = "/";
                    tvAllOp.setText(tvAllOp.getText() +""+ tvOp.getText() + "/");
                    operands.add(tvOp.getText().toString());
                    operands.add("/");
                    tvOp.setText("");
                }
            }
        });
        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!tvOp.getText().toString().isEmpty() &&
                        operation!="-" &&
                        operation!="+" &&
                        operation!="/" &&
                        operation!="*") {
                    operation = "*";
                    tvAllOp.setText(tvAllOp.getText() +""+ tvOp.getText() + "*");
                    operands.add(tvOp.getText().toString());
                    operands.add("*");
                    tvOp.setText("");
                }
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvAllOp.setText(tvAllOp.getText()+""+tvOp.getText());
                /*if(operands[0]!="" && operands[1]!=""){
                    if(operation=="+")
                        result=Integer.valueOf(operands[0])+Integer.valueOf(operands[1]);
                    else if(operation=="/" && operands[1]!="0")
                        result=Integer.valueOf(operands[0])/Integer.valueOf(operands[1]);
                    else if(operation=="/" && operands[1]=="0"){
                        tvAllOp.setText("");
                        tvOp.setText("");
                        return;
                    }
                    else if(operation=="-")
                        result=Integer.valueOf(operands[0])-Integer.valueOf(operands[1]);
                    else if(operation=="*")
                        result=Integer.valueOf(operands[0])*Integer.valueOf(operands[1]);
                    tvAllOp.setText(String.valueOf(result));
                }*/
            }
        });

    }
}