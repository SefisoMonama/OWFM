package za.co.owfm.DAO;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import za.co.owfm.Entities.Site;

import java.util.List;

@Dao
public interface SiteDao {

    @Insert
    void insert(Site site);

    @Query("SELECT * FROM site")
    LiveData<List<Site>> getSites();
}
