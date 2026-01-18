plugins {
    kotlin("jvm") version "2.2.21"
}

group = "org.example.kotlin-course"
version = "0.8.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

kotlin {
    jvmToolchain(21)
}

tasks.test {
    useJUnitPlatform()
}