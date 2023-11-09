package pluralsight;

public class Vehicle extends Asset{
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue(){
        double value = super.getValue(); // Get the original cost from the parent class

        int currentYear = 2023; // Current year, change as per the actual current year

        // Calculate the age of the vehicle
        int age = currentYear - year;

        if (age >= 0 && age <= 3) {
            // If the vehicle is 0 to 3 years old, reduce the value by 3% per year
            for (int i = 0; i < age; i++) {
                value *= 0.97; // Reduce by 3% per year
            }
        } else if (age >= 4 && age <= 6) {
            // If the vehicle is 4 to 6 years old, reduce the value by 6% per year
            for (int i = 0; i < age - 3; i++) {
                value *= 0.94; // Reduce by 6% per year
            }
        } else if (age >= 7 && age <= 10) {
            // If the vehicle is 7 to 10 years old, reduce the value by 8% per year
            for (int i = 0; i < age - 6; i++) {
                value *= 0.92; // Reduce by 8% per year
            }
        } else if (age > 10) {
            // If the vehicle is over 10 years old, reduce the value by $1000
            value -= 1000;
        }

        if (odometer > 100000 && !(makeModel.toLowerCase().contains("honda") || makeModel.toLowerCase().contains("toyota"))) {
            // If the odometer is over 100,000 miles and not a Honda or Toyota, reduce the value by 25%
            value *= 0.75;
        }

        return value; // Return the final adjusted value
    }
}
