package com.example.owfm.DAO;

import androidx.room.Insert;
import androidx.room.Query;

import com.example.owfm.Entities.Profile;

import java.util.List;

@androidx.room.Dao
public interface Dao {

    //Select all Data
    @Query("select * from Profile")
    List<Profile> getAllData();

    //Insert data
    @Insert
    void insertAllData(Profile profile);
}
