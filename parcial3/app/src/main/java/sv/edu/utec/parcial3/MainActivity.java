package sv.edu.utec.parcial3;

import static android.widget.Toast.makeText;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import sv.edu.utec.menuopciones.R;
import sv.edu.utec.parcial3.clases.PricipalFragment;
import sv.edu.utec.parcial3.clases.SearchFragment;
import sv.edu.utec.parcial3.clases.Sumar;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView btnNav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNav=findViewById(R.id.btnNav);

        btnNav.setOnNavigationItemSelectedListener((BottomNavigationView.OnNavigationItemSelectedListener) navaListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navaListener= new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment seleccionFrag= null;

            switch (item.getItemId()){
                case R.id.nav_home:
                    seleccionFrag = new PricipalFragment();
                    break;
                case R.id.nav_src:
                    seleccionFrag = new SearchFragment();
                    break;
        }



            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentCont, seleccionFrag).commit();
            return true;

        }



    };
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_configuraciones,menu);
        return true ;

    }

    public boolean onOptionsItemSelected(MenuItem items){

        Intent intent = new Intent(this, Sumar.class);

        switch (items.getItemId()){

            case R.id.home:
                Toast.makeText(this,"Selecciono la opcion 1"+1,Toast.LENGTH_SHORT).show();
                startActivity(intent);

                return true;
            case R.id.contactos:
                makeText(this,"Selecciono la opcion 2"+1,Toast.LENGTH_SHORT).show();
                return true;
            case R.id.busqueda:
                makeText(this,"Selecciono la opcion 3"+1,Toast.LENGTH_SHORT).show();
                return true;



        }

        return super.onOptionsItemSelected(items);
    }
}