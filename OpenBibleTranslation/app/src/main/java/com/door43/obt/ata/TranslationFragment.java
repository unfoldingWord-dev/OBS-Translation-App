package com.door43.obt.ata;



import android.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 *
 */
public class TranslationFragment extends Fragment {


    private EditText mTranslation;
    private EditText mTranslationNotes;
    private int mPosition;
    private String mKeyword;

    public TranslationFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mPosition = getArguments().getInt("Position");
            mKeyword = getArguments().getString("Section");
        }
        //Todo:  allocate data storage variable here
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_translation, container, false);

        int id = getResources().getIdentifier((mKeyword+Integer.toString(mPosition)), "string", rootView.getContext().getPackageName());


        String value = id == 0 ? "" : (String) getResources().getText(id);
        TextView text = (TextView) rootView.findViewById(R.id.AddSource);
        text.setText(value);

        mTranslation = (EditText)rootView.findViewById(R.id.AddTranslation);
        //todo:  needs to add what happen to the translation text entered
        mTranslation.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        mTranslationNotes = (EditText)rootView.findViewById(R.id.AddNotes);
        //todo:  needs to add what happen to the translation notes text entered
        mTranslationNotes.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        return rootView;
    }


}
