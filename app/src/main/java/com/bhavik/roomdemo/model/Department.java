package com.bhavik.roomdemo.model;


import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "department", foreignKeys = @ForeignKey(entity = Company.class,
        parentColumns = "id",
        childColumns = "companyId",
        onDelete = ForeignKey.NO_ACTION))
public class Department {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private int companyId;

    private String name;


    public Department(int companyId, String name) {
        this.companyId = companyId;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
