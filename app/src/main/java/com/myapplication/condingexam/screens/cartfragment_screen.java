package com.myapplication.condingexam.screens;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.navigation.NavigationView;
import com.myapplication.condingexam.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link cartfragment_screen#newInstance} factory method to
 * create an instance of this fragment.
 */
public class cartfragment_screen extends Fragment {

    Button c_continue;
    CoordinatorLayout frame1;
    ImageView cart_cart;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public cartfragment_screen() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment cartfragment_screen.
     */
    // TODO: Rename and change types and number of parameters
    public static cartfragment_screen newInstance(String param1, String param2) {
        cartfragment_screen fragment = new cartfragment_screen();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cartscreen, container, false);
        cart_cart = view.findViewById(R.id.cart_cart);

        c_continue = view.findViewById(R.id.c_continue);
        frame1 = view.findViewById(R.id.frame1);

        cart_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomSheetDialog bs = new BottomSheetDialog(getContext());
                bs.setContentView(R.layout.bottom_sheet_cart);

                Button ca_continue = bs.findViewById(R.id.ca_continue);

                ca_continue.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        bs.dismiss();
                    }
                });

                bs.show();
            }
        });
        return view;
    }
}