package de.htw.saar.smartcity.spark.humidity.group;

import de.htw.saar.smartcity.aggregator.lib.handler.GroupMeasurementHandler;
import de.htw.saar.smartcity.aggregator.lib.properties.SparkGroupApplicationProperties;
import de.htw.saar.smartcity.aggregator.lib.spark.GroupSparkKafkaRunner;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.springframework.stereotype.Component;

@Component
public class SparkKafka extends GroupSparkKafkaRunner {

    public SparkKafka(SparkGroupApplicationProperties applicationProperties, JavaStreamingContext jsc, GroupMeasurementHandler groupMeasurementHandler) {
        super(applicationProperties, jsc, groupMeasurementHandler);
    }

    @Override
    protected String getKafkaGroupId() {
        return "SPARK_HUMIDITY_AGGREGATES_GROUP";
    }

}
