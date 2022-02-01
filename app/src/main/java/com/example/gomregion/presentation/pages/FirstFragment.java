package com.example.gomregion.presentation.pages;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gomregion.R;
import com.example.gomregion.domain.utilities.Links;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FirstFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FirstFragment extends Fragment {

    CardView item_01, item_02, item_03, item_04, item_05, item_06, item_07, item_08, item_09,
            item_10, item_11, item_12, item_13, item_14;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FirstFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FirstFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FirstFragment newInstance(String param1, String param2) {
        FirstFragment fragment = new FirstFragment();
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
        View inflaterView = inflater.inflate(R.layout.fragment_first, container, false);
        View resultView = setListener(inflaterView);

        return resultView;
    }

    private View setListener(View inflaterView){
        item_01 = inflaterView.findViewById(R.id.item_01);
        item_02 = inflaterView.findViewById(R.id.item_02);
        item_03 = inflaterView.findViewById(R.id.item_03);
        item_04 = inflaterView.findViewById(R.id.item_04);
        item_05 = inflaterView.findViewById(R.id.item_05);
        item_06 = inflaterView.findViewById(R.id.item_06);
        item_07 = inflaterView.findViewById(R.id.item_07);
        item_08 = inflaterView.findViewById(R.id.item_08);
        item_09 = inflaterView.findViewById(R.id.item_09);
        item_10 = inflaterView.findViewById(R.id.item_10);
        item_11 = inflaterView.findViewById(R.id.item_11);
        item_12 = inflaterView.findViewById(R.id.item_12);
        item_13 = inflaterView.findViewById(R.id.item_13);
        item_14 = inflaterView.findViewById(R.id.item_14);

        item_01.setOnClickListener(v ->
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Links.LINK_INST_FIRST))));
        item_02.setOnClickListener(v ->
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Links.LINK_INST_SECOND))));
        item_03.setOnClickListener(v ->
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Links.LINK_INST_THIRD))));
        item_04.setOnClickListener(v ->
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Links.LINK_INST_FOURTH))));
        item_05.setOnClickListener(v ->
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Links.LINK_INST_FIFTH))));
        item_06.setOnClickListener(v ->
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Links.LINK_INST_SIXTH))));
        item_07.setOnClickListener(v ->
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Links.LINK_INST_SEVENTH))));
        item_08.setOnClickListener(v ->
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Links.LINK_INST_EIGHTH))));
        item_09.setOnClickListener(v ->
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Links.LINK_INST_NINTH))));
        item_10.setOnClickListener(v ->
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Links.LINK_INST_TENTH))));
        item_11.setOnClickListener(v ->
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Links.LINK_INST_ELEVENTH))));
        item_12.setOnClickListener(v ->
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Links.LINK_INST_TWELFTH))));
        item_13.setOnClickListener(v ->
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Links.LINK_INST_THIRTEENTH))));
        item_14.setOnClickListener(v ->
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(Links.LINK_INST_FOURTEENTH))));


        return inflaterView;
    }
}