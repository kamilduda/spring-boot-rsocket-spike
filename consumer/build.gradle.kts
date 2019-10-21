plugins {
    id("org.springframework.boot") version "2.2.0.RELEASE"
    kotlin("plugin.spring") version "1.3.50"
    id("io.spring.dependency-management") version "1.0.8.RELEASE"
}

dependencies {
    implementation(project(":common"))

    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation("org.springframework.boot:spring-boot-starter-rsocket") {
        exclude( module = "spring-boot-starter-tomcat")
    }
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

    compile("org.springframework.boot:spring-boot-starter-actuator")
    compile("io.github.microutils:kotlin-logging:1.7.6")

    developmentOnly("org.springframework.boot:spring-boot-devtools")

    // use Unit 5
    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
        exclude(group = "junit", module = "junit")
    }

    testImplementation("io.projectreactor:reactor-test")
}
