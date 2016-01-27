package datebasetools;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by tian on 2016/1/26.
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper{

    /**
     *province表建表语句
     */
    public static final String CREATE_PROVICE = "create table Province("+"id integer primary key autoincrement,"
            +"province_name text,"
            +"province_code text)";
    /**
     *  City 表建表语句
     */
    public static final String CREATE_CITY = "create table City("
            +"id integer primary key autoincrement,"
            +"city_name text,"
            +"city_code text,"
            +"province_id integer)";

    /**
     * county表建表语句
     */
    public static final String  CREATE_COUNTY = "create table County("
            +"id integer primary key autoincrement,"
            +"county_name text,"
            +"county_code text,"
            +"city_id integer)";
    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTY);
        db.execSQL(CREATE_PROVICE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public CoolWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
}

