import org.gradle.api.JavaVersion

object Version {

    const val CODE = 1
    const val NAME = "1.0.0"

    val JAVA: JavaVersion = JavaVersion.VERSION_1_8

    object Compose {
        const val IDENTITY = "1.1.1"
        const val COMPILER = "1.2.0"

        const val ACTIVITY = "1.3.0"
        const val VIEW_MODEL = "2.5.0"
    }
}
