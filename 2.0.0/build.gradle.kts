plugins {
    kotlin("multiplatform") version "2.0.0"
    kotlin("plugin.serialization") version "2.0.0"
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
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.7.0")
            }
        }

        commonTest {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.7.0")
                implementation(kotlin("test"))
            }
        }
    }
}