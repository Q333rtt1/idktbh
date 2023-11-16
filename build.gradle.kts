plugins {
    kotlin("jvm") version "1.9.20"
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

val group = "<GROUP>" // e.g. me.qurti
val version = "<VERSION>" // e.g. 1.0

repositories {
    mavenCentral()
    maven { url = uri("https://repo.papermc.io/repository/maven-public") }
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.20-R0.1-SNAPSHOT")
    implementation(kotlin("stdlib"))
}

kotlin {
    jvmToolchain(17)
}