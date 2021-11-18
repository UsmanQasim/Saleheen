package pk.codeamers.Saleheen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openFrag(View v){
        Fragment fr ;
        if(v == findViewById(R.id.leftButton)) { fr = new MainScreen(); }
        else fr = new CommunityScreen();

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
