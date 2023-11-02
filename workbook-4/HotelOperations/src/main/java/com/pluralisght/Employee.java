package com.pluralisght;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double punchInTime;
    private double lastPunchTime;

    private LocalDateTime punchInTime1;
    private LocalDateTime punchOutTime1;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.lastPunchTime = 0.0;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay(){
       return (getRegularHours() * payRate) +
                (getOvertimeHours() * 1.5 * payRate);
    }

    public double getRegularHours(){
        if (hoursWorked <= 40){
            return hoursWorked;
        }else{
            return 40;
        }
    }

    public double getOvertimeHours(){
        if(hoursWorked > 40){
            return hoursWorked - 40;
        }else{
            return 0;
        }
    }

    public void punchIn(double time) {
        punchInTime = time;
        System.out.println("Punched in at: " + time);
    }

    public void punchOut(double time) {
        double hoursWorkedToday = time - punchInTime;
        if (hoursWorkedToday > 0) {
            hoursWorked += hoursWorkedToday;
            System.out.println("Punched out at: " + time);
            System.out.println("Worked for " + hoursWorkedToday + " hours today.");
        } else {
            System.out.println("Error: Invalid punch out time.");
        }
    }

    public void punchTimeCard(double time, boolean punchIn) {
        if (punchIn) {
            lastPunchTime = time;
            System.out.println("Punched in at: " + time);
        } else {
            double hoursWorkedToday = time - lastPunchTime;
            if (hoursWorkedToday > 0) {
                hoursWorked += hoursWorkedToday;
                System.out.println("Punched out at: " + time);
                System.out.println("Worked for " + hoursWorkedToday + " hours today.");
            } else {
                System.out.println("Error: Invalid punch out time.");
            }
        }
    }
    public void punchIn(){
        punchInTime1 = LocalDateTime.now();
        int hour = punchInTime1.getHour();
        int minute = punchInTime1.getMinute();
        double time = hour + (minute/60.0);
        punchInTime = time;
    }

    public void punchOut(){
        punchOutTime1 = LocalDateTime.now();
        int hour = punchOutTime1.getHour();
        int minute = punchOutTime1.getMinute();
        punchInTime = 0;
        }
    }
}
