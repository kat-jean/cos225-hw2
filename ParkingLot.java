public class ParkingLot {
    public ParkingSpot[] spots;

    public ParkingLot(){
        spots = new ParkingSpot[8];
        spots[0] = new ParkingSpot(true);
        spots[1] = new ParkingSpot(true);

        for (int i = 2; i < spots.length; i++){
            spots[i] = new ParkingSpot(false);
        }
}
    public int park(Car car){
        for (int i = 0; i < spots.length; i++){
            if (spots[i].car == null && spots[i].handicap == car.getHandicap()){
                spots[i].car = car;
                return i;
            }
        }
        return -1;
    }
    public Car removeCar(int index){
        Car removed = spots[index].car;
        spots[index].car = null;
        return removed;
    }
    @Override 
    public String toString(){
        int handicapCount = 0;
        int standardCount = 0;

        for (ParkingSpot spot : spots) { // see note below
            if (spot.car == null) {
                if (spot.handicap) {
                    handicapCount++;
                } else {
                    standardCount++;
                }
            }
        }
        return handicapCount + " " + standardCount;
    }
}
 /*
 I had this for the for loop, but used quick fix since I had a warning.
 for (int i = 0; i < spots.length; i++){
            if (spots[i].car == null){
                if (spots[i].handicap){
                    handicapCount++;
            }
                else {
                    standardCount++;
            }
        }
    }
        return handicapCount + " " + standardCount;
    }
 
Normally wouldn't use a code I don't understand/didn't learn, like *for(ParkingSpot spot : spots)*
but quick fix took away my warning with this, please let me know if this isn't ok and I won't do it for the next HW :)
 */


