import org.gradle.api.JavaVersion

object Version {

    const val CODE = 1
    const val NAME = "1.0.0"

    val JAVA: JavaVersion = JavaVersion.VERSION_1_8

    object Compose {
        object Preview {
            const val IDENTITY = "1.1.1"
        }

        const val IDENTITY = "1.3.0-alpha01"
        const val COMPILER = "1.2.0"
        const val ACTIVITY = "1.6.0-alpha05"
        const val VIEW_MODEL = "2.6.0-alpha01"
    }
}
