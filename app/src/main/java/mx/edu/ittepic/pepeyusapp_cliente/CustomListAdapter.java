package mx.edu.ittepic.pepeyusapp_cliente;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter<String> {

    private final MainActivity context;
    private final String[] itemname;
    private final Bitmap[] imgid;

    public CustomListAdapter(MainActivity context, String[] itemname, Bitmap[] imgs) {
        super(context, R.layout.custom_list_view, itemname);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.itemname=itemname;
        this.imgid=imgs;
    }

    public View getView(int position,View view,ViewGroup parent) {
        //System.out.println(imgid[0].getHeight());
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.custom_list_view, null,true);

        TextView txtTitle= rowView.findViewById(R.id.item);
        ImageView imageView= rowView.findViewById(R.id.icon);
        TextView extratxt= rowView.findViewById(R.id.textView1);

        txtTitle.setText(itemname[position]);
        imageView.setImageBitmap(imgid[position]);
        extratxt.setText("Description "+itemname[position]);
        return rowView;
    };
}