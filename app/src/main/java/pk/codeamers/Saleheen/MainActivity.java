package pk.codeamers.Saleheen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    String currentFrag;
    ImageButton btn1 , btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void openFrag(View v) {
        Fragment fr;
        btn1 = (ImageButton) findViewById(R.id.leftButton);
        btn2 = (ImageButton) findViewById(R.id.rightButton);

        if (v == findViewById(R.id.leftButton)) {
            fr = new MainScreen();
            btn1.setBackgroundColor(Color.RED);
            btn2.setBackgroundColor(Color.WHITE);
    }else{
            fr = new CommunityScreen();
            btn1.setBackgroundColor(Color.WHITE);
            btn2.setBackgroundColor(Color.YELLOW);
        }

        FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
        transaction1.replace(R.id.fragments, fr);
        transaction1.addToBackStack(null);
        transaction1.commit();
    }
}


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//         super.onCreateOptionsMenu(menu);
//        MenuInflater menuInflater = getMenuInflater();
//        menuInflater.inflate(R.menu.optionmenu, menu);
//         return  true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//         super.onOptionsItemSelected(item);
//         switch (item.getItemId()){
//             case R.id.home:
//                 Intent i = new Intent(MainActivity.this , QiblaDirection.class);
//                 startActivity(i);
//             case R.id.about:
//                 Intent in = new Intent(MainActivity.this , QiblaDirection.class);
//                 startActivity(in);
//         }
//    return true;
//    }
