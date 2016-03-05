package id.ac.unsyiah.informatika.formulirsederhana;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*buat objeknya*/
        final TextView txtNama, txtNim, txtHp, txtAlamat;
        final EditText edtNama, edtNim, edtHp, edtAlamat;
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

        /*
        kasus 1 :
        isi semua field,
        klik tombol,
        masukkan semua isian ke string,
        tampilkan toast data isian,
        edit text jadi kosong
        */

        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = "Nama : " + edtNama.getText() + "\nNim : "
                        + edtNim.getText() + "\nNo. Hp : " + edtHp.getText()
                        + "\nAlamat : " + edtAlamat.getText();

                Toast.makeText(MainActivity.this, data, Toast.LENGTH_LONG).show();

                edtNama.setText("");
                edtNim.setText("");
                edtHp.setText("");
                edtAlamat.setText("");
            }
        });
    }
}
