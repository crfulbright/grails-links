package grails.links

class LinkUser {

    String userName
    String userPassword
    String publicURL
    String privateURL
    String userLinkHomeID
    
    static constraints = {
    }
    
    //Corresponding test in /test/unit/grails/links/LinkUserTests.groovy
    String toString(){
        "$userName, $userPassword, $publicURL"
    }
    
}
