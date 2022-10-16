package com.hola.recyclerviewcardview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

//clase que relaciona los elementos con la lista
public class UsuarioAdapter extends RecyclerView.Adapter<UsuarioAdapter.ViewHolder>{
    //Lista que va a tener todos los datos que se declararon anteriormente
    private List<Usuarios> mData;
    //Sirve para describir el tipo de layaout, de que archivo proviene
    private LayoutInflater mInflater;
    //de que clase estamos llamando el adaptador
    private Context context;

    public UsuarioAdapter(List<Usuarios> itemList, Context context){
        this.mInflater = LayoutInflater.from(context);
        this.context= context;
        this.mData = itemList;
    }

    //da el tamaño de elementos que hay en la lista
    @Override
    public int getItemCount() { return mData.size(); }

    //Se referencia que el diseño de la celda viene de "elementos"
    @Override
    public UsuarioAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = mInflater.inflate(R.layout.usuario, null);
        return new UsuarioAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final UsuarioAdapter.ViewHolder holder, final int position){
        holder.bindData(mData.get(position));
    }

    //Sirve para hacer un listado nuevo "no lo estamos usando ahora"
    public void setItems(List<Usuarios> items){mData= items;}

    //Se declaran los atributos que se declararon en la clase "Usuarios"
    public class ViewHolder extends  RecyclerView.ViewHolder {
        ImageView iconImage, iconImage2;
        TextView nombre, numero, email;

        ViewHolder(View itemView) {
            super(itemView);
            iconImage = itemView.findViewById(R.id.img1);
            nombre = itemView.findViewById(R.id.txtNombre);
            numero = itemView.findViewById(R.id.txtnumero);
            email = itemView.findViewById(R.id.txtEmail);
            iconImage2 = iconImage.findViewById(R.id.img2);
        }

        //Aqui se dice que cambios van a tener las etiquetas
        void bindData(final Usuarios item) {
            //usamos el metodo colorFilter para cambiar el color del icono
            iconImage.setColorFilter(Color.parseColor(item.getColor()), PorterDuff.Mode.SRC_IN);
            nombre.setText(item.getNombre());
            numero.setText(item.getNumero());
            email.setText(item.getEmail());
        }
    }
}
