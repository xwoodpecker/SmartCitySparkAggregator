package de.htw.saar.smartcity.spark.temperature.raw;

import de.htw.saar.smartcity.aggregator.lib.base.RawSetupDataLoader;
import de.htw.saar.smartcity.aggregator.lib.properties.RawMicroserviceApplicationProperties;
import de.htw.saar.smartcity.aggregator.lib.service.DataTypeService;
import org.springframework.stereotype.Component;

/**
 * The type Setup data loader.
 */
@Component
public class TemperatureSetupDataLoader extends RawSetupDataLoader {

    public TemperatureSetupDataLoader(DataTypeService dataTypeService, ApplicationConfig applicationConfig) {
        super(dataTypeService, applicationConfig);
    }
}
