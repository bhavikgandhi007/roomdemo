package com.bhavik.roomdemo.database;


import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.util.Log;

import com.bhavik.roomdemo.model.Company;
import com.bhavik.roomdemo.model.Department;

@Database(entities = {Company.class, Department.class}, version = 1, exportSchema = false)
public abstract class CompanyDatabase extends RoomDatabase {
    private static final String LOG_TAG = CompanyDatabase.class.getSimpleName();
    private static final Object LOCK = new Object();
    private static final String DATABASE_NAME = "company";
    private static CompanyDatabase sInstance;

    public static CompanyDatabase getInstance(Context context) {
        if (sInstance == null) {
            synchronized (LOCK) {
                Log.d(LOG_TAG, "Creating new database instance");
                sInstance = Room.databaseBuilder(context.getApplicationContext(),
                        CompanyDatabase.class, CompanyDatabase.DATABASE_NAME)
                        .build();
            }
        }
        Log.d(LOG_TAG, "Getting the database instance");
        return sInstance;
    }

    public abstract CompanyDao companyDao();

    public abstract DepartmntDao departmntDao();
}
