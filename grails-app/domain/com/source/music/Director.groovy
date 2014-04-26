package com.source.music

class Director {
    String name
    String address
    static  belongsTo = [album:Album]
    static constraints = {
    }
}
