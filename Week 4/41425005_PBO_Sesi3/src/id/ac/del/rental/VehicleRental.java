/*
Nama : Nicolas Adrian Partuaon Tambunan
Nim  : 41425005
Prodi  : DIV TRpl 25
*/



package id.ac.del.rental;


public class VehicleRental {

    public String plateNumber;
    protected double rentalRatePerDay;
    private int rentalDays;
    double discountRate;
    
 
    public VehicleRental(String plateNumber, double rate) {
        this.plateNumber = plateNumber;
        this.rentalRatePerDay = rate;
    }
       public interface Discountable {
    double calculateDiscount(double amount);
}


    public void setRentalDays(int days) {
        this.rentalDays = days;
    }

    public double getTotalCost() {
        return (rentalRatePerDay * rentalDays) -
               (rentalRatePerDay * rentalDays * discountRate);
    }
}

