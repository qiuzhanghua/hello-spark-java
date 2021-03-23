plugins {
    application
    id("com.github.johnrengelman.shadow") version "6.1.0"
}


repositories {
    jcenter()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    implementation("com.google.guava:guava:30.1.1-jre")
    compileOnly("org.apache.spark:spark-sql_2.12:3.1.1")
}

application {
    // Define the main class for the application.
    // mainClass.set("com.example.App")
    mainClassName= "com.example.App"
}

tasks.test {
    // Use junit platform for unit tests.
    useJUnitPlatform()
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

tasks.withType<JavaCompile> {
}