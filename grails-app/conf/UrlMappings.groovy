class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
//        "/song/search/$searchValue"(controller: "song", action: "search")
        "/"(view:"/index")
        "500"(view:'/error')
	}
}
