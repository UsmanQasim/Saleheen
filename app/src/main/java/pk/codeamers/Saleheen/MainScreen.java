package pk.codeamers.Saleheen;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
        // Quran
        LinearLayout btn = root.findViewById(R.id.btnQuran);
        btn.setOnClickListener(v -> {
            Intent i = new Intent(getActivity(), Quran.class);
            startActivity(i);
        });

        //DuaActivity
        LinearLayout btn2 = root.findViewById(R.id.dua);
        btn2.setOnClickListener( v -> {
            Intent i = new Intent(getActivity(), Dua.class);
            startActivity(i);
        });

        //DuaActivity
        LinearLayout btn3 = root.findViewById(R.id.qiblaDirection);
        btn3.setOnClickListener( v -> {
            Intent i = new Intent(getActivity(), QiblaDirection.class);
            startActivity(i);
        });

        //Google Map
        LinearLayout btn4 = root.findViewById(R.id.gotoMapLayout);
        btn4.setOnClickListener( v -> {
            Intent in = new Intent(getActivity(), NearestMosque.class);
            startActivity(in);
        });

        //SalahTracker
        LinearLayout btn5 = root.findViewById(R.id.salahTracker);
        btn5.setOnClickListener( v -> {
            Intent i = new Intent(getActivity(), SalahTracker.class);
            startActivity(i);
        });

        //TasbeehActivity
        LinearLayout btn6 = root.findViewById(R.id.tasbeeh);
        btn6.setOnClickListener( v -> {
            Intent i = new Intent(getActivity(), Tasbeeh.class);
            startActivity(i);
        });

        return root;
    }

    public void foo(){

    }
}