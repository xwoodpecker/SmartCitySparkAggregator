package de.htw.saar.smartcity.spark.temperature.group;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages =  {"de.htw.saar.smartcity.aggregator.lib", "de.htw.saar.smartcity.spark.temperature.group"})
@EntityScan({"de.htw.saar.smartcity.aggregator.lib", "de.htw.saar.smartcity.spark.temperature.group"})
@EnableJpaRepositories({"de.htw.saar.smartcity.aggregator.lib", "de.htw.saar.smartcity.spark.temperature.group"})
public class TemperatureAggregationSpringSparkApplication {

    public static void main(String[] args) {

        SpringApplication.run(TemperatureAggregationSpringSparkApplication.class, args);
    }

}
