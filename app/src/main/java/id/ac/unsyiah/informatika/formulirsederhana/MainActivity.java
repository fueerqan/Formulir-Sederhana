package id.ac.unsyiah.informatika.formulirsederhana;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*buat objeknya*/
        TextView txtNama, txtNim, txtHp, txtAlamat;
        EditText edtNama, edtNim, edtHp, edtAlamat;
        Button btnSimpan;

        /*inisialisasi objek nya*/
        txtNama = (TextView) findViewById(R.id.txt_nama);
        txtNim = (TextView) findViewById(R.id.txt_nim);
        txtHp = (TextView) findViewById(R.id.txt_hp);
        txtAlamat = (TextView) findViewById(R.id.txt_alamat);

        edtNama = (EditText) findViewById(R.id.edit_nama);
        edtNim = (EditText) findViewById(R.id.edit_nim);
        edtHp = (EditText) findViewById(R.id.edit_hp);
        edtAlamat = (EditText) findViewById(R.id.edit_alamat);

        btnSimpan = (Button) findViewById(R.id.button);
    }
}
