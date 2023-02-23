package sv.edu.utec.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 EditText txtnum;
 EditText txtesta1;
 EditText txtesturam;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtnum.findViewById(R.id.edtPeso);
        txtesta1 .findViewById(R.id.edtestatura);
        txtesturam.findViewById(R.id.edtestm );

    }
    public void imc(View v){
         String txt1 = txtnum.getText().toString();
         String txt2 = txtesta1.getText().toString();
         String  txt3 = txtesturam.getText().toString();
        if (txt1 .equals("") || txt2.equals("") || txt3.equals("")) {
            Toast.makeText(getApplicationContext(), "Por favor llene los datos", Toast.LENGTH_LONG).show();
        }else{

            int numero1 = Integer.parseInt(txt1);
            float numero2 = Float.parseFloat(txt2);
            float numero3 = Float.parseFloat(txt3);
            numero3= numero3/100;
            //Proceso de calcular el indice de masa corporal
            float imc=numero2/(float)Math.pow(numero3,2);
            //Convirtiendo el resultado a texto
            String imcTexto = String.format("%.1f", imc);
            if (imc < 10.5)
                Toast.makeText(getApplicationContext(), "Su peso es de: " + numero1 + " y su indice de masa coporal es de: " + imcTexto+" Criticamente Bajo de Peso", Toast.LENGTH_LONG).show();
            if (imc <= 15.9)
                Toast.makeText(getApplicationContext(), "Su peso es de: " + numero1 + " y su indice de masa coporal es de: " + imcTexto+" Severamente Bajo de Peso", Toast.LENGTH_LONG).show();
            if (imc <= 18.5)
                Toast.makeText(getApplicationContext(), "Su peso es de: " + numero1 + " y su indice de masa coporal es de: " + imcTexto+" Bajo de Peso", Toast.LENGTH_LONG).show();
            if (imc <= 25)
                Toast.makeText(getApplicationContext(), "Su peso es de: " + numero1 + " y su indice de masa coporal es de: " + imcTexto+" Normal peso saludable", Toast.LENGTH_LONG).show();
            if (imc <= 30)
                Toast.makeText(getApplicationContext(), "Su peso es de: " + numero1 + " y su indice de masa coporal es de: " + imcTexto+"Sobre Peso ", Toast.LENGTH_LONG).show();
            if (imc <= 35)
                Toast.makeText(getApplicationContext(), "Su peso es de: " + numero1 + " y su indice de masa coporal es de: " + imcTexto+" Obesidad Clase 1", Toast.LENGTH_LONG).show(); // Moderadamente Obeso
            if (imc <= 40)
                Toast.makeText(getApplicationContext(), "Su peso es de: " + numero1 + " y su indice de masa coporal es de: " + imcTexto+" Obesidad Clase 2", Toast.LENGTH_LONG).show(); // Severamente Obeso
            if (imc >= 50)
                Toast.makeText(getApplicationContext(), "Su peso es de: " + numero1 + " y su indice de masa coporal es de: " + imcTexto+" Obesidad Clase 3", Toast.LENGTH_LONG).show(); // Critcamente Obeso
        }
        }
    }


