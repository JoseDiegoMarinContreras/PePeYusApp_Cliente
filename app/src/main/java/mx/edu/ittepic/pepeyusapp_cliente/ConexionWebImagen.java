package mx.edu.ittepic.pepeyusapp_cliente;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.AsyncTask;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by agustin on 1/04/18.
 */

public class ConexionWebImagen extends AsyncTask<URL, String, Bitmap> {

    MainActivity puntero;

    public ConexionWebImagen(MainActivity puntero){
        this.puntero = puntero;
    }

    @Override
    protected Bitmap doInBackground(URL... urls) {
        HttpURLConnection conexion = null;
        Bitmap imagen;
        try {
            publishProgress("Conectando");
            conexion = (HttpURLConnection) urls[0].openConnection();
            conexion.setDoInput(true);
            conexion.setRequestMethod("POST");
            conexion.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conexion.connect();
            if (conexion.getResponseCode() == 200) {
                imagen = BitmapFactory.decodeStream(conexion.getInputStream());
                if(imagen==null){
                }
                return imagen;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (conexion != null){
                conexion.disconnect();
            }
        }
        return null;
    }
    @Override
    protected void onProgressUpdate(String... msjs){
        //puntero.cambiarMensaje(msjs[0]);
    }
    @Override
    protected void onPostExecute(Bitmap image) {
        puntero.procesarImagen(image);
    }
}