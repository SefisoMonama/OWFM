package com.example.owfm.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.owfm.DAO.Dao;
import com.example.owfm.Entities.Profile;

@Database(entities = {Profile.class},version = 1)
public abstract class DatabaseClass extends RoomDatabase {

    public abstract Dao getDao();

    private static DatabaseClass instance;

    DatabaseClass getDatabase(final Context context){
        if(instance!=null){
            synchronized (DatabaseClass.class){
                instance = Room.databaseBuilder(context, DatabaseClass.class, "DATABASE").build();
            }
        }
        return instance;
