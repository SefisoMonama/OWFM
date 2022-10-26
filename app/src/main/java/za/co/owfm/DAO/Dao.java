package za.co.owfm.DAO;

import androidx.room.Insert;
import androidx.room.Query;

import za.co.owfm.Entities.Profile;

import java.util.List;

@androidx.room.Dao
public interface Dao {

    //Select all Data
    @Query("select * from Profile")
    List<Profile> getAllData();

    //Insert data
    @Insert
    void insertAllData(Profile profile);

    //Login
    @Query("select * from Profile where username=(:username) and password=(:password)")
    Profile login(String username, String password);

}
