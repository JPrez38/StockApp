package com.preston.data.repo.greendao;

import android.os.Parcel;

import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.JoinProperty;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.ToMany;
import org.greenrobot.greendao.annotation.Unique;

import java.util.List;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table "USER".
 */
@Entity(active = true)
public class User implements android.os.Parcelable {

    @Id
    @NotNull
    @Unique
    @Index
    private String encodedId;
    private String email;
    private String username;
    private String password;

    /** Used to resolve relations */
    @Generated
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated
    private transient UserDao myDao;

    @ToMany(joinProperties = {
        @JoinProperty(name = "encodedId", referencedName = "ticker")
    })
    private List<Stock> stockList;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    @Generated
    public User() {
    }

    public User(String encodedId) {
        this.encodedId = encodedId;
    }

    @Generated
    public User(String encodedId, String email, String username, String password) {
        this.encodedId = encodedId;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getUserDao() : null;
    }

    @NotNull
    public String getEncodedId() {
        return encodedId;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setEncodedId(@NotNull String encodedId) {
        this.encodedId = encodedId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    @Generated
    public List<Stock> getStockList() {
        if (stockList == null) {
            __throwIfDetached();
            StockDao targetDao = daoSession.getStockDao();
            List<Stock> stockListNew = targetDao._queryUser_StockList(encodedId);
            synchronized (this) {
                if(stockList == null) {
                    stockList = stockListNew;
                }
            }
        }
        return stockList;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated
    public synchronized void resetStockList() {
        stockList = null;
    }

    /**
    * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
    * Entity must attached to an entity context.
    */
    @Generated
    public void delete() {
        __throwIfDetached();
        myDao.delete(this);
    }

    /**
    * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
    * Entity must attached to an entity context.
    */
    @Generated
    public void update() {
        __throwIfDetached();
        myDao.update(this);
    }

    /**
    * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
    * Entity must attached to an entity context.
    */
    @Generated
    public void refresh() {
        __throwIfDetached();
        myDao.refresh(this);
    }

    @Generated
    private void __throwIfDetached() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
    }

    // KEEP METHODS - put your custom methods here

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.encodedId);
        dest.writeString(this.email);
        dest.writeString(this.username);
        dest.writeString(this.password);
        dest.writeTypedList(this.stockList);
    }

    protected User(Parcel in) {
        this.encodedId = in.readString();
        this.email = in.readString();
        this.username = in.readString();
        this.password = in.readString();
        this.stockList = in.createTypedArrayList(Stock.CREATOR);
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel source) {
            return new User(source);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    // KEEP METHODS END
}
