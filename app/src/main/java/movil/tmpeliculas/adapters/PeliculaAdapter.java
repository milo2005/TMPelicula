package movil.tmpeliculas.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import movil.tmpeliculas.R;
import movil.tmpeliculas.models.Pelicula;

/**
 * Created by Dario Chamorro on 14/03/2016.
 */
public class PeliculaAdapter extends BaseAdapter{

    Context context;
    List<Pelicula> data;

    public PeliculaAdapter(Context context, List<Pelicula> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if(convertView == null)
            v = View.inflate(context, R.layout.template_pelicula, null);

        Pelicula p = data.get(position);

        TextView titulo = (TextView) v.findViewById(R.id.titulo);
        titulo.setText(p.getNombre());

        TextView duracion = (TextView) v.findViewById(R.id.duracion);
        duracion.setText(p.getDuracion());

        TextView categoria = (TextView) v.findViewById(R.id.categoria);
        categoria.setText(p.getCategoria());



        return v;
    }
}
