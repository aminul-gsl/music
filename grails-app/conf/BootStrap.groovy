import com.source.music.Song

class BootStrap {

    def init = { servletContext ->
        Song anjana=Song.findByName('anjana')
        if(!anjana){
            anjana =new Song(name: 'anjana',album: 'xyz',director: 'kamal',movie: 'iron man',singer: 'rahim',length: 4.12f,category: 'eng').save(failOnError: true)
        }
        Song duniya=Song.findByName('Yara is Duniya')
        if(!duniya){
            duniya =new Song(name: 'Yara is Duniya',album: 'xyz',director: 'kamal',movie: 'iron man',singer: 'rahim',length: 3.12f,category: 'eng').save(failOnError: true)
        }
        Song babyDoll=Song.findByName('Baby doll')
        if(!babyDoll){
            babyDoll =new Song(name: 'Baby doll',album: 'xyz',director: 'kamal',movie: 'iron man',singer: 'rahim',length: 3.12f,category: 'eng').save(failOnError: true)
        }
    }
    def destroy = {
    }
}
