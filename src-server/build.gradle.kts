plugins {
    id("fabric-loom") version "1.10-SNAPSHOT"
}

loom {
}

dependencies {
    "minecraft"("com.mojang:minecraft:1.21.1")
    "mappings"("net.fabricmc:yarn:1.21.1+build.3:v2")
    "modImplementation"("net.fabricmc:fabric-loader:0.16.10")
    "modImplementation"("net.fabricmc.fabric-api:fabric-api:0.115.1+1.21.1")
}
