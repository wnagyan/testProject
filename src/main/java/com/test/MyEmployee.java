package com.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyEmployee extends Employee{

    private String address;

    public MyEmployee(Employee employee){
        this.setAge(employee.getAge());
        this.setName(employee.getName());
    }

    public String toString(){
        return "age=" + getAge() + ", name=" + getName() + ", address=" + address;
    }
}
