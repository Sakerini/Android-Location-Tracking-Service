package com.example.locationtracker;

import android.location.Location;

public class SendLocationToActivity {

    private Location location;

    public SendLocationToActivity(Location mLocation) {
        this.location = mLocation;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
