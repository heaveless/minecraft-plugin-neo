plugins {
    id("org.jetbrains.kotlin.jvm") version "1.8.20"
    application
}

repositories {
    mavenCentral()
    maven {
        url = uri("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    }
}

dependencies {
    compileOnly("org.spigotmc:spigot-api:1.20.1-R0.1-SNAPSHOT")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

application {
    mainClass.set("neo.AppKt")
}
