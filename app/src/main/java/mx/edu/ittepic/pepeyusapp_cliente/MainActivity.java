package mx.edu.ittepic.pepeyusapp_cliente;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    static boolean flag1;
    static boolean flags[];
    static List<List<String>> idsProductos, idsProductos1;
    static String indicador;
    String bebidas[]={"Bebidas éxoticas", "Hidratantes", "Más bebidas", "Para refrescar", "Preparados", "Raspados"};
    String fastFood[]= {"Baguettes", "Hamburguesas", "Sandwiches", "Tortas"};
    String malteadas[]= {"Malteadas", "Malteadas de nieve", "Malteadas exóticas"};
    static List<String> algoEspecial, baguettes, bebidasExoticas, escamochas;
    static List<String> hamburguesas, hidratantes, maltadas, malteadasDeNieve;
    static List<String> malteadasExoticas, masBebidas, paraEmpezar, paraRefrescar;
    static List<String> postres, preparados, raspados, sandwiches;
    static List<String> sinCulpas, tortas;
    TabLayout tabLayout;
    ViewPager viewPager;
    ProgressDialog dialog;
    ConexionWeb conexion, conexion1;
    ArrayAdapter<String> arrayAdapter;
    NavigationView navigationView;
    Menu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabLayout= findViewById(R.id.tabLayout);
        viewPager= findViewById(R.id.viewPager);

        navigationView= findViewById(R.id.nav_view);

        menu= navigationView.getMenu();

        flag1= false;

        conexion= new ConexionWeb(this);
        conexion1= new ConexionWeb(this);

        algoEspecial= new ArrayList<>();
        baguettes= new ArrayList<>();
        bebidasExoticas= new ArrayList<>();
        escamochas= new ArrayList<>();
        hamburguesas= new ArrayList<>();
        hidratantes= new ArrayList<>();
        maltadas= new ArrayList<>();
        malteadasDeNieve= new ArrayList<>();
        malteadasExoticas= new ArrayList<>();
        masBebidas= new ArrayList<>();
        paraEmpezar= new ArrayList<>();
        paraRefrescar= new ArrayList<>();
        postres= new ArrayList<>();
        preparados= new ArrayList<>();
        raspados= new ArrayList<>();
        sandwiches= new ArrayList<>();
        sinCulpas= new ArrayList<>();
        tortas= new ArrayList<>();

        try {
            URL url= new URL("https://thecaveoflittlereik.000webhostapp.com/Pepe_Yus_App/Phps/obtenerTipProds.php");
            dialog = ProgressDialog.show(this, "Atención", "Conectando con el servidor");
            conexion1.execute(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setItemIconTintList(null);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (id == R.id.algo_especial) {
            indicador= "algoEspecial";
            tabLayout.removeAllTabs();
            getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, new Fragment1()).commit();
        } else if (id == R.id.bebidas) {
            indicador= "bebidas";
            tabLayout.removeAllTabs();
            for (int i= 0;i<bebidas.length;i++) {
                tabLayout.addTab(tabLayout.newTab().setText(bebidas[i]));
            }
            ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
            viewPager.setAdapter(adapter);
        } else if (id == R.id.escamochas) {
            indicador= "escamochas";
            tabLayout.removeAllTabs();
            getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, new Fragment1()).commit();
        } else if (id == R.id.fast_food) {
            indicador= "fastFood";
            tabLayout.removeAllTabs();
            for (int i= 0;i<fastFood.length;i++) {
                tabLayout.addTab(tabLayout.newTab().setText(fastFood[i]));
            }
            ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
            viewPager.setAdapter(adapter);
        } else if (id == R.id.malteadas) {
            indicador= "malteadas";
            tabLayout.removeAllTabs();
            for (int i= 0;i<malteadas.length;i++) {
                tabLayout.addTab(tabLayout.newTab().setText(malteadas[i]));
            }
            ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
            viewPager.setAdapter(adapter);
        } else if (id == R.id.para_empezar) {
            indicador= "postres";
            tabLayout.removeAllTabs();
            getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, new Fragment1()).commit();
        } else if (id == R.id.postres) {
            indicador= "postres";
            tabLayout.removeAllTabs();
            getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, new Fragment1()).commit();
        } else if (id == R.id.sin_culpas) {
            indicador= "sinCulpas";
            tabLayout.removeAllTabs();
            getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, new Fragment1()).commit();
        }
        drawer.closeDrawer(GravityCompat.START);

        for(int i= 0;i<idsProductos.size();i++){
            if(item.getTitle().equals(idsProductos.get(i).get(1))){
                indicador= idsProductos.get(i).get(1);
                tabLayout.removeAllTabs();
                getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, new Fragment1()).commit();
            }
        }

        return true;
    }

    public void cambiarMensaje(String mensaje){
        dialog.setMessage(mensaje);
    }

    public void procesarRespuesta(ArrayList<String[]> respuesta){
        dialog.dismiss();
        if(flag1){
            int tipo;
            for(int i= 0;i<respuesta.size();i++){
                tipo= Integer.parseInt(respuesta.get(i)[1]);
                switch(tipo){
                    case 1:
                        algoEspecial.add(respuesta.get(i)[2]);
                        break;
                    case 2:
                        baguettes.add(respuesta.get(i)[2]);
                        break;
                    case 3:
                        bebidasExoticas.add(respuesta.get(i)[2]);
                        break;
                    case 4:
                        escamochas.add(respuesta.get(i)[2]);
                        break;
                    case 5:
                        hamburguesas.add(respuesta.get(i)[2]);
                        break;
                    case 6:
                        hidratantes.add(respuesta.get(i)[2]);
                        break;
                    case 7:
                        maltadas.add(respuesta.get(i)[2]);
                        break;
                    case 8:
                        malteadasDeNieve.add(respuesta.get(i)[2]);
                        break;
                    case 9:
                        malteadasExoticas.add(respuesta.get(i)[2]);
                        break;
                    case 10:
                        masBebidas.add(respuesta.get(i)[2]);
                        break;
                    case 11:
                        paraEmpezar.add(respuesta.get(i)[2]);
                        break;
                    case 12:
                        paraRefrescar.add(respuesta.get(i)[2]);
                        break;
                    case 13:
                        postres.add(respuesta.get(i)[2]);
                        break;
                    case 14:
                        preparados.add(respuesta.get(i)[2]);
                        break;
                    case 15:
                        raspados.add(respuesta.get(i)[2]);
                        break;
                    case 16:
                        sandwiches.add(respuesta.get(i)[2]);
                        break;
                    case 17:
                        sinCulpas.add(respuesta.get(i)[2]);
                        break;
                    case 18:
                        tortas.add(respuesta.get(i)[2]);
                        break;
                }
                for(int j=0;j<idsProductos.size();j++){
                    if(tipo==Integer.parseInt(idsProductos.get(j).get(0))){
                        idsProductos.get(j).add(respuesta.get(i)[2]);
                        idsProductos1.get(j).add(respuesta.get(i)[2]);
                    }
                }
            }
            flags= new boolean[MainActivity.idsProductos1.size()];
            for(int i= 0;i<flags.length;i++){
                flags[i]= false;
            }
        }else{
            idsProductos= new ArrayList<>();
            idsProductos1= new ArrayList<>();
            int n= respuesta.size()-18;
            for(int i= respuesta.size()-n;i<respuesta.size();i++){
                menu.add(R.id.tipoProducto, Integer.parseInt(respuesta.get(i)[0]), Menu.NONE, respuesta.get(i)[1]);
                List<String> list= new ArrayList<>();
                list.add(respuesta.get(i)[0]);
                list.add(respuesta.get(i)[1]);

                List<String> list1= new ArrayList<>();
                list1.add(respuesta.get(i)[0]);
                list1.add(respuesta.get(i)[1]);
                idsProductos.add(list);
                idsProductos1.add(list1);
            }
            try {
                URL url= new URL("https://thecaveoflittlereik.000webhostapp.com/Pepe_Yus_App/Phps/obtenerProds.php");
                dialog = ProgressDialog.show(this, "Atención", "Conectando con el servidor");
                conexion.execute(url);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            flag1= true;
        }
    }
}
