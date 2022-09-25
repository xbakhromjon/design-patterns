package uz.bakhromjon.mediatorChallenge;

public class Plane {
    private Integer id;
    private Boolean isInTheAir;
    private RunWay runWay;
    private PlanesInFlight planesInFlight;
    private PlanesOnGround planesOnGround;

    public Plane(Integer id) {
        this.id = id;
        isInTheAir = false;
        runWay = new RunWay();
        planesInFlight = new PlanesInFlight();
        planesOnGround = new PlanesOnGround();
        planesOnGround.add(this);
    }

    public void takeOff() {
        if (!isInTheAir && runWay.getIsAvailable()) {
            System.out.println("Plane " + id + " is taking off...");
            planesOnGround.remove(this);
            planesInFlight.add(this);
            isInTheAir = true;
            runWay.setIsAvailable(false);
        }
    }
}
