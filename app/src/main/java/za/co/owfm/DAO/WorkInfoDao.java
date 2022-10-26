package za.co.owfm.DAO;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import za.co.owfm.Entities.WorkInfo;

import java.util.List;

@Dao
public interface WorkInfoDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(WorkInfo workInfo);

    @Query("SELECT * FROM work_info")
    LiveData<List<WorkInfo>> getWorkInfo();
}
