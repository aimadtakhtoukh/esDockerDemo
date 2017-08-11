#!/usr/bin/env bash

mvn clean install
docker-compose down
docker-compose rm -f
docker-compose build
docker-compose up