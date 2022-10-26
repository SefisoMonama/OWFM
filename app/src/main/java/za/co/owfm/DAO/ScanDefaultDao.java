package za.co.owfm.DAO;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import za.co.owfm.Entities.ScanDefault;

import java.util.List;

@Dao
public interface ScanDefaultDao {

    @Insert
    void insert(ScanDefault scanDefault);

    @Query("SELECT * FROM scan_default")
    LiveData<List<ScanDefault>> getScanDefaults();
}
