# Spark Demo
## Installation Spark-Operator
Follow the installation guide:
https://github.com/GoogleCloudPlatform/spark-on-k8s-operator

Do the deployment of the chart:

`kubectl create namespace spark-jobs`

`helm repo add spark-operator https://googlecloudplatform.github.io/spark-on-k8s-operator`

`helm install my-spark-operator spark-operator/spark-operator
--namespace spark-operator
--create-namespace
--set sparkJobNamespace=spark-jobs`

## What to do:
* Build and push to DockerHub
  * `mvn clean package`
  * `docker build -t xwoodpecker/my-spark-image .`
  * `docker push xwoodpecker/my-spark-image`
* Deploy the SparkApplication
  * `cd C:\Users\WoodPecker\IdeaProjects\spark-demo\k8s`
  * In `spark-pi.yaml` file, modify the image name and the serviceAccount
  * For the image name, just use your docker name and image you used before
  * For the serviceAccount: `kubectl get serviceaccount -n spark-jobs`
  * `kubectl apply -f spark-pi.yaml`
* Check if the driver started and look at the logs
  * `kubectl get pods -n spark-jobs`
  * `kubectl logs spark-pi-driver -n spark-jobs`

## Installation Spark-Standalone
First install Spark on the Kubernetes cluster with the following helm chart: <br />
`helm install my-spark bitnami/spark`

## spark-submit

`./bin/spark-submit` <br />
`--master k8s://https://134.96.216.207:6443` k8s api server <br />
`--deploy-mode cluster ` <br />
`--name spark-pi ` same as app name <br />
`--class org.apache.spark.examples.SparkPi `<br />
`--conf spark.executor.instances=1` default -> 5 <br />
`--conf spark.kubernetes.container.image=jan0912/latest-sparktest `<br />
`local:///opt/spark/app/jars/demo.jar`

compacted:\
`./bin/spark-submit --master k8s://https://134.96.216.207:6443 --deploy-mode cluster --name spark-pi --class org.apache.spark.examples.SparkPi --conf spark.executor.instances=1 --conf spark.kubernetes.container.image=jan0912/latest-sparktest local:///opt/spark/app/jars/demo.jar`

# Encountered Errors
* Issues with JavaOptions <br />
  -> just delete JavaOptions
* Hadoop Win Problem: https://cwiki.apache.org/confluence/display/HADOOP2/WindowsProblems
