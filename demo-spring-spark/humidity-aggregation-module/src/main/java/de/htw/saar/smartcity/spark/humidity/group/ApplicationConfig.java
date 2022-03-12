package de.htw.saar.smartcity.spark.humidity.group;

import de.htw.saar.smartcity.aggregator.lib.properties.SparkGroupApplicationProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class ApplicationConfig extends SparkGroupApplicationProperties {

    @Override
    @Value("${BUCKET_NAME}")
    protected void setMinioBucket(String minioBucketName) {
        this.minioBucketName = minioBucketName;
    }

    @Override
    @Value("${HUMIDITY_AGGREGATOR_GROUP_TYPE_NAME}")
    public void setGroupTypeName(String groupTypeName) {
        this.groupTypeName = groupTypeName;
    }

    @Override
    @Value("${HUMIDITY_SENSOR_TYPE}")
    public void setApplicationDataType(String applicationDataType) {
        this.applicationDataType = applicationDataType;
    }
}
