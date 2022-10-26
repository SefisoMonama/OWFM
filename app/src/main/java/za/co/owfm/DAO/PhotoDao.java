package za.co.owfm.DAO;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import za.co.owfm.Entities.Photo;

import java.util.List;

@Dao
public interface PhotoDao {

    @Insert
    void insert(Photo photo);

    @Query("SELECT * FROM photo")
    LiveData<List<Photo>> getPhotos();
}
