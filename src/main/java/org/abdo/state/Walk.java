package org.abdo.state;

public class Walk implements TravelMode {
    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (walking)");
        return 4;
    }

    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (walking)");
        return 4;
    }
}
