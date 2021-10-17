package api

import api.media.mediaRoutes
import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.application.install
import io.ktor.locations.Locations
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.route
import io.ktor.routing.routing

fun Application.module() {
    install(Locations)

    routing {
        route("/api") {
            route("/v1") {
                mediaRoutes()
            }
        }
        get("/") {
            call.respondText("media center POC")
        }
    }
}
