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
public class LocationCategory {
    @Id
    private long id;
    private String name;
    @ToOne(joinProperty = "id")
    private LocationZone LocationZone;
    private String link;
    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;
    /** Used for active entity operations. */
    @Generated(hash = 171717799)
    private transient LocationCategoryDao myDao;
    @Generated(hash = 1367845931)
    public LocationCategory(long id, String name, String link) {
        this.id = id;
        this.name = name;
        this.link = link;
    }
    @Generated(hash = 587703617)
    public LocationCategory() {
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
    public String getLink() {
        return this.link;
    }
    public void setLink(String link) {
        this.link = link;
    }
    @Generated(hash = 1430542947)
    private transient Long LocationZone__resolvedKey;
    /** To-one relationship, resolved on first access. */
    @Generated(hash = 1912035942)
    public LocationZone getLocationZone() {
        long __key = this.id;
        if (LocationZone__resolvedKey == null
                || !LocationZone__resolvedKey.equals(__key)) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            LocationZoneDao targetDao = daoSession.getLocationZoneDao();
            LocationZone LocationZoneNew = targetDao.load(__key);
            synchronized (this) {
                LocationZone = LocationZoneNew;
                LocationZone__resolvedKey = __key;
            }
        }
        return LocationZone;
    }
    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 477836130)
    public void setLocationZone(@NotNull LocationZone LocationZone) {
        if (LocationZone == null) {
            throw new DaoException(
                    "To-one property 'id' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.LocationZone = LocationZone;
            id = LocationZone.getId();
            LocationZone__resolvedKey = id;
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
    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1858068350)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getLocationCategoryDao() : null;
    }
}
