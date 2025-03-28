plugins {
    id("java")
}

repositories {
    mavenCentral()
}

dependencies {
	testImplementation(platform('org.junit:junit-bom:5.12.0'))
	testImplementation('org.junit.jupiter:junit-jupiter')
	testRuntimeOnly('org.junit.platform:junit-platform-launcher')
}

test {
	useJUnitPlatform()
	testLogging {
		events("passed", "skipped", "failed")
	}
}
