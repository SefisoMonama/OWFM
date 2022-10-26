package za.co.owfm.DAO;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import za.co.owfm.Entities.WorkOrder;

import java.util.List;

@Dao
public interface WorkOrderDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(WorkOrder workOrder);

    @Query("SELECT * FROM workorder ORDER BY summary ASC")
    LiveData<List<WorkOrder>> getWorkOrders();
}
