package com.example.mypc.sessionseven71;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* Q1: What is the use of SQLite open helper class in SQLite?
        Ans: The android.database.sqlite.SQLiteOpenHelper class is used for database creation and version management.

                Q2: What is the use of OnUpgrade function in SQLiteOpenHelper class?
        Ans:  onUpgrade is basically for handling new db changes(could be new columns addition,table addition) for any new version of your app.

                Q3: How to show SQLite database table information in Android application what is the best way to do it?
                Ans:  A: Use listview with cursor adapter.
                B: Use grid view with cursor adapter
        C: Use table layout with cursor adapter.
        D: Use table layout with cursor

        SeventhSessionStudentRecord7.4*/

    }
}
