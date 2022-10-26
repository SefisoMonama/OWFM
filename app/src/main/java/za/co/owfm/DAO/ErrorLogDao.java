package za.co.owfm.DAO;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import za.co.owfm.Entities.ErrorLog;

import java.util.List;

@Dao
public interface ErrorLogDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(ErrorLog errorLog);

    @Query("SELECT * FROM error_log")
    LiveData<List<ErrorLog>> getErrorLogs();
}
