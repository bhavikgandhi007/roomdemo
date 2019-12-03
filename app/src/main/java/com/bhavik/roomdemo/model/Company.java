package com.bhavik.roomdemo.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "company",indices = {@Index("id")})
public class Company {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int companyId;

    @ColumnInfo(name = "name")
    private String name;

    public Company(String name) {
        this.name = name;
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
