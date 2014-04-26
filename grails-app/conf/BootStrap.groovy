import com.source.music.Song

class BootStrap {

    def init = { servletContext ->
        Song anjana=Song.findByName('Woh Lamhe')
        if(!anjana){
            anjana =new Song(name: 'Woh Lamhe',album: 'Jal Pari',director: ' Mohit Suri',movie: 'Zeher a love story',singer: ' Atif Aslam',length: 4.12f,category: 'Hindi',releaseOn: 2014,logoName:'lamhe.png').save(failOnError: true)
        }
        Song duniya=Song.findByName('Kabhi Kabhie Mere Dil Mein')
        if(!duniya){
            duniya =new Song(name: 'Kabhi Kabhie Mere Dil Mein',album: ' Kabhi Kabhie',director: 'Khayyam ',movie: 'Kabhie Kabhie',singer: 'Mukesh',length: 3.12f,category: 'Hindi',releaseOn: 2014, logoName:'kabikabi.png').save(failOnError: true)
        }
        Song babyDoll=Song.findByName('Baby doll')
        if(!babyDoll){
            babyDoll =new Song(name: 'Baby doll',album: 'Ragini MMS 2',director: 'Meet Bros & Anjjan while',movie: 'Ragini MMS 2 (2014)',singer: ' Meet Bros, Anjjan, Kanika Kapoor, Kunal Avanti',length: 3.12f,category: 'Hindi',releaseOn: 2014, logoName:'raghinimms.png').save(failOnError: true)
        }
        Song khancharBhitor=Song.findByName('Khanchar Bhitor Achin Pakhi')
        if(!khancharBhitor){
            khancharBhitor =new Song(name: 'Khanchar Bhitor Achin Pakhi',album: 'Achin Pakhi',director: 'Fokir Lalon Shah',movie: 'Moner Manos',singer: ' Forida Parvin',length: 3.12f,category: 'Bengali',releaseOn: 2014, logoName: 'Khanchar.png').save(failOnError: true)
        }
    }
    def destroy = {

    }
}
