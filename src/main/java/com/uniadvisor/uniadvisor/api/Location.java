package com.uniadvisor.uniadvisor.api;

import java.io.Serializable;

public class Location implements Serializable {
    private final double lat;
    private final double lng;
    private final String longName;
    private final String shortName;
    private final String address;
    private final Boolean AC;
    private final Boolean plugs;
    private final Boolean WiFi;

    public Location(double lat, double lng, String longName, String shortName, String address, Boolean AC, Boolean plugs, Boolean wiFI) {
        this.lat = lat;
        this.lng = lng;
        this.longName = longName;
        this.shortName = shortName;
        this.address = address;
        this.AC = AC;
        this.plugs = plugs;
        this.WiFi = wiFI;
    }

    public Location() {
        this.lat = 41.89;
        this.lng = 12.503;
        this.longName = "Dipartimento di ingegneria informatica e automatica 'Antonio Ruberti";
        this.shortName = "diag";
        this.address = "via Ariosto, 25";
        this.AC = Boolean.TRUE;
        this.plugs = Boolean.TRUE;
        this.WiFi = Boolean.TRUE;
    }

    @Override
    public String toString() {
        return longName + "\n" +
                lat + "N " + lng + "E\n" +
                address + "\n" +
                "    AC: " + (AC ? "YES" : "NO") +
                "    Plugs: " + (plugs ? "YES" : "NO") +
                "    WIFI: " + (WiFi ? "YES" : "NO");

    }

    public double getDist(double lo, double la){
        double lon = this.lng - lo;
        double lat = this.lat - la;
        return Math.sqrt(lon*lon + lat*lat);
    }

    public double getDist(Location l){
        double lon = this.lng - l.lng;
        double lat = this.lat - l.lat;
        return Math.sqrt(lon*lon + lat*lat);
    }



    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }

    public String getLongName() {
        return longName;
    }

    public String getShortName() {
        return shortName;
    }

    public String getAddress() {
        return address;
    }

    public Boolean getAC() {
        return AC;
    }

    public Boolean getPlugs() {
        return plugs;
    }

    public Boolean getWiFI() {
        return WiFi;
    }
}

