package com.source.music

class Movie {
    String name
    static hasMany = [song:Song]
    static constraints = {
    }
}
