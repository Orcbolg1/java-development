package com.pluralisght;

public class Main {

    public static void main(String[] args) throws InterruptedException {
//        // Test Employee class
       Employee employee = new Employee(1, "John Doe", "IT", 25.00, 0.00);
//        System.out.println("Employee ID: " + employee.getEmployeeId());
//        System.out.println("Employee Name: " + employee.getName());
//        System.out.println("Employee Department: " + employee.getDepartment());
//        System.out.println("Employee Pay Rate: " + employee.getPayRate());
//        System.out.println("Employee Hours Worked: " + employee.getHoursWorked());
//        System.out.println("Employee Total Pay: " + employee.getTotalPay());
//        System.out.println("Employee Regular Hours: " + employee.getRegularHours());
//        System.out.println("Employee Overtime Hours: " + employee.getOvertimeHours());
//
//        // Test Reservation class
//        Reservation reservation = new Reservation("king", 3, true);
//        System.out.println("Room Type: " + reservation.getRoomType());
//        System.out.println("Price per Night: " + reservation.getPrice());
//        System.out.println("Number of Nights: " + reservation.getNumberOfNights());
//        System.out.println("Is Weekend: " + reservation.isWeekend());
//        System.out.println("Reservation Total: " + reservation.getReservationTotal());
//
//        // Test Room class
       Room room = new Room(2, 99.99);
//        System.out.println("Number of Beds: " + room.getNumberOfBeds());
//        System.out.println("Price: " + room.getPrice());
//        System.out.println("Is Occupied: " + room.isOccupied());
//        System.out.println("Is Dirty: " + room.isDirty());
//        System.out.println("Is Available: " + room.isAvailable());

//        employee.punchIn(8.00);
//        employee.punchOut(16.00);
//        employee.punchTimeCard(8.00, true);
//        employee.punchTimeCard(16.00, false);

        //Testing new Punch in and punch out constructor that use LocalDateTime
        employee.punchIn();
        Thread.sleep(1000);
        employee.punchOut();

        outputBreak('=', 20);

        //Created a Test Object for hotel.
        Hotel hotel = new Hotel("Test Hotel", 10, 20, 2, 5);
        Hotel smallHotel = new Hotel("Small Hotel", 2, 5);

        // Testing booking of available suites
        hotel.bookRooms(2, true); // Should successfully book 2 suites
        outputBreak('=', 20);

        hotel.bookRooms(10, true); // Should fail to book 10 suites due to insufficient availability
        outputBreak('=', 20);

        // Testing booking of available basic rooms
        hotel.bookRooms(3, false); // Should successfully book 3 basic rooms
        outputBreak('=', 20);

        hotel.bookRooms(15, false); // Should fail to book 10 basic rooms due to insufficient availability
        outputBreak('=', 20);

        hotel.bookRooms(5, true);
        outputBreak('=', 20);

        hotel.bookRooms(2, true);
        outputBreak('=', 20);

        smallHotel.bookRooms(1, true);
        outputBreak('=', 20);

        smallHotel.bookRooms(2, true);
        outputBreak('=', 20);

        smallHotel.bookRooms(1,false);
        outputBreak('=', 20);

        smallHotel.bookRooms(4, false);
        outputBreak('=', 20);
    }

    public static void outputBreak(char symbol, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }

}
