package grails.links

class LinkEntry {

    String linkURL
    Boolean activeInd
    String linkType
    Date dateAdded
    Date dateModified
    Date dateDeleted

    static constraints = {
    }
    
    //Corresponding test in /test/unit/grails/links/LinkEntryTests.groovy
    String toString(){
        "$linkURL, $linkType"
    }
    
}
