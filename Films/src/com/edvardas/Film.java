package com.edvardas;

import java.time.LocalTime;

public class Film {
    private int productionYear;
    private String name;
    private int playTimeHour;
    private int playTimeMinutes;
    private int viewerCount;

    public Film(int productionYear, String name, int playTimeHour, int playTimeMinutes, int viewerCount) {
        this.productionYear = productionYear;
        this.name = name;
        this.playTimeHour = playTimeHour;
        this.playTimeMinutes = playTimeMinutes;
        this.viewerCount = viewerCount;
    }

    public Film() {
        this.productionYear = 0;
        this.name = "";
        this.playTimeHour = 0;
        this.playTimeMinutes = 0;
        this.viewerCount = 0;
    }

    public int getProductionYear() { return productionYear; }

    public String getName() { return name; }

    public int getPlayTimeHour() { return playTimeHour; }

    public int getPlayTimeMinutes() { return playTimeMinutes; }

    public int getViewerCount() { return viewerCount; }

    public LocalTime getRunTime() { return LocalTime.of(getPlayTimeHour(), getPlayTimeMinutes()); }

    public void setProductionYear(int productionYear) { this.productionYear = productionYear; }

    public void setName(String name) { this.name = name; }

    public void setPlayTimeHour(int playTimeHour) { this.playTimeHour = playTimeHour; }

    public void setPlayTimeMinutes(int playTimeMinutes) { this.playTimeMinutes = playTimeMinutes; }

    public void setViewerCount(int viewerCount) { this.viewerCount = viewerCount; }
}
