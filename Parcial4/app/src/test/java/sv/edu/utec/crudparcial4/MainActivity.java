package sv.edu.utec.crudparcial4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drwLayout;
    Toolbar tlTaller;
    NavigationView navView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tlTaller= findViewById(R.id.toolbar);
        drwLayout = findViewById(R.id.drawerLayout);
        navView = findViewById(R.id.navigator);
       ActionBarDrawerToggle toggle= new ActionBarDrawerToggle(this,drwLayout,tlTaller,R.string.open,R.string.close);
       drwLayout.addDrawerListener(toggle);
       toggle.syncState();
       toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white, null));

       navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem item) {
               switch (item.getItemId()){

                   case R.id.Clientes:
                       drwLayout.closeDrawer(GravityCompat.START);
                       Toast.makeText(getApplicationContext(),"Clients",Toast.LENGTH_LONG).show();
                       fragmentsR(new ClientesFragment());
                       break;

                   case R.id.Vehiculo:
                       drwLayout.closeDrawer(GravityCompat.START);
                       Toast.makeText(getApplicationContext(),"Vehicular",Toast.LENGTH_LONG).show();
                       fragmentsR(new vehiculoFragment());

                       break;

                   case R.id.Registro:
                       fragmentsR(new RegistroFragment());
                       drwLayout.closeDrawer(GravityCompat.START);
                       Toast.makeText(getApplicationContext(),"Registry",Toast.LENGTH_LONG).show();
                       break;

                   }


               return true;
           }
       });

    }

    private void fragmentsR(vehiculoFragment vehiculoFragment) {
    }

    private void fragmentsR(RegistroFragment registroFragment) {
    }

    private void fragmentsR(ClientesFragment fragment){

        FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frmLayoutContenedor,fragment);
        fragmentTransaction.commit();
    }

    }
