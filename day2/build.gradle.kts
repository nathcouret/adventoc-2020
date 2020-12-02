plugins {
    kotlin("jvm") version "1.4.20"
    application
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib"))
}

tasks.register<Copy>("copyResources") {
    from("src/main/resources")

    into({ destinationDir })
}

application {
    mainClassName = "adventoc.day2.AppKt"
}
