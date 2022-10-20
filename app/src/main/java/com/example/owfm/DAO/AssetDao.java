package com.example.owfm.DAO;

import androidx.lifecycle.LiveData;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.owfm.Entities.Asset;

import java.util.List;

public interface AssetDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Asset asset);

    @Query("SELECT * FROM asset ORDER BY ciName ASC")
    LiveData<List<Asset>> getAssets();
}
