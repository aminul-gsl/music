package com.source.music

class Album {
    String name
    Long totalSong
    Long length
    Date releasedDate
    static hasMany = [song: Song]
    static constraints = {
        name(nullable: false)
        totalSong(nullable: false)
        length(nullable: false)
        releasedDate(nullable: false)
    }
}
