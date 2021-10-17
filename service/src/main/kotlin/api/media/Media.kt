@file:OptIn(KtorExperimentalLocationsAPI::class)

package api.media

import io.ktor.application.call
import io.ktor.locations.KtorExperimentalLocationsAPI
import io.ktor.locations.Location
import io.ktor.locations.get
import io.ktor.response.respondText
import io.ktor.routing.Route
import io.ktor.routing.route

sealed class Type {
    @Location("/movies")
    class Movies : Type()
}

fun Route.moviesRoutes() {
    get<Type.Movies> { movies ->
        // todo
        call.respondText("all movies")
    }
}

fun Route.mediaRoutes() {
    route("/media") {
        moviesRoutes()
    }
}
