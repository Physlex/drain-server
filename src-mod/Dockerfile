FROM drain-base:latest AS mod

RUN apt-get update

# Copy source files into the docker environment
COPY ./src-mod/ /drain/src-mod/

# Change to the work directory
WORKDIR /drain/

# Run sdkman shell to build the binaries (jar file)
SHELL ["/bin/bash", "-c"]
RUN source "$HOME/.sdkman/bin/sdkman-init.sh" \
    && sdk install gradle 8.12 \
    && gradle build

# TODO: Place the binary into the mod directory, for the server
# COPY <something> /drain/mods/
