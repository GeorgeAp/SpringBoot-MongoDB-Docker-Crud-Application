# SpringBoot-MongoDB-Docker-Crud-Application
A CRUD application using Spring Boot, MongoDB, Docker and Kubernetes

# Requirements
Docker, Minikube and Kubernetes

# Execute the application 
docker login

docker push gapaa/spring-mongodb-crud-application

# Deploy on Kubernetes
minikube start

minikube dashboard

cd K8S/mongodb

kubectl create -f mongo-service.yml

kubectl create -f mongo-controller.yml

cd K8s

kubectl create -f deployment.yml

kubectl create -f service.yml

kubectl describe service spring-mongodb-crud-application

minikube service spring-mongodb-crud-application

this will launch the application in your browser

Finally, to stop, use:
minikube stop
