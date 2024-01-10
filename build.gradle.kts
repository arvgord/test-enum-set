plugins {
    kotlin("jvm") version "1.9.21"
    id("me.champeau.jmh") version "0.7.2"
}

group = "com.arvgord"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.openjdk.jmh:jmh-core:1.37")
    annotationProcessor("org.openjdk.jmh:jmh-generator-annprocess:1.37")
}