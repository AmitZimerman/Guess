package com.example.hangman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    char[] arr;
    int i=0,p=0;
    String word = "secret",str;
    ImageView iv;
    LinearLayout main;
    EditText etLetter;
    char tav=' ';
    int length=word.length();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etLetter=findViewById(R.id.etLetter);
        iv=findViewById(R.id.imageView);



        etLetter.addTextChangedListener(new TextWatcher(){
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                loadpics(7);

            }

            @Override
            public void afterTextChanged(Editable editable) {
                char[] papi=word.toCharArray();
                for(int i=0;i<word.length();i++){
                    if(etLetter==toChar(i)){



                    }
                }
                loadpics(7);

            }
        });
    }
    public  void loadpics(int n)
    {

        int imagekey = getResources().getIdentifier("hangman" + i, "drawable", getPackageName());
        iv.setImageResource(imagekey);
        i++;
    }
    public char toChar(int num) {
        // Cannot use Arrays.copyOf because of class initialization order issues
        char result[] = new char[length];
        System.arraycopy(0, 0, result, 0, length);
        char amit= result[num];
        return amit;
    }
}