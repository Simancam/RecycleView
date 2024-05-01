package com.example.recycleview.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleview.R;
import com.example.recycleview.clases.Perro;
import com.squareup.picasso.Picasso;

import java.util.List;

public class PerroAdaptador extends RecyclerView.Adapter<PerroAdaptador.ViewHolder> {

    private List<Perro> datos;

    public PerroAdaptador(List<Perro> datos){
        this.datos = datos;
    }

    @NonNull
    @Override
    public PerroAdaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_perro, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PerroAdaptador.ViewHolder holder, int position) {
        Perro dato = datos.get(position);
        holder.bind(dato);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView txt_nombre_perro, txt_edad_perro;
        ImageView img_perro;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_nombre_perro = itemView.findViewById(R.id.txt_nombre_perro);
            txt_edad_perro = itemView.findViewById(R.id.txt_edad_perro);
            img_perro = itemView.findViewById(R.id.img_perro);
        }

        public void bind(Perro dato){
            txt_nombre_perro.setText(dato.getNombre());
            txt_edad_perro.setText(dato.getEdad());
            //libreria picasso
            Picasso.get().load(dato.getImagen()).into(img_perro);
        }
    }
}
