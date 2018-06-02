package com.scarlatti.model;

import java.util.ArrayList;
import java.util.List;

/**
 * ______    __                         __           ____             __     __  __  _
 * ___/ _ | / /__ ___ ___ ___ ____  ___/ /______    / __/______ _____/ /__ _/ /_/ /_(_)
 * __/ __ |/ / -_|_-<(_-</ _ `/ _ \/ _  / __/ _ \  _\ \/ __/ _ `/ __/ / _ `/ __/ __/ /
 * /_/ |_/_/\__/___/___/\_,_/_//_/\_,_/_/  \___/ /___/\__/\_,_/_/ /_/\_,_/\__/\__/_/
 * Saturday, 6/2/2018
 */
public class ListContainer {
    private List<PenguinProps> penguins = new ArrayList<>();

    @Override
    public String toString() {
        return "ListContainer{" +
            "penguins=" + penguins +
            '}';
    }

    public List<PenguinProps> getPenguins() {
        return penguins;
    }

    public void setPenguins(List<PenguinProps> penguins) {
        this.penguins = penguins;
    }
}
