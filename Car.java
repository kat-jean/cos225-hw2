public class Car {
    String make;
    String color;
    boolean handicap = false;

    public Car(){
        make = "Beetle";
        color = "Black";
        handicap = false;
}

    public Car(String make, String color, boolean handicap){
        this.make = make;
        this.color = color;
        this.handicap = handicap;
}

    public String getMake(){
        return make;
}
    public String getColor(){
        return color;
}
    public boolean getHandicap(){
        return handicap;
}

}
