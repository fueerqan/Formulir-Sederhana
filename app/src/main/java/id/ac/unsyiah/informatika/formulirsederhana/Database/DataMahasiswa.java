package id.ac.unsyiah.informatika.formulirsederhana.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

import id.ac.unsyiah.informatika.formulirsederhana.POJO.Mahasiswa;

import static id.ac.unsyiah.informatika.formulirsederhana.Database.Konstanta.KonstantaDatabase.KOLOM_ALAMAT;
import static id.ac.unsyiah.informatika.formulirsederhana.Database.Konstanta.KonstantaDatabase.KOLOM_HP;
import static id.ac.unsyiah.informatika.formulirsederhana.Database.Konstanta.KonstantaDatabase.KOLOM_NAMA;
import static id.ac.unsyiah.informatika.formulirsederhana.Database.Konstanta.KonstantaDatabase.KOLOM_NIM;
import static id.ac.unsyiah.informatika.formulirsederhana.Database.Konstanta.KonstantaDatabase.TABLE_NAME;

/**
 * Created by Furqan on 09/04/2016.
 */
public class DataMahasiswa {

    private SQLiteDatabase db;
    private DatabaseHelper dbHelper;
    private Context context;

    public DataMahasiswa(Context context){
        dbHelper = new DatabaseHelper(context);
        this.context = context;
    }

    public void open() throws SQLiteException{
        db = dbHelper.getWritableDatabase();
    }

    public void close() throws SQLiteException{
        db.close();
    }

    public void tambahMahasiswa(Mahasiswa mhs){
        ContentValues cv = new ContentValues();
        cv.put(KOLOM_NAMA, mhs.getNama());
        cv.put(KOLOM_ALAMAT, mhs.getAlamat());
        cv.put(KOLOM_HP, mhs.getHp());
        cv.put(KOLOM_NIM, mhs.getNim());

        db.insert(TABLE_NAME, null, cv);
    }

}
