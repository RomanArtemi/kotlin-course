plugins {
    kotlin("jvm") version "2.2.21"
}

group = "kotlin.org.example.lessons.lesson04"
version = "1.0-SNAPSHOT"

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