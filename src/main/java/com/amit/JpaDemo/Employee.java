package com.amit.JpaDemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
  
  @Id
  private int EmpID;
  private String EmpName;
  private int EmpAge;
  private String EmpDept;
  public int getEmpID() {
    return EmpID;
  }
  public void setEmpID(int empID) {
    EmpID = empID;
  }
  public String getEmpName() {
    return EmpName;
  }
  public void setEmpName(String empName) {
    EmpName = empName;
  }
  public int getEmpAge() {
    return EmpAge;
  }
  public void setEmpAge(int empAge) {
    EmpAge = empAge;
  }
  public String getEmpDept() {
    return EmpDept;
  }
  public void setEmpDept(String empDept) {
    EmpDept = empDept;
  }
  @Override
  public String toString() {
    return "Employee [EmpID=" + EmpID + ", EmpName=" + EmpName + ", EmpAge=" + EmpAge + ", EmpDept="
        + EmpDept + "]";
  }

}
