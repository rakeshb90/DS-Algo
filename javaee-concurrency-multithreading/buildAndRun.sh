#!/bin/sh
mvn clean package && docker build -t javaee-concurrency/javaee-concurrency-multithreading .
docker rm -f javaee-concurrency-multithreading || true && docker run -d -p 8080:8080 -p 4848:4848 --name javaee-concurrency-multithreading javaee-concurrency/javaee-concurrency-multithreading 
