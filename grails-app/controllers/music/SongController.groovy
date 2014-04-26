package music

import com.source.music.Song
import grails.converters.JSON
import grails.rest.RestfulController

class SongController extends RestfulController {
    static allowedMethods = [search: "GET"]
    static responseFormats = ['json']


    def search() {
        String str = params.str
        def result = Song.findAllByNameIlikeOrAlbumIlikeOrMovieIlike("%${str}%", "%${str}%", "%${str}%")
        if(result == null) {
            render status:404
        }
        respond(result)
    }


}
