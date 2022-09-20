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
public class Worker extends Employee{
    
    private int hoursWorked;
    private double hourlyRate;
    private double pay;
    
    public Worker(int employeeNumber) {
        super(employeeNumber);
    }
    
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    public int getHoursWorked() {
        return this.hoursWorked;
    }
    
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    
    public double getHourlyRate() {
        return this.hourlyRate;
    }
    
    public double calculatePay(){
        this.pay = hourlyRate* Double.valueOf(hoursWorked);
        return this.pay;
    }
}
