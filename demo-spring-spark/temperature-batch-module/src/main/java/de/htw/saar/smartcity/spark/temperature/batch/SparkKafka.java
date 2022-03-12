package de.htw.saar.smartcity.spark.temperature.batch;

import de.htw.saar.smartcity.aggregator.lib.factory.MeasurementFactory;
import de.htw.saar.smartcity.aggregator.lib.model.*;
import de.htw.saar.smartcity.aggregator.lib.properties.HistoricSparkAggregatorApplicationProperties;
import de.htw.saar.smartcity.aggregator.lib.service.HistoricCombinatorService;
import de.htw.saar.smartcity.aggregator.lib.service.SensorService;
import de.htw.saar.smartcity.aggregator.lib.spark.HistoricSparkKafkaRunner;
import de.htw.saar.smartcity.aggregator.lib.storage.HistoricStorageWrapper;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.springframework.stereotype.Component;

@Component
public class SparkKafka<Double> extends HistoricSparkKafkaRunner<Double> {

    public SparkKafka(HistoricSparkAggregatorApplicationProperties applicationProperties, JavaStreamingContext jsc,
                      MeasurementFactory measurementFactory, HistoricStorageWrapper storageWrapper,
                      SensorService sensorService, HistoricCombinatorService historicCombinatorService) {

        super(applicationProperties, jsc, measurementFactory, storageWrapper, sensorService, historicCombinatorService);
    }

    @Override
    protected String getKafkaGroupId() {
        return "SPARK_HISTORIC_TEMPERATURE_AGGREGATES_GROUP";
    }

    @Override
    protected void addHistoricCombinators() {

        historicCombinatorModels.add(HistoricCombinatorModels.averageHistoricCombinatorModel);
        historicCombinatorModels.add(HistoricCombinatorModels.maximumHistoricCombinatorModel);
        historicCombinatorModels.add(HistoricCombinatorModels.minimumHistoricCombinatorModel);

    }
}