@file:OptIn(KtorExperimentalLocationsAPI::class)

package api.libraries

import io.ktor.application.call
import io.ktor.locations.KtorExperimentalLocationsAPI
import io.ktor.locations.Location
import io.ktor.locations.get
import io.ktor.response.respondText
import io.ktor.routing.Route
import io.ktor.routing.get

@Location("/libraries/{id}")
data class Library(val id: String)

fun Route.libraries() {
    get("/libraries") {
        call.respondText("all libraries")
    }
    get<Library> {
        call.respondText("individual library")
    }
}
