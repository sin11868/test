/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package content;

/**
 * Programmer name: Yuvraj Singh
 * Date: 11/06/2022
 * 
 */
public class Employee {
    
    private int employeeNumber;
    private String name;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getEmployeeNumber() {
        return this.employeeNumber;
    }
    
    public Employee(int employeeNumber)
    {
        this.employeeNumber = employeeNumber;
    }
}
