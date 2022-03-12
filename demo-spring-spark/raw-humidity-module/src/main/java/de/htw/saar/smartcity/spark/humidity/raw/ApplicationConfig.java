package de.htw.saar.smartcity.spark.humidity.raw;

import de.htw.saar.smartcity.aggregator.lib.properties.RawMeasurementHandlerProperties;
import de.htw.saar.smartcity.aggregator.lib.properties.SparkBasicApplicationProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class ApplicationConfig extends SparkBasicApplicationProperties implements RawMeasurementHandlerProperties {

    @Value("${EXPORT_SENSOR_DATA}")
    private boolean exportSensorDataAsMetric;

    @Override
    public boolean getExportSensorDataAsMetric() {
        return this.exportSensorDataAsMetric;
    }

    @Override
    @Value("${BUCKET_NAME}")
    protected void setMinioBucket(String minioBucketName) {
        this.minioBucketName = minioBucketName;
    }

    @Override
    @Value("${HUMIDITY_SENSOR_TYPE}")
    public void setApplicationDataType(String applicationDataType) {
        this.applicationDataType = applicationDataType;
    }

    @Override
    @Value("${HUMIDITY_TOPIC_PATTERN}")
    protected void setKafkaTopicPattern(String kafkaTopicPattern) {
        this.kafkaTopicPattern = kafkaTopicPattern;
    }
}
