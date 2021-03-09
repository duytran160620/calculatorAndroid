package com.example.hellowolrd;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


import static java.lang.Double.*;

enum Operator {
    add, minus, multiply, divide, none
}
public class MainActivity extends AppCompatActivity {

    // Result
    TextView textViewResult;
    // Numbers
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button0;
    // Operator
    Button add;
    Button minus;
    Button divide;
    Button multiply;
    Button equal;
    // Others Button
    Button deleteAll;
    Button delete;
    Button dot;

    Operator o;
    String numberOnScreen = "";
    double firstNumber = 0;
    double secondNumber = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewResult = findViewById(R.id.textViewResult);
        setupButtonNumbersClick();
        setupButtonAddClick();
        setupButtonMinusClick();
        setupButtonMultiplyClick();
        setupButtonDivideClick();
        setupButtonEqualClick();
        setupButtonClear();
        setupButtonClearAll();
        setupButtonDotClick();
    }
    void setupButtonNumbersClick() {
        button0 =  findViewById(R.id.button0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberOnScreen = numberOnScreen + button0.getText();
                textViewResult.setText(numberOnScreen);
            }
        });

        button1 =  findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberOnScreen = numberOnScreen + button1.getText();
                textViewResult.setText(numberOnScreen);
            }
        });

        button2 =  findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberOnScreen = numberOnScreen + button2.getText();
                textViewResult.setText(numberOnScreen);
            }
        });

        button3 =  findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberOnScreen = numberOnScreen + button3.getText();
                textViewResult.setText(numberOnScreen);
            }
        });

        button4 =  findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberOnScreen = numberOnScreen + button4.getText();
                textViewResult.setText(numberOnScreen);
            }
        });

        button5 =  findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberOnScreen = numberOnScreen + button5.getText();
                textViewResult.setText(numberOnScreen);
            }
        });

        button6 =  findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberOnScreen = numberOnScreen + button6.getText();
                textViewResult.setText(numberOnScreen);
            }
        });

        button7 =  findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberOnScreen = numberOnScreen + button7.getText();
                textViewResult.setText(numberOnScreen);
            }
        });

        button8 =  findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberOnScreen = numberOnScreen + button8.getText();
                textViewResult.setText(numberOnScreen);
            }
        });

        button9 =  findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberOnScreen = numberOnScreen + button9.getText();
                textViewResult.setText(numberOnScreen);
            }
        });


    }

    void setupButtonAddClick() {
        add = findViewById(R.id.buttonAdd);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!numberOnScreen.equals("")) {
                    numberOnScreen = numberOnScreen.replace(",", ".");
                    firstNumber = parseDouble(numberOnScreen);
                    textViewResult.setText("");
                    numberOnScreen = "";
                    o = Operator.add;
                }
            }
        });
    }

    void setupButtonMinusClick() {
        minus = findViewById(R.id.buttonMinus);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!numberOnScreen.equals("")) {
                    numberOnScreen = numberOnScreen.replace(",", ".");
                    firstNumber = parseDouble(numberOnScreen);
                    textViewResult.setText("");
                    numberOnScreen = "";
                    o = Operator.minus;
                }
            }
        });
    }

    void setupButtonMultiplyClick() {
        multiply = findViewById(R.id.buttonMultiply);
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!numberOnScreen.equals("")) {
                    numberOnScreen = numberOnScreen.replace(",", ".");
                    firstNumber = parseDouble(numberOnScreen);
                    textViewResult.setText("");
                    numberOnScreen = "";
                    o = Operator.multiply;
                }
            }
        });
    }

    void setupButtonDivideClick() {
        divide = findViewById(R.id.buttonDivide);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!numberOnScreen.equals("")) {
                    numberOnScreen = numberOnScreen.replace(",", ".");
                    firstNumber = parseDouble(numberOnScreen);
                    textViewResult.setText("");
                    numberOnScreen = "";
                    o = Operator.divide;
                }
            }
        });
    }

    void setupButtonEqualClick() {
        equal = findViewById(R.id.buttonEqual);
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondNumber = parseDouble(textViewResult.getText().toString());
                if(o == Operator.add) {
                    double kq = firstNumber + secondNumber;
                    numberOnScreen = String.format("%.2f", kq);
                    textViewResult.setText(numberOnScreen);
                } else if(o == Operator.minus) {
                    double kq = firstNumber - secondNumber;
                    numberOnScreen = String.format("%.2f", kq);
                    textViewResult.setText(numberOnScreen);
                } else if(o == Operator.multiply) {
                    double kq = firstNumber * secondNumber;
                    numberOnScreen = String.format("%.2f", kq);
                    textViewResult.setText(numberOnScreen);
                } else if(o == Operator.divide) {
                    if (secondNumber != 0) {
                        double kq = firstNumber / secondNumber;
                        numberOnScreen = String.format("%.2f", kq);
                        textViewResult.setText(numberOnScreen);
                    } else {
                        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                        alertDialog.setTitle("Alert");
                        alertDialog.setMessage("Error: Can't divide by zero");
                        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.dismiss();
                                    }
                                });
                        alertDialog.show();
                        firstNumber = 0;
                        secondNumber = 0;
                        numberOnScreen = "";
                        textViewResult.setText("");
                        o = Operator.none;
                    }
                }
            }
        });
    }

    void setupButtonClearAll() {
        deleteAll = findViewById(R.id.buttonDeleteAll);
        deleteAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNumber = 0;
                secondNumber = 0;
                numberOnScreen = "";
                textViewResult.setText("");
                o = Operator.none;
            }
        });
    }

    void setupButtonClear() {
        delete = findViewById(R.id.buttonDelete);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getNumberOnScreen = textViewResult.getText().toString();
                textViewResult.setText(getNumberOnScreen.substring(0, getNumberOnScreen.length() - 1));
                numberOnScreen = textViewResult.getText().toString();
                System.out.println(numberOnScreen);
            }
        });
    }

    void setupButtonDotClick() {
        dot = findViewById(R.id.buttonDot);
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberOnScreen = numberOnScreen + dot.getText().toString();
                textViewResult.setText(numberOnScreen);
            }
        });
    }
}