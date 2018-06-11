package mx.edu.ittepic.pepeyusapp_cliente;


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

        productos.setAdapter(null);
        switch(MainActivity.indicador){
            case "algoEspecial":
                array= new String[MainActivity.algoEspecial.size()];
                adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MainActivity.algoEspecial.toArray(array));
                productos.setAdapter(adapter);
                break;
            case "baguettes":
                array= new String[MainActivity.baguettes.size()];
                adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MainActivity.baguettes.toArray(array));
                productos.setAdapter(adapter);
                break;
            case "escamochas":
                array= new String[MainActivity.escamochas.size()];
                adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MainActivity.escamochas.toArray(array));
                productos.setAdapter(adapter);
                break;
            case "postres":
                array= new String[MainActivity.postres.size()];
                adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MainActivity.postres.toArray(array));
                productos.setAdapter(adapter);
                break;
            case "sinCulpas":
                array= new String[MainActivity.sinCulpas.size()];
                adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MainActivity.sinCulpas.toArray(array));
                productos.setAdapter(adapter);
                break;
        }
        if(ViewPagerAdapter.indicador!=null){
            productos.setAdapter(null);
            switch(ViewPagerAdapter.indicador){
                case "bebidasExoticas":
                    array= new String[MainActivity.bebidasExoticas.size()];
                    adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MainActivity.bebidasExoticas.toArray(array));
                    productos.setAdapter(adapter);
                    break;
                case "hidratantes":
                    array= new String[MainActivity.hidratantes.size()];
                    adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MainActivity.hidratantes.toArray(array));
                    productos.setAdapter(adapter);
                    break;
            case "masBebidas":
                array= new String[MainActivity.masBebidas.size()];
                adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MainActivity.masBebidas.toArray(array));
                productos.setAdapter(adapter);
                break;
            case "paraRefrescar":
                array= new String[MainActivity.paraRefrescar.size()];
                adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MainActivity.paraRefrescar.toArray(array));
                productos.setAdapter(adapter);
                break;
            case "preparados":
                array= new String[MainActivity.preparados.size()];
                adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MainActivity.preparados.toArray(array));
                productos.setAdapter(adapter);
                break;
            case "raspados":
                array= new String[MainActivity.raspados.size()];
                adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MainActivity.raspados.toArray(array));
                productos.setAdapter(adapter);
                break;
            case "baguettes":
                array= new String[MainActivity.baguettes.size()];
                adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MainActivity.baguettes.toArray(array));
                productos.setAdapter(adapter);
                break;
            case "hamburguesas":
                array= new String[MainActivity.hamburguesas.size()];
                adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MainActivity.hamburguesas.toArray(array));
                productos.setAdapter(adapter);
                break;
            case "sandwiches":
                array= new String[MainActivity.sandwiches.size()];
                adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MainActivity.sandwiches.toArray(array));
                productos.setAdapter(adapter);
                break;
            case "tortas":
                array= new String[MainActivity.tortas.size()];
                adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MainActivity.tortas.toArray(array));
                productos.setAdapter(adapter);
                break;
            case "malteadas":
                array= new String[MainActivity.maltadas.size()];
                adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MainActivity.maltadas.toArray(array));
                productos.setAdapter(adapter);
                break;
            case "malteadasDeNieve":
                array= new String[MainActivity.malteadasDeNieve.size()];
                adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MainActivity.malteadasDeNieve.toArray(array));
                productos.setAdapter(adapter);
                break;
            case "malteadasExoticas":
                array= new String[MainActivity.malteadasExoticas.size()];
                adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MainActivity.malteadasExoticas.toArray(array));
                productos.setAdapter(adapter);
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
                adapter= new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, MainActivity.idsProductos1.get(i).toArray(array));
                productos.setAdapter(adapter);
            }
        }
        return view;
    }

}
