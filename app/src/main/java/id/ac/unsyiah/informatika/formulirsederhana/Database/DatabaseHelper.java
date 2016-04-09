package id.ac.unsyiah.informatika.formulirsederhana.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static id.ac.unsyiah.informatika.formulirsederhana.Database.Konstanta.KonstantaDatabase.DATABASE_NAME;
import static id.ac.unsyiah.informatika.formulirsederhana.Database.Konstanta.KonstantaDatabase.DATABASE_VERSION;
import static id.ac.unsyiah.informatika.formulirsederhana.Database.Konstanta.KonstantaDatabase.KOLOM_ALAMAT;
import static id.ac.unsyiah.informatika.formulirsederhana.Database.Konstanta.KonstantaDatabase.KOLOM_HP;
import static id.ac.unsyiah.informatika.formulirsederhana.Database.Konstanta.KonstantaDatabase.KOLOM_NAMA;
import static id.ac.unsyiah.informatika.formulirsederhana.Database.Konstanta.KonstantaDatabase.KOLOM_NIM;
import static id.ac.unsyiah.informatika.formulirsederhana.Database.Konstanta.KonstantaDatabase.TABLE_NAME;

/**
 * Created by Furqan on 09/04/2016.
 */
public class DatabaseHelper extends SQLiteOpenHelper{

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE " + TABLE_NAME + " (" + KOLOM_NIM + " TEXT PRIMARY KEY, " + KOLOM_NAMA + " TEXT, " + KOLOM_ALAMAT + " TEXT, " + KOLOM_HP + " TEXT)";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
