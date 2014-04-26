package com.source.music

class SongCategory {
                    // a song may be bengali/english/hindi or others category
    String name
    static belongsTo = [song:Song]
    static constraints = {
    }
}
