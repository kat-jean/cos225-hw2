public class ParkingTester {
    public static void main(String[] args) {
        
        ParkingLot lot = new ParkingLot();
        System.out.println(lot.toString());

        Car subaru = new Car("Subaru", "Blue", true);
        int subaruSpot = lot.park(subaru);
        System.out.println(lot.toString());

        Car ford = new Car("Ford", "Red", false);
        lot.park(ford); // had int fordSpot = lot.park(ford) ... had warning so deleted the first part
        System.out.println(lot.toString());

        lot.removeCar(subaruSpot); // got the wrong output with lot.removeCar(fordSpot) ... correct with subaruSpot since it's first car in
        System.out.println(lot.toString());

    }
}
