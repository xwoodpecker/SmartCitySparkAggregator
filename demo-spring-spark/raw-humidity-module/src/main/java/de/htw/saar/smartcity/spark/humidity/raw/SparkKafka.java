package de.htw.saar.smartcity.spark.humidity.raw;

import de.htw.saar.smartcity.aggregator.lib.handler.RawMeasurementHandler;
import de.htw.saar.smartcity.aggregator.lib.properties.SparkBasicApplicationProperties;
import de.htw.saar.smartcity.aggregator.lib.spark.RawSparkKafkaRunner;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.springframework.stereotype.Component;

@Component
public class SparkKafka extends RawSparkKafkaRunner {

    public SparkKafka(SparkBasicApplicationProperties applicationProperties, JavaStreamingContext jsc, RawMeasurementHandler rawMeasurementHandler) {
        super(applicationProperties, jsc, rawMeasurementHandler);
    }

    @Override
    protected String getKafkaGroupId() {
        return "SPARK_RAW_HUMIDITY_GROUP";
    }
}
