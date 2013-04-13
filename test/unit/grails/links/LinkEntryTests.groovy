package grails.links



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(LinkEntry)
class LinkEntryTests {
    
    void testToString() {
       def linkEntry = new LinkEntry(
          linkURL: 'www.cnn.com',
          linkType: 'public')
       assertEquals 'www.cnn.com, public', linkEntry.toString()
    }
    
}
