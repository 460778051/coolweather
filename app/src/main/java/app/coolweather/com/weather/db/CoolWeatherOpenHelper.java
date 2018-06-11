package app.coolweather.com.weather.db;

import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 2018/6/8.
 */

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
public  static final String CREATE_PROVINCE = "create table Province ("
        + "id integer primary key autoincrement,"
        +" province_name text,"
        +"province_ code text)";

public static final String CREATE_CITY ="create table City ("
        + "id integer primary key autoincrement,"
        +" city_name text,"
        +" city_code  text,"
        + "province_ id integer)";
public static final String CREATE_COUNTY = "create table County ("
        + "id integer primary key autoincrement,"
        + "county_ name text,"
        + "county_ code text,"
        + "city_ id integer)";


}