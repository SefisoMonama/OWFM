package za.co.owfm.DAO;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import za.co.owfm.Entities.Signature;

import java.util.List;

@Dao
public interface SignatureDao {

    @Insert
    void insert(Signature signature);

    @Query("SELECT * FROM signature")
    LiveData<List<Signature>> getSignatures();
}
