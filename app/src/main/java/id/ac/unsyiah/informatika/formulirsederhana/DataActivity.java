package id.ac.unsyiah.informatika.formulirsederhana;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        TextView txtNama, txtNim, txtHp, txtAlamat;
        txtNama = (TextView) findViewById(R.id.txt_nama_1);
        txtNim = (TextView) findViewById(R.id.txt_nim_1);
        txtHp = (TextView) findViewById(R.id.txt_hp_1);
        txtAlamat = (TextView) findViewById(R.id.txt_alamat_1);

        /*ambil data dari extra*/
        Bundle extras = getIntent().getExtras();

        txtNama.setText(extras.getString("Nama"));
        txtNim.setText(extras.getString("Nim"));
        txtHp.setText(extras.getString("Hp"));
        txtAlamat.setText(extras.getString("Alamat"));
    }
}
