package com.example

import com.example.plugins.configureRouting
import com.example.plugins.configureSerialization
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(Netty, port = 8080, module = Application::ApplicationModule).start(wait = true)
}

fun Application.ApplicationModule() {
    // https://ktor.io/docs/serialization.html
    // https://stackoverflow.com/questions/71988144/serializer-for-class-is-not-found-mark-the-class-as-serializable-or-prov
    configureRouting()
    configureSerialization()
}

