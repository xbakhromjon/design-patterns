package uz.bakhromjon.mediatorChallenge;

import java.util.ArrayList;
import java.util.List;

public class PlanesOnGround {
    private List<Plane> planes = new ArrayList<>();


    public void add(Plane plane) {
        planes.add(plane);
    }

    public void remove(Plane plane) {
        planes.remove(plane);
    }
}
