package mx.edu.ittepic.pepeyusapp_cliente;

import android.os.AsyncTask;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class ConexionWeb extends AsyncTask<URL, String, String>{
    List<String[]> variables;
    MainActivity puntero;

    public ConexionWeb(MainActivity p){
        puntero = p;
        variables = new ArrayList<String[]>();
    }

    public void agregarVariable(String nombre, String contenido){
        String[] temporal = {nombre, contenido};
        variables.add(temporal);
    }

    @Override
    protected String doInBackground(URL... urls) {

        //Generar cadena de envío

        String respuesta="";


        //Conexión con el servidor
        HttpURLConnection conexion = null;

        try{
            publishProgress("Intentando conectar");
            conexion = (HttpURLConnection)urls[0].openConnection();
            conexion.setDoInput(true);

            conexion.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");


            if (conexion.getResponseCode() == 200) {
                InputStreamReader input = new InputStreamReader(conexion.getInputStream(), "UTF-8");
                BufferedReader flujoEntrada = new BufferedReader(input);
                String linea = "";
                do{
                    linea = flujoEntrada.readLine();
                    if (linea!=null){
                        respuesta += linea;
                    }
                }while(linea != null);
                flujoEntrada.close();
            }else
                return "ERROR_404_1";

        }catch (UnknownHostException e){
            return "ERROR_404_2";
        }catch (IOException er) {
            //NO se pueden enviar o recibir datos
            return "ERROR_404_1";
        }finally {
            if (conexion != null){
                conexion.disconnect();
            }
        }
        /*
         * 1. Generar la cadena de envío de variables
         * 2. Conectarse al servidor
         * 3. Envía mediante post la cadena de variables ya generada
         * 4. Recibe la respuesta del código php
         * 5. Muestra
         * */
        return respuesta;
    }

    protected void onProgressUpdate(String... r){
        puntero.cambiarMensaje(r[0]);
    }

    protected void onPostExecute(String respuesta){
        if(MainActivity.flag1){
            String[] arrayResp= respuesta.split("<br>");
            ArrayList<String[]> listResp= new ArrayList<>();
            for(int i= 0;i<arrayResp.length;i++){
                listResp.add(arrayResp[i].split(":"));
            }
            puntero.procesarRespuesta(listResp);
        }else{
            String[] arrayResp= respuesta.split("<br>");
            ArrayList<String[]> listResp= new ArrayList<>();
            for(int i= 0;i<arrayResp.length;i++){
                listResp.add(arrayResp[i].split(","));
            }
            puntero.procesarRespuesta(listResp);
        }
    }
}
