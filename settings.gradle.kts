rootProject.name = "drain-server"
include("src-mod")

pluginManagement {
    repositories {
        maven {
            name="Fabric"
            url=uri("https://maven.fabricmc.net/")
        }
        gradlePluginPortal()
        mavenCentral()
    }
}
