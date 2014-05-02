package com.door43.obt.ata;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MenuListFragment extends Fragment {
    private ListAdapter mAdapter;

    public MenuListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView=  inflater.inflate(R.layout.menu_list, container, false);

        //get story list

        List<String> story = new ArrayList<String>();
        List<String> imgSource = new ArrayList<String>();



        String header="creation";  //this could later be a parameter passed as intent
        int i=0;
        boolean loop=true;
        while (loop) {

            int id= getResources().getIdentifier(header+Integer.toString(i), "string", rootView.getContext().getPackageName());
            String value= id==0 ?"":(String)getResources().getText(id);

            if (id>0) {
                story.add((value.length() > 40) ? value.substring(0, 40) + "..." : value);

                String imgFileName = header + "img" + Integer.toString(i) + "_thumbnail";
                int imgid = getResources().getIdentifier(imgFileName, "drawable", rootView.getContext().getPackageName());
                imgSource.add((imgid == 0) ? "blank" : imgFileName);
            }

            i++;
            loop= id==0?false:true;
        }



        ListView menuList = (ListView) rootView.findViewById(R.id.menuList);



        String[] items = new String[story.size()];
        story.toArray(items);
        String[] imgs = new String[imgSource.size()];
        imgSource.toArray(imgs);



        menuList.setAdapter(new RowAdapter(rootView.getContext(), items, imgs));


        menuList.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            public void onItemClick(AdapterView<?> parent, View itemClicked, int position, long id) {


                Intent intent = new Intent(getActivity(), TranslationDetailActivity.class);

                intent.putExtra("Section", "creation"); //hard coded for now
                intent.putExtra("Position", position);

                startActivity(intent);


            }
        });



    return rootView;
}
}

