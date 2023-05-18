package sv.edu.utec.crudparcial4.datos;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

import java.util.ArrayList;

import sv.edu.utec.crudparcial4.ClientesFragment;
import sv.edu.utec.crudparcial4.EntClientes.*;


public class Clientes extends baseHelper{
    Context context;
    public Clientes(Context context) {
        super(context);
    }

    public long insertclientes(String NOMBRE, String APELLIDO, String DIRECCION, String CIUDAD){

        long codigo=0;
        try {

            baseHelper baseHelp = new baseHelper(context);
            SQLiteDatabase bd = baseHelp.getWritableDatabase();

            ContentValues valoresClient = new ContentValues();
            valoresClient.put("NOMBRE", NOMBRE);
            valoresClient.put("APELLIDO", APELLIDO );
            valoresClient.put("DIRECCION", DIRECCION);
            valoresClient.put("CIUDAD", CIUDAD);

            String NOMBRE_TABLACL;
            codigo= bd.insert( NOMBRE_TABLACL, null, valoresClient);
            return codigo;
        }
        catch (Exception ex){
            ex.toString();
            return codigo=0;
        }

    }

    public ArrayList<entVehiculos> mostrarCliente(){
        baseHelper baseHelper = new baseHelper(context);
        SQLiteDatabase bd = baseHelp.getWritableDatabase();
        ArrayList<entVehiculos>listaProvedores=new ArrayList<>();
        entVehiculos entClientes=null;
        Cursor cursorlista;

        cursorlista=bd.rawQuery("SELECT NOMBRE,APELLIDO, DIRECCION, CIUDAD from "+NOMBRE_TABLAVH,null);
        if(cursorlista.moveToFirst())
        {
            do{
                entVehiculos= new entVehiculos();
                entVehiculos.setCODPROV(cursorlista .getInt(0));
                entVehiculos.setNOMPROV(cursorlista.getString(1));
                entVehiculos.setTELPROV(cursorlista.getString(2));
                entVehiculos.setCORPROV(cursorlista.getString(3));
                listaVehiculos.add(entVehiculos);
            }
            while(cursorlista.moveToNext());
        }
        cursorlista.close();
        return listaVehiculos;
    }

}
}

