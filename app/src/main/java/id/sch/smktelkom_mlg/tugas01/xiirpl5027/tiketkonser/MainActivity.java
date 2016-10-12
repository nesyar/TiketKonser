package id.sch.smktelkom_mlg.tugas01.xiirpl5027.tiketkonser;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNama;
    EditText etNo;
    EditText etAlamat;
    EditText etEmail;
    Button bBook;
    TextView hasil1;
    TextView hasil2;
    TextView hasil3;
    TextView hasil4;
    TextView hasil5;
    TextView hasil6;
    TextView hasil7;
    Spinner panggilan;
    RadioButton yellow, pink, blue, gold;
    CheckBox one, two;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
