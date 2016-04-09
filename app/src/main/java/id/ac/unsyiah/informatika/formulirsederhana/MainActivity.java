package id.ac.unsyiah.informatika.formulirsederhana;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import id.ac.unsyiah.informatika.formulirsederhana.Database.DataMahasiswa;
import id.ac.unsyiah.informatika.formulirsederhana.POJO.Mahasiswa;

public class MainActivity extends AppCompatActivity {

    private DataMahasiswa db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new DataMahasiswa(MainActivity.this);

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


        /*btnSimpan.setOnClickListener(new View.OnClickListener() {
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
        });*/


        /*
        kasus 2 :
        isi semua field,
        klik tombol,
        kirim data ke activity lain,
        */

/*        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, DataActivity.class);
                i.putExtra("Nama", edtNama.getText().toString());
                i.putExtra("Nim", edtNim.getText().toString());
                i.putExtra("Hp", edtHp.getText().toString());
                i.putExtra("Alamat", edtAlamat.getText().toString());
                startActivity(i);
            }
        });*/

        /*
            Kasus 3 :
            Data disimpan ke database
         */
        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNama(edtNama.getText().toString());
                mhs.setNim(edtNim.getText().toString());
                mhs.setAlamat(edtAlamat.getText().toString());
                mhs.setHp(edtHp.getText().toString());

                db.open();
                db.tambahMahasiswa(mhs);
                db.close();
                Toast.makeText(MainActivity.this, "Data telah disimpan ke Database", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_utama, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (id){
            case R.id.pindah:
                Toast.makeText(MainActivity.this, "Tombol Pindah di klik", Toast.LENGTH_SHORT).show();
                Intent in = new Intent(getBaseContext(), NavDraw.class);
                startActivity(in);
                break;
            case R.id.exit :
                finish();
                break;
        }

        return true;
    }
}
