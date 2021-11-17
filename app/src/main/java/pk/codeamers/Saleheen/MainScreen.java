package pk.codeamers.Saleheen;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainScreen extends Fragment {

    public MainScreen() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_main_screen, container, false);

        // Fragment To Activity
        LinearLayout btn = root.findViewById(R.id.btnQuran);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Quran.class);
                startActivity(i);
            }
        });
        return root;
    }


//    Not Working Don't Know Why
//    public void gotoQuran(View v){
//        Intent i = new Intent(getActivity() , Quran.class);
//        startActivity(i);
//    }
}