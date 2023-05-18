package sv.edu.utec.crudparcial4.datos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;


public class baseHelper extends SQLiteOpenHelper{

    private static final int VERSION_BASEDATOS=1;
    private static final String NOMBRE_BASE="TALLER.db";
    private static final String NOMBRE_TABLACL="t_Clientes";
    private static final String NOMBRE_TABLAVH="t_Vehiculo";
    private static final String NOMBRE_TABLARG="t_Registro";


    public baseHelper(@Nullable Context context) {
        super(context, NOMBRE_BASE, null,VERSION_BASEDATOS );
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE"+NOMBRE_TABLACL+"("+
                "IDCliente INTEGER PRIMARY KEY AUTOINCREMENT," +
                "NOMBRE  TEXT NOT NULL,"+
                "APELLIDO TEXT NOT NULL,"+
                "DIRECCION TEXT NOT NULL,"+
                "CIUDAD TEXT NOT NULL,"+
                ")");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE "+NOMBRE_TABLACL);

    }
}
