package pk.codeamers.Saleheen;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Quran extends AppCompatActivity {
    ListView pdfListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran);
        pdfListView = (ListView) findViewById(R.id.surahNames);

//        Display Array in ListView
        String[] pdfFilesNames = {"Holy Quran","Al Fateha"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,pdfFilesNames)
        {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView myText = (TextView) view.findViewById(android.R.id.text1);
                return view;
            }
        };
        pdfListView.setAdapter(adapter);

//        onclick List Item to Its Pdf
        pdfListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String items = pdfListView.getItemAtPosition(position).toString();
                Intent i = new Intent(Quran.this,PdfSurah.class);
                i.putExtra("FileName" , items);
                startActivity(i);
            }
        });
    }
}
