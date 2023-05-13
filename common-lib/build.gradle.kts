dependencies {
    testImplementation("org.springframework.restdocs:spring-restdocs-mockmvc")
}

tasks.register<Jar>("testJar") {
    from(sourceSets.test.get().output)
    archiveClassifier.set("tests")
}

configurations {
    create("testOutput")
}

artifacts {
    add("testOutput", tasks["testJar"])
}
