FROM ubuntu:latest AS drain-base

# Sync the ubuntu image
RUN apt-get update && apt-get -y install curl zip openjdk-21-jdk

# Fetch sdkman from command, to install gradle
RUN curl -s "https://get.sdkman.io" | bash

# Set the working directory
WORKDIR /drain/

# Now send the mod to some well-defined location
COPY ./settings.gradle.kts /drain/
COPY ./build.gradle.kts /drain/

# SERVER-SPECIFIC

FROM drain-base AS drain-server

COPY ./src-server/fabric-server-launch.jar /drain/src-server/
COPY ./src-server/libraries/ /drain/src-server/libraries/
COPY ./src-server/server.jar /drain/src-server/
COPY ./src-server/eula.txt /drain/src-server/

WORKDIR /drain/src-server/

EXPOSE 25565

CMD ["java", "-Xmx4G", "-jar", "/drain/src-server/fabric-server-launch.jar", "nogui"]
# CMD ["ls"]
