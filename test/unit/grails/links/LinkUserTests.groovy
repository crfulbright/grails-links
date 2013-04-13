package grails.links



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(LinkUser)
class LinkUserTests {

    void testToString() {
       def linkUser = new LinkUser(
          userName: 'TestUser',
          userPassword: 'Pass1234',
          publicURL: '/testPublicURL/',
          privateURL: '/testPrivateURL/',
          userLinkHomeID: '1234')
       assertEquals 'TestUser, Pass1234, /testPublicURL/', linkUser.toString()
    }
}
