# PIM-SAR_WiSe21_Gruppe04 Lambda Architecture 

##Functional and Nonfuntional Requirements:
###Must-Have-Requirements
Lambda architecture: A Lambda Architecture must be used. This architecture consists of
a batch, a speed and a serving layer.
Extensibility: Spark applications contain logic to compute sensor measurements or aggregates. The architecture revolves around creating new spark applications whenever
new requirements arise.
Availibility: The application and its components should work correctly 99.9% of the time.
Scalability: The architecture must be scalable. Additional resources can be added in order
to respond to higher workloads.
Statelessness: The applications must be stateless to enable a horizontal scaling.
Technologies: The usage of Spring Boot for the development, Kafka and Spark for the
Lambda Architecture.
Data in spark: The data is split and accessed in separate spark applications for every data
type.
Kubernetes: The applications are created for the DSL cluster of the htw-saar. Therefore,
the architecture of the application and all software modules must be deployed in
Kubernetes.
Externalized configuration: The application configuration must be externalized. Environment variables can be used for that. This enables the central management of
all configurations over Kubernetes. Thus, making changes to entries like ports or
addresses requires minimal time investment.
###Should-Have-Requirements
Performance: The aggregation of sensor data must take a maximum of 50ms under maximum load.
Other Technologies: MinIO should be used as the data storage
###Nice-To-Have-Requirements
Batch storage technology: Hadoop can be used for the storage in the batch layer.
![Architecture](https://i.imgur.com/GzzAQj0.png)
![Sequenz Diagram](https://i.imgur.com/pjPTn5w.png)
