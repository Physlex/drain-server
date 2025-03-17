FROM ubuntu:latest AS root

# Sync the ubuntu image
RUN apt-get update && apt-get -y install curl zip openjdk-21-jdk

# Fetch sdkman from command, to install gradle
RUN curl -s "https://get.sdkman.io" | bash

# Set the working directory
WORKDIR /drain/

# Now send the mod to some well-defined location
COPY ./settings.gradle.kts /drain/
COPY ./build.gradle.kts /drain/
