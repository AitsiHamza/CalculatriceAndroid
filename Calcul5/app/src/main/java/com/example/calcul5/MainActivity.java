package com.example.calcul5;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> operands=new ArrayList<>();
    private String operation ="";
    private int result=0;
    private Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnPlus,btnMinus,btnDiv,btnMult,btnAC,btnEqual;
    private TextView tvOp,tvAllOp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toast.makeText(Context, "Hello!!", Toast.LENGTH_SHORT).show();

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
                operands.add(tvOp.getText().toString());
                if(operands.size()>=3) {
                    for (int i = 0; i <= operands.size() - 2; i++) {//0123456
                        if (operands.get(i) == "/" && operands.get(i + 1) == "0"){
                            btnAC.callOnClick();
                            return;
                        }
                    }
                }
                if(operands.size()>=3){
                    for (int i=0;i<=operands.size()-3;i++) {
                        if(operands.get(i+1)=="*" && operands.size()>=3){
                            operands.add(i, String.valueOf(
                                    Integer.valueOf(operands.get(i))*Integer.valueOf(operands.get(i+2))
                            ));
                            //showAll(operands);
                            operands.remove(i+1);
                            operands.remove(i+1);
                            operands.remove(i+1);
                            i=i-2;
                        }
                    }
                    for (int i=0;i<=operands.size()-3;i++) {
                        if(operands.get(i+1)=="/" && operands.size()>=3){
                            operands.add(i, String.valueOf(
                                    Integer.valueOf(operands.get(i))/Integer.valueOf(operands.get(i+2))
                            ));
                            //showAll(operands);
                            operands.remove(i+1);
                            operands.remove(i+1);
                            operands.remove(i+1);
                            i=i-2;
                        }
                    }
                }
                if(operands.size()>=3){
                    for (int i=0;i<=operands.size()-3;i++) {
                        if(operands.get(i+1)=="+" && operands.size()>=3){
                            operands.add(i, String.valueOf(
                                    Integer.valueOf(operands.get(i))+Integer.valueOf(operands.get(i+2))
                            ));
                            //showAll(operands);
                            operands.remove(i+1);
                            operands.remove(i+1);
                            operands.remove(i+1);
                            i=i-2;
                        }
                    }
                    for (int i=0;i<=operands.size()-3;i++) {
                        if(operands.get(i+1)=="-" && operands.size()>=3){
                            operands.add(i, String.valueOf(
                                    Integer.valueOf(operands.get(i))-Integer.valueOf(operands.get(i+2))
                            ));
                            //showAll(operands);
                            operands.remove(i+1);
                            operands.remove(i+1);
                            operands.remove(i+1);
                            i=i-2;
                        }
                    }
                }
                tvAllOp.setText("");
                tvOp.setText(operands.get(0));
                operands=new ArrayList<>();
            }
        });

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putString("tvOp",tvOp.getText().toString());
        outState.putString("tvAllOp",tvAllOp.getText().toString());
        outState.putString("operation",operation);
        outState.putStringArrayList("operands",operands);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        tvOp.setText(savedInstanceState.getString("tvOp"));
        tvAllOp.setText(savedInstanceState.getString("tvAllOp"));
        super.onRestoreInstanceState(savedInstanceState);
    }

    public static void showAll(List<String> list){
        System.out.println("*********************************");
        for (String s:list) {
            System.out.println(s);
        }
    }
}