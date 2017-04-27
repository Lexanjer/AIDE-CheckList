package ru.example.checklist;

import android.os.*;
import android.support.v7.app.*;

public class ActivityDark extends AppCompatActivity
{
		
		

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppDark);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light);

       
        DataBase dataBase = new DataBase(this);
    }
		
		
		
		
}
