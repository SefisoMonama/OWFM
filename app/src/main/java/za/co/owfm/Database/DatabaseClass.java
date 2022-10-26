package za.co.owfm.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import za.co.owfm.DAO.AssetDao;
import za.co.owfm.DAO.ErrorLogDao;
import za.co.owfm.DAO.GeoConnectionDao;
import za.co.owfm.DAO.MenuItemDao;
import za.co.owfm.DAO.PeopleDao;
import za.co.owfm.DAO.PhotoDao;
import za.co.owfm.DAO.ProductDao;
import za.co.owfm.DAO.ScanDefaultDao;
import za.co.owfm.DAO.ScanIntegrationDao;
import za.co.owfm.DAO.SignatureDao;
import za.co.owfm.DAO.SiteDao;
import za.co.owfm.DAO.StatusReasonDao;
import za.co.owfm.DAO.WorkInfoDao;
import za.co.owfm.DAO.WorkOrderDao;
import za.co.owfm.Entities.Asset;
import za.co.owfm.Entities.ErrorLog;
import za.co.owfm.Entities.GeoConnection;
import za.co.owfm.Entities.MenuItem;
import za.co.owfm.Entities.People;
import za.co.owfm.Entities.Photo;
import za.co.owfm.Entities.Product;
import za.co.owfm.Entities.Profile;
import za.co.owfm.DAO.ProfileDao;
import za.co.owfm.Entities.ScanDefault;
import za.co.owfm.Entities.ScanIntegration;
import za.co.owfm.Entities.Signature;
import za.co.owfm.Entities.Site;
import za.co.owfm.Entities.StatusReason;
import za.co.owfm.Entities.WorkInfo;
import za.co.owfm.Entities.WorkOrder;

@Database(exportSchema = false, version = 8, entities = {Profile.class, Asset.class, WorkOrder.class,
        WorkInfo.class, ErrorLog.class, GeoConnection.class, MenuItem.class, People.class,
        Photo.class, Product.class, ScanDefault.class, ScanIntegration.class, Signature.class,
        Site.class, StatusReason.class})
public abstract class DatabaseClass extends RoomDatabase {

    private static final String DB_NAME = "owfm";

    private static DatabaseClass instance;

    public static synchronized DatabaseClass getDB(Context context){
        if(instance==null){
            instance = Room.databaseBuilder(context, DatabaseClass.class, DB_NAME)
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }

        return instance;
    }

    public abstract ProfileDao profileDao();


    public abstract AssetDao assetDao();
    public abstract WorkOrderDao workOrderDao();
    public abstract WorkInfoDao workInfoDao();
    public abstract ErrorLogDao errorLogDao();
    public abstract GeoConnectionDao geoConnectionDao();
    public abstract MenuItemDao menuItemDao();
    public abstract PeopleDao peopleDao();
    public abstract PhotoDao photoDao();
    public abstract ProductDao productDao();
    public abstract ScanDefaultDao scanDefaultDao();
    public abstract ScanIntegrationDao scanIntegrationDao();
    public abstract SignatureDao signatureDao();
    public abstract SiteDao siteDao();
    public abstract StatusReasonDao statusReasonDao();
}