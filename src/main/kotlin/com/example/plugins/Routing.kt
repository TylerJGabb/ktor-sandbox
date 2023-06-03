package com.example.plugins

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.serialization.Serializable

@Serializable
data class Foo(val bar: String)

fun Application.configureRouting() {
    log.info("configuring routing")
    routing {
        get("/foo") {
            // https://ktor.io/docs/serialization.html#send_data
            call.respond(HttpStatusCode.OK, Foo("baz"))
        }
    }
}

