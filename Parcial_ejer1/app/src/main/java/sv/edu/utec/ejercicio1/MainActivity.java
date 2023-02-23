package sv.edu.utec.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

     Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnlogin=findViewById(R.id.button );
        btnlogin .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento=new Intent(getApplicationContext(),PantallaMsj.class);
                startActivity(intento);
            }
            public void pantalla(View v){
                Intent intento=new Intent(this,MainActivity.class);
                startActivity(intento);

            }

            public void salir(View V){
                finish();
            }

    }
}