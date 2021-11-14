package pk.codeamers.Saleheen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PdfSurah extends AppCompatActivity {
    PDFView open;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_surah);
        open = (PDFView) findViewById(R.id.opener);
        String getItem = getIntent().getStringExtra("FileName");
        if(getItem.equals("Holy Quran")){
            open.fromAsset("HolyQuran.pdf").load();

        }else if(getItem.equals("Al Fateha")){
            open.fromAsset("fatehah.pdf").load();
        }
    }
}