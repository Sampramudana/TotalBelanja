package com.pramudana.sam.totalbelanja;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etPencil, etPen, etBooks;
    Button btnCount;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPen = (EditText)findViewById(R.id.etPen);
        etPencil = (EditText)findViewById(R.id.etPencil);
        etBooks = (EditText) findViewById(R.id.etBooks);
        btnCount = (Button)findViewById(R.id.btnCount);
        txtResult = (TextView) findViewById(R.id.txtResult);

        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nPencil = etPencil.getText().toString();
                String nPen = etPen.getText().toString();
                String nBooks = etBooks.getText().toString();

                int aPencil = Integer.parseInt(nPencil);
                int aPen = Integer.parseInt(nPen);
                int aBooks = Integer.parseInt(nBooks);

                int rResult = (aPencil * 2500) + (aPen * 3500) + (aBooks * 7000);

                txtResult.setText("Jadi Hasil Belanjaan = " + rResult);
            }
        });
    }
}
