package de.htw.saar.smartcity.spark.humidity.group;

import de.htw.saar.smartcity.aggregator.lib.base.GroupSetupDataLoader;
import de.htw.saar.smartcity.aggregator.lib.service.DataTypeService;
import de.htw.saar.smartcity.aggregator.lib.service.GroupTypeService;
import org.springframework.stereotype.Component;

/**
 * The type Setup data loader.
 */
@Component
public class GroupSetupDataLoaderImpl extends GroupSetupDataLoader {

    public GroupSetupDataLoaderImpl(ApplicationConfig humidityAggregatorApplicationProperties,
                                    GroupTypeService groupTypeService,
                                    DataTypeService dataTypeService) {

        super(humidityAggregatorApplicationProperties, groupTypeService, dataTypeService);
    }
}
