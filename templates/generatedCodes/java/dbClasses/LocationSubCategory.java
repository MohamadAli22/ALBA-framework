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
public class LocationSubCategory {
    @Id
    private long id ;
    private String name;
    private long categoryId;
    @ToOne(joinProperty = "categoryId")
    private LocationCategory locationCategory;
    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;
    /** Used for active entity operations. */
    @Generated(hash = 1263954594)
    private transient LocationSubCategoryDao myDao;
    @Generated(hash = 1198528422)
    public LocationSubCategory(long id, String name, long categoryId) {
        this.id = id;
        this.name = name;
        this.categoryId = categoryId;
    }
    @Generated(hash = 1199264182)
    public LocationSubCategory() {
    }
    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Generated(hash = 579443239)
    private transient Long locationCategory__resolvedKey;
    /** To-one relationship, resolved on first access. */
    @Generated(hash = 1423413936)
    public LocationCategory getLocationCategory() {
        long __key = this.categoryId;
        if (locationCategory__resolvedKey == null || !locationCategory__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            LocationCategoryDao targetDao = daoSession.getLocationCategoryDao();
            LocationCategory locationCategoryNew = targetDao.load(__key);
            synchronized (this) {
                locationCategory = locationCategoryNew;
                locationCategory__resolvedKey = __key;
            }
        }
        return locationCategory;
    }
    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1477745498)
    public void setLocationCategory(@NotNull LocationCategory locationCategory) {
        if (locationCategory == null) {
            throw new DaoException(
                    "To-one property 'categoryId' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.locationCategory = locationCategory;
            categoryId = locationCategory.getId();
            locationCategory__resolvedKey = categoryId;
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
    public long getCategoryId() {
        return this.categoryId;
    }
    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }
    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 801549957)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getLocationSubCategoryDao() : null;
    }
}
