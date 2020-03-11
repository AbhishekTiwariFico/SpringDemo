package com.model;

import java.util.Date;

public class Department {
    private String departmentName;
    private Date createdOn;
    Department(String departmentName,Date createdOn)
    {
        super();
        this.departmentName = departmentName;
        this.createdOn = createdOn;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", createdOn=" + createdOn +
                '}';
    }
}
