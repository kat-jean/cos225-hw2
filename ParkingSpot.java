public class ParkingSpot {
    
    public boolean handicap = false;
    public Car car;

    public ParkingSpot(boolean handicap){
        this.handicap = handicap;
        this.car = null;
 }

    public boolean isHandicap(){
        return handicap;
}
    public Car getCar(){
        return car;
}
    public void setCar(Car car){
        this.car = car;
}
    public Car removeCar(){
        Car temp = this.car;
        this.car = null;
        return temp;
}
    public boolean isAvailable(){
        return this.car == null;
}

}
