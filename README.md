# PIM-SAR_WiSe21_Gruppe04 Lambda Architecture 

## Funtional Requirements:
### Must-Have-Requirements
__Real time processing:__ The speed layer must save sensor measurements and compute aggregates of measurements in real time.

__Historical data processing:__ The batch layer must sample data from the real-time measurements and aggregates. The computation creates minimums, maximums and averages over different time periods.

__Sensor Connection:__ The system must function with the given GrovePi sensors. The present models are Temperature & Humdity, Water and Airquality. The sensors are connected to a Raspberry Pi. The sensor measurements must be collected by the Kafka server.

__Data provision:__ The sensor data must be provisioned over an api. This makes it possible to integrate it in other applications or to display it in frontend solutions.

__Data Usage:__ The sensor data is sent to a Kafka server and afterwards accessed via separate Apache Spark applications.

### Should-Have-Requirements

__RabbitMQ integration:__ A bridge between the RabbitMQ message broker and the Kafka server is established. This way the sensors do not have to send to the Kafka server directly. Instead, the data gets sent from the message broker topics into the corresponding Kafka topics. This makes a simple integration of the new architecture in the existing Distributed Systems Lab (DSL) cluster environment possible.

__Sensor visualization:__ The application also supports other sensor types. These can be virtualized with a prototypical application.

### Nice-To-Have-Requirements

__Data visualization:__ An integration in the prometheus and grafana stack can be done. Then, measurements and aggregates can be displayed in various diagrams and dashboards.

## Nonfuntional Requirements:
### Must-Have-Requirements
__Lambda architecture:__ A Lambda Architecture must be used. This architecture consists of a batch, a speed and a serving layer.

__Extensibility:__ Spark applications contain logic to compute sensor measurements or aggregates. The architecture revolves around creating new spark applications whenever new requirements arise.

__Availibility:__ The application and its components should work correctly 99.9% of the time.

__Scalability:__ The architecture must be scalable. Additional resources can be added in order to respond to higher workloads.

__Statelessness:__ The applications must be stateless to enable a horizontal scaling.

__Technologies:__ The usage of Spring Boot for the development, Kafka and Spark for the Lambda Architecture.

__Data in spark:__ The data is split and accessed in separate spark applications for every data type.

__Kubernetes:__ The applications are created for the DSL cluster of the htw-saar. Therefore, the architecture of the application and all software modules must be deployed in Kubernetes.

Externalized configuration: The application configuration must be externalized. Environment variables can be used for that. This enables the central management of all configurations over Kubernetes. Thus, making changes to entries like ports or addresses requires minimal time investment.

### Should-Have-Requirements
__Performance:__ The aggregation of sensor data must take a maximum of 50ms under maximum load.

__Other Technologies:__ MinIO should be used as the data storage

### Nice-To-Have-Requirements
__Batch storage technology:__ Hadoop can be used for the storage in the batch layer.

![Architecture](https://i.imgur.com/GzzAQj0.png)
![Sequenz Diagram](https://i.imgur.com/pjPTn5w.png)
