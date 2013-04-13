package grails.links

class LinkUserHome {

    String category

    static constraints = {
    }
    
    //Corresponding test in /test/unit/grails/links/LinkUserHomeTests.groovy
    String toString(){
        "$category"
    }
    
}
