/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salestracker;

import content.Salesperson;
import content.Worker;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Programmer name: Yuvraj Singh
 * Date: 11/06/2022
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter an employee number");
        int empNum = scanner.nextInt();
        
        System.out.println("Enter your choice: ");
        System.out.println("1. Sales Person ");
        System.out.println("2. Worker ");
        System.out.println("3. Exit");
        int userChoice = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Enter employee name: ");
        String empName = scanner.nextLine();
        
        
        ArrayList <Salesperson> SalespersonList = new ArrayList();
        ArrayList <Worker> WorkerList = new ArrayList();
       
        boolean flag = true;
        
        while(flag) {
            if(userChoice == 1) {
                 System.out.println("Please enter an salesperson amount: ");
                 double salesAmount = scanner.nextInt();
                 Salesperson salesPerson = new Salesperson(empNum);
                 salesPerson.setName(empName);
                 salesPerson.setSales(salesAmount);
                 SalespersonList.add(salesPerson);
            }
            else if(userChoice == 2) {
                System.out.println("Please enter hours worked: ");
                 int hoursWorked = scanner.nextInt();
                 System.out.println("Please enter hourly rate: ");
                 double hourlyRate = scanner.nextDouble();
                 Worker worker = new Worker(empNum);
                 worker.setName(empName);
                 worker.setHoursWorked(hoursWorked);
                 worker.setHourlyRate(hourlyRate);
                 WorkerList.add(worker);
            }
            else if(userChoice == 3) {
                System.out.println("Exiting the program...");
                flag = false;
            }
            else {
                System.out.println("Please enter a valid input.");
            }
        }
        
        for(Salesperson obj: SalespersonList) {
            System.out.println("Employee Number: "+ obj.getEmployeeNumber());
            System.out.println("Sales Person name: "+ obj.getName());
            System.out.println("Sales Amount: "+ obj.getSales());
            System.out.println("Commission Rate: "+ obj.getRate());
            System.out.println("Commission Amount: "+ obj.calculateCommission());
        }
        
        for(Worker obj: WorkerList) {
            System.out.println("Employee Number: "+ obj.getEmployeeNumber());
            System.out.println("Worker name: "+ obj.getName());
            System.out.println("Hours Worked: "+ obj.getHoursWorked());
            System.out.println("Hourly Rate: "+ obj.getHourlyRate());
            System.out.println("Pay: "+ obj.calculatePay());
        }
    }
    
}
