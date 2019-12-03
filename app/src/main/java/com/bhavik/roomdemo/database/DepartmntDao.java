package com.bhavik.roomdemo.database;


import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.bhavik.roomdemo.model.Department;

import java.util.List;

@Dao
public interface DepartmntDao {

    @Query("SELECT * FROM department ORDER BY ID")
    List<Department> loadAllDepartment();

    @Insert
    void insertDepartment(Department department);

    @Update
    void updateDepartment(Department department);

    @Delete
    void deleteDepartment(Department department);


    @Query("SELECT * FROM department WHERE id = :id")
    Department getDepartmentByID(int id);
}
