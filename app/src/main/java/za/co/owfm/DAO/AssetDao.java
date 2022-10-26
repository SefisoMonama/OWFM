package za.co.owfm.DAO;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import za.co.owfm.Entities.Asset;

import java.util.List;

@Dao
public interface AssetDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Asset asset);

    @Query("SELECT * FROM asset ORDER BY ciName ASC")
    LiveData<List<Asset>> getAssets();

}
