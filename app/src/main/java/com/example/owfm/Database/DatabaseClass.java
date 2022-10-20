package com.example.owfm.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.owfm.DAO.Dao;
import com.example.owfm.Entities.Profile;

@Database(entities = Profile.class, exportSchema = false, version = 1)
public abstract class DatabaseClass extends RoomDatabase {

    private static final String DB_NAME = "owfm";

    private static DatabaseClass instance;

    public static synchronized DatabaseClass getDB(Context context){
        if(instance==null){
            instance = Room.databaseBuilder(context, DatabaseClass.class, DB_NAME)
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }

        return instance;
    }

    public abstract Dao dao();
}