package de.htw.saar.smartcity.spark.temperature.raw;

import de.htw.saar.smartcity.aggregator.lib.service.AggregatorService;
import de.htw.saar.smartcity.aggregator.lib.service.SensorService;
import de.htw.saar.smartcity.aggregator.lib.storage.StorageWrapper;
import org.springframework.stereotype.Component;

@Component
public class StorageWrapperImpl extends StorageWrapper {

    public StorageWrapperImpl(ApplicationConfig applicationProperties, SensorService sensorService, AggregatorService aggregatorService) throws Exception {
        super(applicationProperties, sensorService, aggregatorService);
    }

}
