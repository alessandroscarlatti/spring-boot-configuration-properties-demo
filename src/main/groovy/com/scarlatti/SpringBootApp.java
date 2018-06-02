package com.scarlatti;

import com.scarlatti.model.ListContainer;
import com.scarlatti.model.MapContainer;
import com.scarlatti.model.PenguinProps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringBootApp implements ApplicationRunner {

    private PenguinProps penguin1;
    private List<PenguinProps> penguinsList1;
    private ListContainer listContainer1;
    private ListContainer listContainer2;
    private MapContainer mapContainer1;

    private static final Logger log = LoggerFactory.getLogger(SpringBootApp.class);

    public SpringBootApp(@Qualifier(BeanNames.Penguin1Props) PenguinProps penguin1,
                         @Qualifier(BeanNames.PenguinsList1) List<PenguinProps> penguinsList1,
                         @Qualifier(BeanNames.ListContainer1) ListContainer listContainer1,
                         @Qualifier(BeanNames.ListContainer2) ListContainer listContainer2,
                         @Qualifier(BeanNames.MapContainer1) MapContainer mapContainer1) {
        this.penguin1 = penguin1;
        this.penguinsList1 = penguinsList1;
        this.listContainer1 = listContainer1;
        this.listContainer2 = listContainer2;
        this.mapContainer1 = mapContainer1;
    }

    public static void main(String[] args) {
		SpringApplication.run(SpringBootApp.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
        log.info("{}: {}", BeanNames.Penguin1Props, penguin1);
        log.info("{}: {}", BeanNames.PenguinsList1, penguinsList1);
        log.info("{}: {}", BeanNames.ListContainer1, listContainer1);
        log.info("{}: {}", BeanNames.ListContainer2, listContainer2);
        log.info("{}: {}", BeanNames.MapContainer1, mapContainer1);
	}
}
