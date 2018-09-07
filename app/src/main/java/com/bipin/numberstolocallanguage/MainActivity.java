package com.bipin.numberstolocallanguage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import com.bipin.numbertolocallanguage.NumberToWordsConverter;

public class MainActivity extends AppCompatActivity {

    EditText mEditText;
    TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditText = findViewById(R.id.editText);
        mTextView = findViewById(R.id.textView);

        mEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(charSequence!=null && charSequence.length()>0){

                    mTextView.setText(NumberToWordsConverter.convert(Integer.parseInt(charSequence.toString())));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }
}
