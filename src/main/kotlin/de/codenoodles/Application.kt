package de.codenoodles

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import de.codenoodles.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureSecurity()
        configureHTTP()
        configureSerialization()
    }.start(wait = true)
}
