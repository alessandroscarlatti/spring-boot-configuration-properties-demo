package com.scarlatti;

import com.scarlatti.model.ListContainer;
import com.scarlatti.model.MapContainer;
import com.scarlatti.model.PenguinProps;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * ______    __                         __           ____             __     __  __  _
 * ___/ _ | / /__ ___ ___ ___ ____  ___/ /______    / __/______ _____/ /__ _/ /_/ /_(_)
 * __/ __ |/ / -_|_-<(_-</ _ `/ _ \/ _  / __/ _ \  _\ \/ __/ _ `/ __/ / _ `/ __/ __/ /
 * /_/ |_/_/\__/___/___/\_,_/_//_/\_,_/_/  \___/ /___/\__/\_,_/_/ /_/\_,_/\__/\__/_/
 * Saturday, 6/2/2018
 */
@Configuration
public class Config {

    @Bean(BeanNames.Penguin1Props)
    @ConfigurationProperties("penguin1")
    public PenguinProps penguin1Props() {
        return new PenguinProps();
    }

    @Bean(BeanNames.PenguinsList1)
    @ConfigurationProperties("penguinsList1")
    public List<PenguinProps> penguinsList1() {
        return new ArrayList<>();
    }

    @Bean(BeanNames.ListContainer1)
    @ConfigurationProperties("listContainer1")
    public ListContainer listContainer1() {
        return new ListContainer();
    }

    @Bean(BeanNames.ListContainer2)
    @ConfigurationProperties("listContainer2")
    public ListContainer listContainer2() {
        return new ListContainer();
    }

    @Bean(BeanNames.MapContainer1)
    @ConfigurationProperties("mapContainer1")
    public MapContainer mapContainer1() {
        return new MapContainer();
    }
}
