package za.co.owfm.DAO;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import za.co.owfm.Entities.GeoConnection;

import java.util.List;

@Dao
public interface GeoConnectionDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(GeoConnection geoConnection);

    @Query("SELECT * FROM geo_connection")
    LiveData<List<GeoConnection>> getGeoConnections();
}
