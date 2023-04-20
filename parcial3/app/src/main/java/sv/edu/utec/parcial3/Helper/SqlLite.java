package sv.edu.utec.parcial3.Helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SqlLite extends SQLiteOpenHelper {

        public SqlLite(@Nullable Context context, @Nullable String name,
                       @Nullable SQLiteDatabase.CursorFactory factory, int version)
        {
            super(context, name, factory, version);
        }

        @Override
        public void onCreate(SQLiteDatabase Parcial) {
            Parcial.execSQL("CREATE TABLE contactos (codContactos int primary key, " +
                    "Nombre text, Apellidos text, Telefono text, Email text )");
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        }
    }
}
