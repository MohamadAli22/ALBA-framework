package com.yourdomain.appname.dbClasses;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.ToOne;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.NotNull;

/**
 * Created by Alba.
 */
@Entity
public class Location {
    @Id
    private long id;
    private String title;
    private String link;
    private String phoneNumber;
    private String address;
    private double latitude;
    private double longitude;
    private String note;
    private long subCatId;
    @ToOne(joinProperty = "subCatId")
    private LocationSubCategory locationSubCategory;
    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;
    /** Used for active entity operations. */
    @Generated(hash = 842527347)
    private transient LocationDao myDao;
    @Generated(hash = 630585477)
    public Location(long id, String title, String link, String phoneNumber, String address,
            double latitude, double longitude, String note, long subCatId) {
        this.id = id;
        this.title = title;
        this.link = link;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.note = note;
        this.subCatId = subCatId;
    }
    @Generated(hash = 375979639)
    public Location() {
    }
    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public double getLatitude() {
        return this.latitude;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public double getLongitude() {
        return this.longitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    public String getNote() {
        return this.note;
    }
    public void setNote(String note) {
        this.note = note;
    }
    @Generated(hash = 224091671)
    private transient Long locationSubCategory__resolvedKey;
    /** To-one relationship, resolved on first access. */
    @Generated(hash = 319771257)
    public LocationSubCategory getLocationSubCategory() {
        long __key = this.subCatId;
        if (locationSubCategory__resolvedKey == null
                || !locationSubCategory__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            LocationSubCategoryDao targetDao = daoSession.getLocationSubCategoryDao();
            LocationSubCategory locationSubCategoryNew = targetDao.load(__key);
            synchronized (this) {
                locationSubCategory = locationSubCategoryNew;
                locationSubCategory__resolvedKey = __key;
            }
        }
        return locationSubCategory;
    }
    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1485769628)
    public void setLocationSubCategory(@NotNull LocationSubCategory locationSubCategory) {
        if (locationSubCategory == null) {
            throw new DaoException(
                    "To-one property 'subCatId' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.locationSubCategory = locationSubCategory;
            subCatId = locationSubCategory.getId();
            locationSubCategory__resolvedKey = subCatId;
        }
    }
    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 128553479)
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }
    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 1942392019)
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }
    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 713229351)
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }
    public String getLink() {
        return this.link;
    }
    public void setLink(String link) {
        this.link = link;
    }
    public long getSubCatId() {
        return this.subCatId;
    }
    public void setSubCatId(long subCatId) {
        this.subCatId = subCatId;
    }
    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1046799944)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getLocationDao() : null;
    }

}
