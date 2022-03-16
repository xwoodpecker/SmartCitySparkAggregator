# PIM-SAR_WiSe21_Gruppe04 Lambda Architecture 
## Our Project
Year by year, the growth of Internet of Things leads to the invention of new, advanced technologies. How can these be used to process data from heterogeneous sensor networks? What challenges arise for systems with a wide variety of sensors and how can they be addressed? What are advantages and disadvantages of different architectures in this area?
This project tries to answer these, and many other questions, that arise when designing a system for sensor data processing.
The goal is the conception and implementation of a Lambda architecture for the processing of sensor readings and the formation of aggregates. The aggregates should be created in real time and over longer periods of time. 
They should consist of simple calculations, but also more complex formulas. A high priority is given to the target platform Kubernetes, which is used to orchestrate containers. 
A large focus is placed on the representation of the individual Lambda components and their interaction. This allows a deeper understanding of the architectural concept and its advantages and disadvantages.
Likewise, used technologies, their application, as well as relevant implementation details are presented.

What can be found is a prototype, that was developed alongside the casestudy "Verwendung einer Lambda Architektur zurSensordatenverarbeitung und -aggregation für IoT-Anwendungen". It is implemented with such a Lambda Architecture. Some information about the project can be found below.

## Table of Contents
- [Our Project](#our-project)
- [Functional Requirements](#functional-requirements)
- [Nonfunctional Requirements](#nonfunctional-requirements)
- [Approach](#Generalized-Approach)
- [Architecture](#architecture)
- [Sequence Diagram](#sequence-diagram)


## Functional-Requirements: 
### Must-Have-Requirements:
<ins>Real time processing:</ins> The speed layer must save sensor measurements and compute aggregates of measurements in real time.

<ins>Historical data processing:</ins> The batch layer must sample data from the real-time measurements and aggregates. The computation creates minimums, maximums and averages over different time periods.

<ins>Sensor Connection:</ins> The system must function with the given GrovePi sensors. The present models are Temperature & Humdity, Water and Airquality. The sensors are connected to a Raspberry Pi. The sensor measurements must be collected by the Kafka server.

<ins>Data provision:</ins> The sensor data must be provisioned over an api. This makes it possible to integrate it in other applications or to display it in frontend solutions.

<ins>Data Usage:</ins> The sensor data is sent to a Kafka server and afterwards accessed via separate Apache Spark applications.

### Should-Have-Requirements

<ins>RabbitMQ integration:</ins> A bridge between the RabbitMQ message broker and the Kafka server is established. This way the sensors do not have to send to the Kafka server directly. Instead, the data gets sent from the message broker topics into the corresponding Kafka topics. This makes a simple integration of the new architecture in the existing Distributed Systems Lab (DSL) cluster environment possible.

<ins>Sensor visualization:</ins> The application also supports other sensor types. These can be virtualized with a prototypical application.

### Nice-To-Have-Requirements

<ins>Data visualization:</ins> An integration in the prometheus and grafana stack can be done. Then, measurements and aggregates can be displayed in various diagrams and dashboards.

## Nonfunctional-Requirements:
### Must-Have-Requirements
<ins>Lambda architecture:</ins> A Lambda Architecture must be used. This architecture consists of a batch, a speed and a serving layer.

<ins>Extensibility:</ins> Spark applications contain logic to compute sensor measurements or aggregates. The architecture revolves around creating new spark applications whenever new requirements arise.

<ins>Availibility:</ins> The application and its components should work correctly 99.9% of the time.

<ins>Scalability:</ins> The architecture must be scalable. Additional resources can be added in order to respond to higher workloads.

<ins>Statelessness:</ins> The applications must be stateless to enable a horizontal scaling.

<ins>Technologies:</ins> The usage of Spring Boot for the development, Kafka and Spark for the Lambda Architecture.

<ins>Data in spark:</ins> The data is split and accessed in separate spark applications for every data type.

<ins>Kubernetes:</ins> The applications are created for the DSL cluster of the htw-saar. Therefore, the architecture of the application and all software modules must be deployed in Kubernetes.

<ins>Externalized configuration:</ins> The application configuration must be externalized. Environment variables can be used for that. This enables the central management of all configurations over Kubernetes. Thus, making changes to entries like ports or addresses requires minimal time investment.

### Should-Have-Requirements
<ins>Performance:</ins> The aggregation of sensor data must take a maximum of 50ms under maximum load.

<ins>Other Technologies:</ins> MinIO should be used as the data storage

### Nice-To-Have-Requirements
<ins>Batch storage technology:</ins> Hadoop can be used for the storage in the batch layer.

## Generalized Approach
![Approach](https://i.imgur.com/odZokS9.png)

## Architecture
![Architecture](https://i.imgur.com/GzzAQj0.png)

## Sequence-Diagram
![Sequenz Diagram](https://i.imgur.com/pjPTn5w.png)
