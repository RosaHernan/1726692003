package sv.edu.utec.parcial_ejer2;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class adaptador extends BaseAdapter  {
    Context contexto;
    Layout layout;
    List<String>contactos;
    List<String>cargo;
    List<String>compania;
    int [] img;

    public adaptador(Context contexto, Layout layout, List<String> contactos, List<String> cargo, List<String> compania, int[] img) {
        this.contexto = contexto;
        this.layout = layout;
        this.contactos = contactos;
        this.cargo = cargo;
        this.compania = compania;
        this.img = img;
    }

    @Override
    public int getCount() {
        return contactos.size() ;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
       View v =convertView;
        LayoutInflater  layoutInflater = LayoutInflater.from(contexto) ;
        v=layoutInflater.inflate(R.layout.elementos,null );

        TextView txtcontactos= v.findViewById(R.id.textView3) ;

        int position = 0;
        txtcontactos.setText(contactos.get(position);

        return null;
    }
}
