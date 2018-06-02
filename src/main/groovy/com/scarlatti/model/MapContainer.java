package com.scarlatti.model;

import java.util.LinkedHashMap;

/**
 * ______    __                         __           ____             __     __  __  _
 * ___/ _ | / /__ ___ ___ ___ ____  ___/ /______    / __/______ _____/ /__ _/ /_/ /_(_)
 * __/ __ |/ / -_|_-<(_-</ _ `/ _ \/ _  / __/ _ \  _\ \/ __/ _ `/ __/ / _ `/ __/ __/ /
 * /_/ |_/_/\__/___/___/\_,_/_//_/\_,_/_/  \___/ /___/\__/\_,_/_/ /_/\_,_/\__/\__/_/
 * Saturday, 6/2/2018
 */
public class MapContainer {
    private LinkedHashMap<String, PenguinProps> penguins = new LinkedHashMap<>();

    @Override
    public String toString() {
        return "MapContainer{" +
            "penguins=" + penguins +
            '}';
    }

    public LinkedHashMap<String, PenguinProps> getPenguins() {
        return penguins;
    }

    public void setPenguins(LinkedHashMap<String, PenguinProps> penguins) {
        this.penguins = penguins;
    }
}
