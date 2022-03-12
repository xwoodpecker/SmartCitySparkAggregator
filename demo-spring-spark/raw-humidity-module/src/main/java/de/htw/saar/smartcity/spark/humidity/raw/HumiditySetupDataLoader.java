package de.htw.saar.smartcity.spark.humidity.raw;

import de.htw.saar.smartcity.aggregator.lib.base.RawSetupDataLoader;
import de.htw.saar.smartcity.aggregator.lib.properties.RawMicroserviceApplicationProperties;
import de.htw.saar.smartcity.aggregator.lib.service.DataTypeService;
import org.springframework.stereotype.Component;

/**
 * The type Setup data loader.
 */
@Component
public class HumiditySetupDataLoader extends RawSetupDataLoader {

    public HumiditySetupDataLoader(DataTypeService dataTypeService, ApplicationConfig applicationConfig) {
        super(dataTypeService, applicationConfig);
    }
}
