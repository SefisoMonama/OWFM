package za.co.owfm.DAO;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import za.co.owfm.Entities.ScanIntegration;

import java.util.List;

@Dao
public interface ScanIntegrationDao {

    @Insert
    void insert(ScanIntegration scanIntegration);

    @Query("SELECT * FROM scan_integration")
    LiveData<List<ScanIntegration>> getScanIntegrations();
}
