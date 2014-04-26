package com.source.music

class Singer {
    String name
    String address
    static  hasMany = [album:Album,song:Song]
    static constraints = {
    }
}
