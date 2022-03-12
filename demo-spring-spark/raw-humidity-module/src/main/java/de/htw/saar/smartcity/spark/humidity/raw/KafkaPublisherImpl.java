package de.htw.saar.smartcity.spark.humidity.raw;

import de.htw.saar.smartcity.aggregator.lib.broker.KafkaPublisher;
import org.springframework.stereotype.Component;

@Component
public class KafkaPublisherImpl extends KafkaPublisher {

    public KafkaPublisherImpl(ApplicationConfig applicationConfig) {
        super(applicationConfig);
    }
}
