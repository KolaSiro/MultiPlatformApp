package ch.muellner.multiplatformapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform