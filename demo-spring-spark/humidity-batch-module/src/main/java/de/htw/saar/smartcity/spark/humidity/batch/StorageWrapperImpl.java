package de.htw.saar.smartcity.spark.humidity.batch;

import de.htw.saar.smartcity.aggregator.lib.properties.MinioApplicationProperties;
import de.htw.saar.smartcity.aggregator.lib.storage.HistoricStorageWrapper;
import org.springframework.stereotype.Component;

@Component
public class StorageWrapperImpl extends HistoricStorageWrapper {

    public StorageWrapperImpl(MinioApplicationProperties applicationProperties) throws Exception {
        super(applicationProperties);
    }
}
