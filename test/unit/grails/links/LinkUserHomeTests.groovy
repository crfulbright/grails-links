package grails.links



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(LinkUserHome)
class LinkUserHomeTests {

    void testToString() {
       def linkUserHome = new LinkUserHome(
          category: 'News')
       assertEquals 'News', linkUserHome.toString()
    }
}
