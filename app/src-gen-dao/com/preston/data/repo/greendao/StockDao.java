package com.preston.data.repo.greendao;

import java.util.List;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.query.Query;
import org.greenrobot.greendao.query.QueryBuilder;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "STOCK".
*/
public class StockDao extends AbstractDao<Stock, String> {

    public static final String TABLENAME = "STOCK";

    /**
     * Properties of entity Stock.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Ticker = new Property(0, String.class, "ticker", false, "TICKER");
        public final static Property DailyVolume = new Property(1, Long.class, "dailyVolume", false, "DAILY_VOLUME");
        public final static Property Change = new Property(2, Double.class, "change", false, "CHANGE");
        public final static Property DaysLow = new Property(3, Double.class, "daysLow", false, "DAYS_LOW");
        public final static Property DaysHigh = new Property(4, Double.class, "daysHigh", false, "DAYS_HIGH");
        public final static Property YearsLow = new Property(5, Double.class, "yearsLow", false, "YEARS_LOW");
        public final static Property YearsHigh = new Property(6, Double.class, "yearsHigh", false, "YEARS_HIGH");
        public final static Property MarketCapitalization = new Property(7, String.class, "marketCapitalization", false, "MARKET_CAPITALIZATION");
        public final static Property LastTradePrice = new Property(8, Double.class, "lastTradePrice", false, "LAST_TRADE_PRICE");
        public final static Property DaysRange = new Property(9, String.class, "daysRange", false, "DAYS_RANGE");
        public final static Property Name = new Property(10, String.class, "name", false, "NAME");
        public final static Property Volume = new Property(11, Long.class, "volume", false, "VOLUME");
        public final static Property PricePurchased = new Property(12, Double.class, "PricePurchased", false, "PRICE_PURCHASED");
        public final static Property EncodedId = new Property(13, String.class, "encodedId", true, "ENCODED_ID");
    }

    private Query<Stock> user_StockListQuery;

    public StockDao(DaoConfig config) {
        super(config);
    }
    
    public StockDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"STOCK\" (" + //
                "\"TICKER\" TEXT NOT NULL UNIQUE ," + // 0: ticker
                "\"DAILY_VOLUME\" INTEGER," + // 1: dailyVolume
                "\"CHANGE\" REAL," + // 2: change
                "\"DAYS_LOW\" REAL," + // 3: daysLow
                "\"DAYS_HIGH\" REAL," + // 4: daysHigh
                "\"YEARS_LOW\" REAL," + // 5: yearsLow
                "\"YEARS_HIGH\" REAL," + // 6: yearsHigh
                "\"MARKET_CAPITALIZATION\" TEXT," + // 7: marketCapitalization
                "\"LAST_TRADE_PRICE\" REAL," + // 8: lastTradePrice
                "\"DAYS_RANGE\" TEXT," + // 9: daysRange
                "\"NAME\" TEXT," + // 10: name
                "\"VOLUME\" INTEGER," + // 11: volume
                "\"PRICE_PURCHASED\" REAL," + // 12: PricePurchased
                "\"ENCODED_ID\" TEXT PRIMARY KEY NOT NULL );"); // 13: encodedId
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"STOCK\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Stock entity) {
        stmt.clearBindings();
        stmt.bindString(1, entity.getTicker());
 
        Long dailyVolume = entity.getDailyVolume();
        if (dailyVolume != null) {
            stmt.bindLong(2, dailyVolume);
        }
 
        Double change = entity.getChange();
        if (change != null) {
            stmt.bindDouble(3, change);
        }
 
        Double daysLow = entity.getDaysLow();
        if (daysLow != null) {
            stmt.bindDouble(4, daysLow);
        }
 
        Double daysHigh = entity.getDaysHigh();
        if (daysHigh != null) {
            stmt.bindDouble(5, daysHigh);
        }
 
        Double yearsLow = entity.getYearsLow();
        if (yearsLow != null) {
            stmt.bindDouble(6, yearsLow);
        }
 
        Double yearsHigh = entity.getYearsHigh();
        if (yearsHigh != null) {
            stmt.bindDouble(7, yearsHigh);
        }
 
        String marketCapitalization = entity.getMarketCapitalization();
        if (marketCapitalization != null) {
            stmt.bindString(8, marketCapitalization);
        }
 
        Double lastTradePrice = entity.getLastTradePrice();
        if (lastTradePrice != null) {
            stmt.bindDouble(9, lastTradePrice);
        }
 
        String daysRange = entity.getDaysRange();
        if (daysRange != null) {
            stmt.bindString(10, daysRange);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(11, name);
        }
 
        Long volume = entity.getVolume();
        if (volume != null) {
            stmt.bindLong(12, volume);
        }
 
        Double PricePurchased = entity.getPricePurchased();
        if (PricePurchased != null) {
            stmt.bindDouble(13, PricePurchased);
        }
 
        String encodedId = entity.getEncodedId();
        if (encodedId != null) {
            stmt.bindString(14, encodedId);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Stock entity) {
        stmt.clearBindings();
        stmt.bindString(1, entity.getTicker());
 
        Long dailyVolume = entity.getDailyVolume();
        if (dailyVolume != null) {
            stmt.bindLong(2, dailyVolume);
        }
 
        Double change = entity.getChange();
        if (change != null) {
            stmt.bindDouble(3, change);
        }
 
        Double daysLow = entity.getDaysLow();
        if (daysLow != null) {
            stmt.bindDouble(4, daysLow);
        }
 
        Double daysHigh = entity.getDaysHigh();
        if (daysHigh != null) {
            stmt.bindDouble(5, daysHigh);
        }
 
        Double yearsLow = entity.getYearsLow();
        if (yearsLow != null) {
            stmt.bindDouble(6, yearsLow);
        }
 
        Double yearsHigh = entity.getYearsHigh();
        if (yearsHigh != null) {
            stmt.bindDouble(7, yearsHigh);
        }
 
        String marketCapitalization = entity.getMarketCapitalization();
        if (marketCapitalization != null) {
            stmt.bindString(8, marketCapitalization);
        }
 
        Double lastTradePrice = entity.getLastTradePrice();
        if (lastTradePrice != null) {
            stmt.bindDouble(9, lastTradePrice);
        }
 
        String daysRange = entity.getDaysRange();
        if (daysRange != null) {
            stmt.bindString(10, daysRange);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(11, name);
        }
 
        Long volume = entity.getVolume();
        if (volume != null) {
            stmt.bindLong(12, volume);
        }
 
        Double PricePurchased = entity.getPricePurchased();
        if (PricePurchased != null) {
            stmt.bindDouble(13, PricePurchased);
        }
 
        String encodedId = entity.getEncodedId();
        if (encodedId != null) {
            stmt.bindString(14, encodedId);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13);
    }    

    @Override
    public Stock readEntity(Cursor cursor, int offset) {
        Stock entity = new Stock( //
            cursor.getString(offset + 0), // ticker
            cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1), // dailyVolume
            cursor.isNull(offset + 2) ? null : cursor.getDouble(offset + 2), // change
            cursor.isNull(offset + 3) ? null : cursor.getDouble(offset + 3), // daysLow
            cursor.isNull(offset + 4) ? null : cursor.getDouble(offset + 4), // daysHigh
            cursor.isNull(offset + 5) ? null : cursor.getDouble(offset + 5), // yearsLow
            cursor.isNull(offset + 6) ? null : cursor.getDouble(offset + 6), // yearsHigh
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // marketCapitalization
            cursor.isNull(offset + 8) ? null : cursor.getDouble(offset + 8), // lastTradePrice
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // daysRange
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // name
            cursor.isNull(offset + 11) ? null : cursor.getLong(offset + 11), // volume
            cursor.isNull(offset + 12) ? null : cursor.getDouble(offset + 12), // PricePurchased
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13) // encodedId
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Stock entity, int offset) {
        entity.setTicker(cursor.getString(offset + 0));
        entity.setDailyVolume(cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1));
        entity.setChange(cursor.isNull(offset + 2) ? null : cursor.getDouble(offset + 2));
        entity.setDaysLow(cursor.isNull(offset + 3) ? null : cursor.getDouble(offset + 3));
        entity.setDaysHigh(cursor.isNull(offset + 4) ? null : cursor.getDouble(offset + 4));
        entity.setYearsLow(cursor.isNull(offset + 5) ? null : cursor.getDouble(offset + 5));
        entity.setYearsHigh(cursor.isNull(offset + 6) ? null : cursor.getDouble(offset + 6));
        entity.setMarketCapitalization(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setLastTradePrice(cursor.isNull(offset + 8) ? null : cursor.getDouble(offset + 8));
        entity.setDaysRange(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setName(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setVolume(cursor.isNull(offset + 11) ? null : cursor.getLong(offset + 11));
        entity.setPricePurchased(cursor.isNull(offset + 12) ? null : cursor.getDouble(offset + 12));
        entity.setEncodedId(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
     }
    
    @Override
    protected final String updateKeyAfterInsert(Stock entity, long rowId) {
        return entity.getEncodedId();
    }
    
    @Override
    public String getKey(Stock entity) {
        if(entity != null) {
            return entity.getEncodedId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Stock entity) {
        return entity.getEncodedId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
    /** Internal query to resolve the "stockList" to-many relationship of User. */
    public List<Stock> _queryUser_StockList(String encodedId) {
        synchronized (this) {
            if (user_StockListQuery == null) {
                QueryBuilder<Stock> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.EncodedId.eq(null));
                user_StockListQuery = queryBuilder.build();
            }
        }
        Query<Stock> query = user_StockListQuery.forCurrentThread();
        query.setParameter(0, encodedId);
        return query.list();
    }

}
