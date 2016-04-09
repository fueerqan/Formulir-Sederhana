package id.ac.unsyiah.informatika.formulirsederhana.Database;

/**
 * Created by Furqan on 09/04/2016.
 */
public interface Konstanta {

    interface KonstantaDatabase{
        final String DATABASE_NAME = "ipcom.db";
        final int DATABASE_VERSION = 1;

        final String TABLE_NAME = "mahasiswa";
        final String KOLOM_NAMA = "nama";
        final String KOLOM_NIM = "nim";
        final String KOLOM_HP = "hp";
        final String KOLOM_ALAMAT = "alamat";
    }
}
