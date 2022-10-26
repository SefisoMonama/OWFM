package za.co.owfm.DAO;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import za.co.owfm.Entities.MenuItem;

import java.util.List;

@Dao
public interface MenuItemDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(MenuItem menuItem);

    @Query("SELECT * FROM menu_item")
    LiveData<List<MenuItem>> getMenuItems();
}
