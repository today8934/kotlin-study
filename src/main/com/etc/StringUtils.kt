package main.com.etc

fun isDirectoryPath(path: String): Boolean {
    return path.endsWith("/")
}

fun String.lastChar(): Char {
    return this.last()
}