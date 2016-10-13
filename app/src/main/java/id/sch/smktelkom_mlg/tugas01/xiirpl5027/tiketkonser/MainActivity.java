package id.sch.smktelkom_mlg.tugas01.xiirpl5027.tiketkonser;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
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

        etNama = (EditText) findViewById(R.id.etNama);
        etNo = (EditText) findViewById(R.id.etNo);
        etAlamat = (EditText) findViewById(R.id.etAlamat);
        etEmail = (EditText) findViewById(R.id.etEmail);
        bBook = (Button) findViewById(R.id.bBook);
        hasil1 = (TextView) findViewById(R.id.hasil1);
        hasil2 = (TextView) findViewById(R.id.hasil2);
        hasil3 = (TextView) findViewById(R.id.hasil3);
        hasil4 = (TextView) findViewById(R.id.hasil4);
        hasil5 = (TextView) findViewById(R.id.hasil5);
        hasil6 = (TextView) findViewById(R.id.hasil6);
        hasil7 = (TextView) findViewById(R.id.hasil7);
        panggilan = (Spinner) findViewById(R.id.panggilan);
        yellow = (RadioButton) findViewById(R.id.yellow);
        pink = (RadioButton) findViewById(R.id.pink);
        blue = (RadioButton) findViewById(R.id.blue);
        gold = (RadioButton) findViewById(R.id.gold);
        one = (CheckBox) findViewById(R.id.one);
        two = (CheckBox) findViewById(R.id.two);


        bBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                doClick4();
                doClick();
                doClick2();
                doClick3();

            }

            private void doClick3() {
                String muncul = "Jumlah Tiket : ";
                int startlen = muncul.length();
                if (one.isChecked()) muncul += one.getText() + "\n";
                if (two.isChecked()) muncul += two.getText() + "\n";
                if (muncul.length() == startlen) muncul += "Tidak ada pilihan";
                hasil7.setText(muncul);

            }
        });

    }

    private void doClick4() {
        if (isValid()) {
            String nama = etNama.getText().toString();
            String alamat = etAlamat.getText().toString();
            String email = etEmail.getText().toString();
            String no = etNo.getText().toString();

            hasil2.setText("Nama Lengkap : " + nama);
            hasil3.setText("Alamat       : " + alamat);
            hasil4.setText("Email        : " + email);
            hasil5.setText("No Identitas : " + no);
        }
    }

    private boolean isValid() {
        boolean valid = true;

        String nama = etNama.getText().toString();
        String email = etEmail.getText().toString();
        String no = etNo.getText().toString();

        if (nama.isEmpty()) {
            etNama.setError("Nama Belum Diisi");
            valid = false;
        } else {
            etNama.setError(null);
        }
        if (email.isEmpty()) {
            etEmail.setError("Email Belum Diisi");
            valid = false;
        } else {
            etEmail.setError(null);
        }
        if (no.isEmpty()) {
            etNo.setError("No Identitas Belum Diisi");
            valid = false;
        } else {
            etEmail.setError(null);
        }
        return valid;
    }

    private void doClick2() {
        String hasil = null;
        if (yellow.isChecked()) {
            hasil = yellow.getText().toString() + " Harga : 800.000 (Standing)";
        } else if (pink.isChecked()) {
            hasil = pink.getText().toString() + " Harga : 1.000.000 (Standing)";
        } else if (blue.isChecked()) {
            hasil = blue.getText().toString() + " Harga : 1.500.000 (Standing)";
        } else if (gold.isChecked()) {
            hasil = gold.getText().toString() + " Harga : 1.500.000 (Limited Seating" +
                    ")";
        }
        if (hasil == null) {
            hasil6.setText("Anda belum memilih jenis tiket!");
        } else {
            hasil6.setText("Jenis Tiket : " + hasil);
        }

    }

    private void doClick() {
        hasil1.setText("Panggilan " + panggilan.getSelectedItem().toString());
    }
    }
