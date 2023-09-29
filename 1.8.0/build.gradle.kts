plugins {
    kotlin("multiplatform") version "1.8.0"
    kotlin("plugin.serialization") version "1.8.0"
}

group = "io.github.agrevster"
version = "1.0"

repositories {
    mavenCentral()
}

kotlin {
    macosArm64()
    jvm()
    macosX64()

    sourceSets{
        commonMain {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.1")
            }
        }

        commonTest {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.1")
                implementation(kotlin("test"))
            }
        }
    }
}