package vn.edu.tdc.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity_cal extends AppCompatActivity {
    EditText edtOperator,edtResult;
    Button btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_add, btn_sub, btn_mul, btn_div, btn_res, btn_clean;
    boolean btnAddState, btnSubState, btnMulState,btnDivState;
    Float num1, num2;
    String str = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_cal);

        edtOperator = (EditText) findViewById( R.id.edtOperator );
        edtResult = (EditText) findViewById( R.id.edtRes );
        btn_0 = (Button) findViewById( R.id.btn_0 );
        btn_1 = (Button) findViewById( R.id.btn_1);
        btn_2 = (Button) findViewById( R.id.btn_2);
        btn_3 = (Button) findViewById( R.id.btn_3);
        btn_4 = (Button) findViewById( R.id.btn_4);
        btn_5 = (Button) findViewById( R.id.btn_5);
        btn_6 = (Button) findViewById( R.id.btn_6);
        btn_7 = (Button) findViewById( R.id.btn_7);
        btn_8 = (Button) findViewById( R.id.btn_8);
        btn_9 = (Button) findViewById( R.id.btn_9);
        btn_add = (Button) findViewById( R.id.btn_add);
        btn_sub = (Button) findViewById( R.id.btn_sub);
        btn_mul = (Button) findViewById( R.id.btn_multiple);
        btn_div = (Button) findViewById( R.id.btn_div);
        btn_res = (Button) findViewById( R.id.btn_res);
        btn_clean = (Button) findViewById( R.id.btn_c);

        btn_0.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtOperator.setText(edtOperator.getText() + "0" );
            }
        } );
        btn_1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtOperator.setText( edtOperator.getText()+"1" );
            }
        } );
        btn_2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtOperator.setText( edtOperator.getText() + "2" );
            }
        } );
        btn_3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtOperator.setText( edtOperator.getText()+"3" );
            }
        } );
        btn_4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtOperator.setText( edtOperator.getText()+"4" );
            }
        } );

        btn_5.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtOperator.setText( edtOperator.getText()+"5" );
            }
        } );
        btn_6.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtOperator.setText( edtOperator.getText()+"6" );
            }
        } );
        btn_7.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtOperator.setText( edtOperator.getText()+"7" );
            }
        } );
        btn_8.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtOperator.setText( edtOperator.getText()+"8" );
            }
        } );
        btn_9.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtOperator.setText( edtOperator.getText()+"9" );
            }
        } );

        btn_add.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtOperator == null)
                {
                    edtOperator.setText("");
                }
                else
                {
                    num1 = Float.parseFloat( edtOperator.getText()+"");
                    btnAddState = true;
                }
                edtOperator.setText(null);
            }
        } );

        btn_sub.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat( edtOperator.getText()+"" );
                btnSubState = true;
                edtOperator.setText( null );
            }
        } );
        btn_mul.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat( edtOperator.getText()+"" );
                btnMulState = true;
                edtOperator.setText( null );
            }
        } );
        btn_div.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat( edtOperator.getText() + "" );
                btnDivState = true;
                edtOperator.setText( null );
            }
        } );
        btn_res.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = Float.parseFloat( edtOperator.getText()+"" );

                if(btnAddState == true)
                {
                    edtResult.setText( num1 + num2 + "" );
                    btnAddState = false;
                }
                if(btnSubState == true)
                {
                    edtResult.setText( num1 - num2 +"" );
                    btnSubState = false;
                }
                if(btnMulState == true)
                {
                    edtResult.setText( num1 * num2 +"" );
                    btnMulState = false;
                }
                if (btnDivState == true)
                {
                    edtResult.setText( num1/num2 + "" );
                    btnDivState = false;
                }
            }
        } );
        btn_clean.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtResult.setText( null );
                edtOperator.setText( null );
            }
        } );
    }
}
