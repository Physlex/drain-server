#!/bin/bash

# Shut down the previous orchestration

echo "Shutting down previous build"
sudo docker compose down -v
if [ $? -eq 0 ]; then
    echo "Previous build shut down properly"
else
    echo "Failed to shut down previous build"
    exit 1
fi

# build the base image necessary for shared compilation

echo "Building drain-server image"
sudo docker build -t drain-server .
if [ $? -eq 0 ]; then
    echo "Built image succesfully"
else
    echo "Failed to build image"
    exit 1
fi

# Build the rest of the system

sudo docker compose up --build -d
exit 0
