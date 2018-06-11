package mx.edu.ittepic.pepeyusapp_cliente;


import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {
    ListView productos;

    public Fragment1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_fragment1, container, false);

        productos= view.findViewById(R.id.productos);

        String array[];
        ArrayAdapter<String> adapter;
        CustomListAdapter adapter1;

        productos.setAdapter(null);
        switch(MainActivity.indicador){
            case "algoEspecial":
                array= new String[MainActivity.algoEspecial.size()];
                //adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MainActivity.algoEspecial.toArray(array));
                adapter1= new CustomListAdapter((MainActivity)getContext(), MainActivity.algoEspecial.toArray(array), MainActivity.imagenes);
                productos.setAdapter(adapter1);
                break;
            case "baguettes":
                array= new String[MainActivity.baguettes.size()];
                //adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MainActivity.baguettes.toArray(array));
                adapter1= new CustomListAdapter((MainActivity)getContext(), MainActivity.baguettes.toArray(array), MainActivity.imagenes);
                productos.setAdapter(adapter1);
                break;
            case "escamochas":
                array= new String[MainActivity.escamochas.size()];
                //adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MainActivity.escamochas.toArray(array));
                adapter1= new CustomListAdapter((MainActivity)getContext(), MainActivity.escamochas.toArray(array), MainActivity.imagenes);
                productos.setAdapter(adapter1);
                break;
            case "postres":
                array= new String[MainActivity.postres.size()];
                //adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MainActivity.postres.toArray(array));
                adapter1= new CustomListAdapter((MainActivity)getContext(), MainActivity.postres.toArray(array), MainActivity.imagenes);
                productos.setAdapter(adapter1);
                break;
            case "sinCulpas":
                array= new String[MainActivity.sinCulpas.size()];
                //adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MainActivity.sinCulpas.toArray(array));
                adapter1= new CustomListAdapter((MainActivity)getContext(), MainActivity.sinCulpas.toArray(array), MainActivity.imagenes);
                productos.setAdapter(adapter1);
                break;
        }
        if(ViewPagerAdapter.indicador!=null){
            productos.setAdapter(null);
            switch(ViewPagerAdapter.indicador){
                case "bebidasExoticas":
                    array= new String[MainActivity.bebidasExoticas.size()];
                    //adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MainActivity.bebidasExoticas.toArray(array));
                    adapter1= new CustomListAdapter((MainActivity)getContext(), MainActivity.bebidasExoticas.toArray(array), MainActivity.imagenes);
                    productos.setAdapter(adapter1);
                    break;
                case "hidratantes":
                    array= new String[MainActivity.hidratantes.size()];
                    //adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MainActivity.hidratantes.toArray(array));
                    adapter1= new CustomListAdapter((MainActivity)getContext(), MainActivity.hidratantes.toArray(array), MainActivity.imagenes);
                    productos.setAdapter(adapter1);
                    break;
            case "masBebidas":
                array= new String[MainActivity.masBebidas.size()];
                //adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MainActivity.masBebidas.toArray(array));
                adapter1= new CustomListAdapter((MainActivity)getContext(), MainActivity.masBebidas.toArray(array), MainActivity.imagenes);
                productos.setAdapter(adapter1);
                break;
            case "paraRefrescar":
                array= new String[MainActivity.paraRefrescar.size()];
                //adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MainActivity.paraRefrescar.toArray(array));
                adapter1= new CustomListAdapter((MainActivity)getContext(), MainActivity.paraRefrescar.toArray(array), MainActivity.imagenes);
                productos.setAdapter(adapter1);
                break;
            case "preparados":
                array= new String[MainActivity.preparados.size()];
                //adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MainActivity.preparados.toArray(array));
                adapter1= new CustomListAdapter((MainActivity)getContext(), MainActivity.preparados.toArray(array), MainActivity.imagenes);
                productos.setAdapter(adapter1);
                break;
            case "raspados":
                array= new String[MainActivity.raspados.size()];
                //adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MainActivity.raspados.toArray(array));
                adapter1= new CustomListAdapter((MainActivity)getContext(), MainActivity.raspados.toArray(array), MainActivity.imagenes);
                productos.setAdapter(adapter1);
                break;
            case "baguettes":
                array= new String[MainActivity.baguettes.size()];
                //adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MainActivity.baguettes.toArray(array));
                adapter1= new CustomListAdapter((MainActivity)getContext(), MainActivity.baguettes.toArray(array), MainActivity.imagenes);
                productos.setAdapter(adapter1);
                break;
            case "hamburguesas":
                array= new String[MainActivity.hamburguesas.size()];
                //adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MainActivity.hamburguesas.toArray(array));
                adapter1= new CustomListAdapter((MainActivity)getContext(), MainActivity.hamburguesas.toArray(array), MainActivity.imagenes);
                productos.setAdapter(adapter1);
                break;
            case "sandwiches":
                array= new String[MainActivity.sandwiches.size()];
                //adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MainActivity.sandwiches.toArray(array));
                adapter1= new CustomListAdapter((MainActivity)getContext(), MainActivity.sandwiches.toArray(array), MainActivity.imagenes);
                productos.setAdapter(adapter1);
                break;
            case "tortas":
                array= new String[MainActivity.tortas.size()];
                //adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MainActivity.tortas.toArray(array));
                adapter1= new CustomListAdapter((MainActivity)getContext(), MainActivity.tortas.toArray(array), MainActivity.imagenes);
                productos.setAdapter(adapter1);
                break;
            case "malteadas":
                array= new String[MainActivity.maltadas.size()];
                //adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MainActivity.maltadas.toArray(array));
                adapter1= new CustomListAdapter((MainActivity)getContext(), MainActivity.maltadas.toArray(array), MainActivity.imagenes);
                productos.setAdapter(adapter1);
                break;
            case "malteadasDeNieve":
                array= new String[MainActivity.malteadasDeNieve.size()];
                //adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MainActivity.malteadasDeNieve.toArray(array));
                adapter1= new CustomListAdapter((MainActivity)getContext(), MainActivity.malteadasDeNieve.toArray(array), MainActivity.imagenes);
                productos.setAdapter(adapter1);
                break;
            case "malteadasExoticas":
                array= new String[MainActivity.malteadasExoticas.size()];
                //adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MainActivity.malteadasExoticas.toArray(array));
                adapter1= new CustomListAdapter((MainActivity)getContext(), MainActivity.malteadasExoticas.toArray(array), MainActivity.imagenes);
                productos.setAdapter(adapter1);
                break;
            }
        }
        for(int i= 0;i<MainActivity.idsProductos1.size();i++){
            if(MainActivity.indicador.equals(MainActivity.idsProductos.get(i).get(1))){
                if(!MainActivity.flags[i]){
                    MainActivity.idsProductos1.get(i).remove(0);
                    MainActivity.idsProductos1.get(i).remove(0);
                    MainActivity.flags[i]= true;
                }
                array= new String[MainActivity.idsProductos1.get(i).size()];
                //adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MainActivity.idsProductos1.get(i).toArray(array));
                adapter1= new CustomListAdapter((MainActivity)getContext(), MainActivity.idsProductos1.get(i).toArray(array), MainActivity.imagenes);
                productos.setAdapter(adapter1);
            }
        }
        return view;
    }

}
