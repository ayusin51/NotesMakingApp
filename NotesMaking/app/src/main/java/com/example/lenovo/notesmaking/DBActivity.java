package com.example.lenovo.notesmaking;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.widget.Toast;
import android.content.Context;

import static android.content.Context.MODE_PRIVATE;

public class DBActivity {

    void AddNote(String notes){

        try {
            SQLiteDatabase db = this.openOrCreateDatabase("notesDB", MODE_PRIVATE, null);
            db.execSQL("create table if not exists noteList (text VARCHAR)");


            db.execSQL("insert into list values('" + notes + "')");
            Log.i("notes", "Success");
            Toast.makeText(this, "Notes added successfully", Toast.LENGTH_SHORT).show();


        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
