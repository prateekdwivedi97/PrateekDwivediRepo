package com.capg.bean;
import java.util.List;
public class EmployList extends Employ {
List<Employ> empList;

public List<Employ> getEmpList() {
	return empList;
}

public void setEmpList(List<Employ> empList) {
	this.empList = empList;
}

@Override
public String toString() {
	return "EmployList [empList=" + empList + "]";
}

}
