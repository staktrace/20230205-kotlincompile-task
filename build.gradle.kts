buildscript {
  repositories {
    mavenCentral()
  }

  dependencies {
    classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.20")
  }
}

apply<MyPlugin>()
