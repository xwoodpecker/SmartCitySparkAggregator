package de.htw.saar.smartcity.spark.temperature.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages =  {"de.htw.saar.smartcity.aggregator.lib", "de.htw.saar.smartcity.spark.temperature.batch"})
@EntityScan({"de.htw.saar.smartcity.aggregator.lib", "de.htw.saar.smartcity.spark.temperature.batch"})
@EnableJpaRepositories({"de.htw.saar.smartcity.aggregator.lib", "de.htw.saar.smartcity.spark.temperature.batch"})
public class TemperatureBatchSpringSparkApplication {

    public static void main(String[] args) {

        SpringApplication.run(TemperatureBatchSpringSparkApplication.class, args);
    }

}
