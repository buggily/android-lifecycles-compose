object Dependency {
    object Compose {

        object Preview {
            const val IDENTITY = "androidx.compose.ui:ui-tooling:${Version.Compose.Preview.IDENTITY}"
            const val PREVIEW = "androidx.compose.ui:ui-tooling-preview:${Version.Compose.Preview.IDENTITY}"
        }

        const val UI = "androidx.compose.ui:ui:${Version.Compose.IDENTITY}"
        const val ACTIVITY = "androidx.activity:activity-compose:${Version.Compose.ACTIVITY}"
        const val VIEW_MODEL = "androidx.lifecycle:lifecycle-viewmodel-compose:${Version.Compose.VIEW_MODEL}"
    }
}