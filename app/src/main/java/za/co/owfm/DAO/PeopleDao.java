package za.co.owfm.DAO;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import za.co.owfm.Entities.People;

import java.util.List;

@Dao
public interface PeopleDao {

    @Insert
    void insert(People people);

    @Query("SELECT * FROM people")
    LiveData<List<People>> getPeople();
}
