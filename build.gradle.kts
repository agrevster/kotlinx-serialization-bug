plugins {
    kotlin("multiplatform") version "1.9.10"
    kotlin("plugin.serialization") version "1.9.10"
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
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.0")
            }
        }

        commonTest {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.0")
                implementation(kotlin("test"))
            }
        }
    }
}