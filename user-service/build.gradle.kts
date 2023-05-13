dependencies {
    implementation(project(":common-lib"))
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")

    testImplementation(project(path = ":common-lib", configuration = "testOutput"))

    // MySQL
    runtimeOnly("com.mysql:mysql-connector-j")
}
