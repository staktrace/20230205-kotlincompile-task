import org.gradle.api.Project
import org.gradle.api.Plugin

class MyPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.afterEvaluate {
            project.subprojects {
                val subproject = this.project
                with(subproject) {
                    pluginManager.withPlugin("org.jetbrains.kotlin.jvm") {
                        // Since the org.jetbrains.kotlin.jvm plugin has been applied, we should always be able to get a
                        // KotlinCompile class. But the next line fails, why?
                        // Class.forName("org.jetbrains.kotlin.gradle.tasks.KotlinCompile") also fails here
                        tasks.withType(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class.java).configureEach {
                            kotlinOptions {
                                jvmTarget = "17"
                            }
                        }
                    }
                }
            }
        }
    }
}
