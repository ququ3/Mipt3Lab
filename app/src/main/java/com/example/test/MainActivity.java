package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;


    public class MainActivity extends AppCompatActivity {

        Button button0, button1, button2, button3, button4, button5, button6,
                button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
                buttonMul, button10, buttonC, buttonEqual;
        EditText crunchifyEditText;

        float mValueOne, mValueTwo;

        boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            button0 = (Button) findViewById(R.id.n11);
            button1 = (Button) findViewById(R.id.nx);
            button2 = (Button) findViewById(R.id.n10);
            button3 = (Button) findViewById(R.id.n3);
            button4 = (Button) findViewById(R.id.n4);
            button5 = (Button) findViewById(R.id.n5);
            button6 = (Button) findViewById(R.id.n6);
            button7 = (Button) findViewById(R.id.n7);
            button8 = (Button) findViewById(R.id.n8);
            button9 = (Button) findViewById(R.id.n9);
            buttonAdd = (Button) findViewById(R.id.nxx);
            buttonSub = (Button) findViewById(R.id.nyy);
            buttonMul = (Button) findViewById(R.id.multiplication);
            buttonDivision = (Button) findViewById(R.id.division);
            buttonC = (Button) findViewById(R.id.clearEverything);
            buttonEqual = (Button) findViewById(R.id.nr);


            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    crunchifyEditText.setText(crunchifyEditText.getText() + "1");
                }
            });

            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    crunchifyEditText.setText(crunchifyEditText.getText() + "2");
                }
            });

            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    crunchifyEditText.setText(crunchifyEditText.getText() + "3");
                }
            });

            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    crunchifyEditText.setText(crunchifyEditText.getText() + "4");
                }
            });

            button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    crunchifyEditText.setText(crunchifyEditText.getText() + "5");
                }
            });

            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    crunchifyEditText.setText(crunchifyEditText.getText() + "6");
                }
            });

            button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    crunchifyEditText.setText(crunchifyEditText.getText() + "7");
                }
            });

            button8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    crunchifyEditText.setText(crunchifyEditText.getText() + "8");
                }
            });

            button9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    crunchifyEditText.setText(crunchifyEditText.getText() + "9");
                }
            });

            button0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    crunchifyEditText.setText(crunchifyEditText.getText() + "0");
                }
            });

            buttonAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (crunchifyEditText == null) {
                        crunchifyEditText.setText("");
                    } else {
                        mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                        crunchifyAddition = true;
                        crunchifyEditText.setText(null);
                    }
                }
            });

            buttonSub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                    mSubtract = true;
                    crunchifyEditText.setText(null);
                }
            });

            buttonMul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                    crunchifyMultiplication = true;
                    crunchifyEditText.setText(null);
                }
            });

            buttonDivision.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mValueOne = Float.parseFloat(crunchifyEditText.getText() + "");
                    crunchifyDivision = true;
                    crunchifyEditText.setText(null);
                }
            });

            buttonEqual.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mValueTwo = Float.parseFloat(crunchifyEditText.getText() + "");

                    if (crunchifyAddition == true) {
                        crunchifyEditText.setText(mValueOne + mValueTwo + "");
                        crunchifyAddition = false;
                    }

                    if (mSubtract == true) {
                        crunchifyEditText.setText(mValueOne - mValueTwo + "");
                        mSubtract = false;
                    }

                    if (crunchifyMultiplication == true) {
                        crunchifyEditText.setText(mValueOne * mValueTwo + "");
                        crunchifyMultiplication = false;
                    }

                    if (crunchifyDivision == true) {
                        crunchifyEditText.setText(mValueOne / mValueTwo + "");
                        crunchifyDivision = false;
                    }
                }
            });

            buttonC.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    crunchifyEditText.setText("");
                }
            });

            button10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    crunchifyEditText.setText(crunchifyEditText.getText() + ".");
                }
            });
        }
    }
