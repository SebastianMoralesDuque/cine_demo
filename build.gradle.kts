plugins {
	java
	id("org.springframework.boot") version "3.1.5"
	id("io.spring.dependency-management") version "1.1.3"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
    runtimeOnly ("org.mariadb.jdbc:mariadb-java-client:2.7.3")
    compileOnly ("org.projectlombok:lombok")
    annotationProcessor ("org.projectlombok:lombok")
    implementation ("org.springframework.boot:spring-boot-starter-data-jpa")
	testImplementation ("org.junit.jupiter:junit-jupiter-api:5.7.2")
    testRuntimeOnly ("org.junit.jupiter:junit-jupiter-engine:5.7.2")			
}

tasks.withType<Test> {
	useJUnitPlatform()
}
