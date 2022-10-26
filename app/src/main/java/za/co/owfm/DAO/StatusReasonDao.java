package za.co.owfm.DAO;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import za.co.owfm.Entities.StatusReason;

import java.util.List;

@Dao
public interface StatusReasonDao {

    @Insert
    void insert(StatusReason statusReason);

    @Query("SELECT * FROM status_reason")
    LiveData<List<StatusReason>> getStatusReasonList();
}
