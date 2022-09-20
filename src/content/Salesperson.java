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
public class Salesperson extends Employee{
    private double sales;
    private double rate;
    private double commission;
    
    public Salesperson(int employeeNumber) {
        super(employeeNumber);
    }
    
    public void setSales(double sales) {
        this.sales = sales;
    }
    
    public double getSales() {
        return this.sales;
    }
    
    public void setRate(double rate) {
        this.rate = rate;
    }
    
    public double getRate() {
        return this.rate;
    }
    
    public double calculateCommission()
    {
        if (this.getSales() > 0 && this.getSales() < 100.00)
        {
            this.setRate(5.0);
            this.commission = (this.getSales() * this.getRate()) / 100.0; 
        }
        else if(this.sales > 100 && this.sales < 1000) {
            this.setRate(5.0);
            this.commission = (this.getSales() * this.getRate()) / 100.0;
        }
        else {
            this.setRate(5.0);
            this.commission = (this.getSales() * this.getRate()) / 100.0; 
        }
        return this.commission; 
    }
}
