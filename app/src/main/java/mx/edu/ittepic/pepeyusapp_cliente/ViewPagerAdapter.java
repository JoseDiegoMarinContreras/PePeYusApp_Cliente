package mx.edu.ittepic.pepeyusapp_cliente;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter{
    int numTabs;
    static String indicador;
    Fragment fragment;

    public ViewPagerAdapter(FragmentManager fm, int numTabs) {
        super(fm);
        this.numTabs= numTabs;
    }

    @Override
    public Fragment getItem(int position){
        System.out.println(position);
        switch(MainActivity.indicador){
            case "bebidas":
                switch (position){
                    case 0:
                        indicador= "bebidasExoticas";
                        fragment = new Fragment1();
                        //notifyDataSetChanged();
                        break;
                    case 1:
                        indicador= "hidratantes";
                        fragment = new Fragment1();
                        //notifyDataSetChanged();
                        break;
                    case 2:
                        indicador= "masBebidas";
                        fragment = new Fragment1();
                        break;
                    case 3:
                        indicador= "paraRefrescar";
                        fragment = new Fragment1();
                        break;
                    case 4:
                        indicador= "preparados";
                        fragment = new Fragment1();
                        break;
                    case 5:
                        indicador= "raspados";
                        fragment = new Fragment1();
                        break;
                }
                break;
            case "fastFood":
                switch (position){
                    case 0:
                        indicador= "baguettes";
                        fragment = new Fragment1();
                        break;
                    case 1:
                        indicador= "hamburguesas";
                        fragment = new Fragment1();
                        break;
                    case 2:
                        indicador= "sandwiches";
                        fragment = new Fragment1();
                        break;
                    case 3:
                        indicador= "tortas";
                        fragment = new Fragment1();
                        break;
                }
                break;
            case "malteadas":
                switch (position){
                    case 0:
                        indicador= "malteadas";
                        fragment = new Fragment1();
                        break;
                    case 1:
                        indicador= "malteadasDeNieve";
                        fragment = new Fragment1();
                        break;
                    case 2:
                        indicador= "malteadasExoticas";
                        fragment = new Fragment1();
                        break;
                }
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return numTabs;
    }
}
