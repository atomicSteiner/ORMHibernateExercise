plugins {
    id("java")
}
group = "exercises"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:6.0.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation("org.hibernate.orm:hibernate-core:6.4.4.Final")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.3.0")
    implementation("org.springframework.boot:spring-boot-starter-web:3.3.0")
    runtimeOnly("com.h2database:h2:2.2.224")
}

tasks.test {
    useJUnitPlatform()
}