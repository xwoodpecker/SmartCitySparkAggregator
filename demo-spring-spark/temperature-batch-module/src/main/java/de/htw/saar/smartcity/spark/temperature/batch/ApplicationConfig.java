package de.htw.saar.smartcity.spark.temperature.batch;

import de.htw.saar.smartcity.aggregator.lib.properties.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class ApplicationConfig extends HistoricSparkAggregatorApplicationProperties {

    @Override
    @Value("${BUCKET_NAME}")
    protected void setMinioBucketName(String minioBucketName) {
        this.minioBucketName = minioBucketName;

    }

    @Override
    @Value("${TEMPERATURE_SENSOR_TYPE}")
    public void setMicroserviceDataType(String microserviceDataType) {
        this.microserviceDataType = microserviceDataType;
    }

    @Override
    @Value("${TEMPERATURE_TOPIC_PATTERN}")
    protected void setKafkaTopicPattern(String kafkaTopicPattern) {
        this.kafkaTopicPattern = kafkaTopicPattern;
    }


}
