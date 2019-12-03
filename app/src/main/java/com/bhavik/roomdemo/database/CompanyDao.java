package com.bhavik.roomdemo.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.bhavik.roomdemo.model.Company;

import java.util.List;

@Dao
public interface CompanyDao {

    @Query("SELECT * FROM COMPANY  ORDER BY ID")
    List<Company> loadAllCompany();

    @Insert
    long insertCompany(Company company);

    @Update
    void updateCompany(Company company);

    @Delete
    void deleteCompany(Company department);


    @Query("SELECT * FROM company WHERE id = :id")
    Company getCompanyByID(int id);


}
