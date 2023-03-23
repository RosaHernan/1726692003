package sv.edu.utec.parcial_ejer2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lista;
    List<String>cargo;
    List<String>compania;
    int [] img;

    List<String>contactos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista =findViewById(R.id.lsvcontactos);


        contactos = new ArrayList<String>();
        contactos.add("Alexader Pierrot");
        contactos.add("Carlos Lopez");
        contactos.add("Sara Bonz");
        contactos.add("Liliana Clarence");
        contactos.add("Benito Peralta");
        contactos.add("Juan Jaramillo");
        contactos.add("Christian Steps");
        contactos.add("Alexa Giraldo");
        contactos.add("Linda Murillo");
        contactos.add("Lizeth Astrada");

        cargo = new ArrayList<String>();
        cargo.add("CEO");
        cargo.add("Asistente");
        cargo.add("Directora de Marketing");
        cargo.add("Diseñadora de Producto");
        cargo.add("Diseñadora de Ventas");
        cargo.add("CEO");
        cargo.add("CEO");
        cargo.add("Lead Programmer");
        cargo.add("Directora de Marketing");
        cargo.add("CEO");

        compania  = new ArrayList<String>();
        compania.add("Insure S.O");
        compania.add("Hospital Blue");
        compania.add("Electrical Part ltd");
        compania.add("Creativa App");
        compania.add("Neumaticos Press");
        compania.add("Banco Nacional");
        compania.add("Cooperativa Verde");
        compania.add("Frutisofy");
        compania.add("Seguros Boliver");
        compania.add("Concesionario Motolox");

        int [] pictures ={
                R.drawable.lead_photo_1,
                R.drawable.lead_photo_2,
                R.drawable.lead_photo_3,
                R.drawable.lead_photo_4,
                R.drawable.lead_photo_5,
                R.drawable.lead_photo_6,
                R.drawable.lead_photo_7,
                R.drawable.lead_photo_8,
                R.drawable.lead_photo_9,
                R.drawable.lead_photo_10,
        };

        ArrayAdapter<String> adaptador=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                AdapterView<Adapter> parent;
                parent = null;
                int position;
                Toast.makeText(getApplicationContext(),"Selecciono"+parent.getItemAtPosition(position).toString(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}