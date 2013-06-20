package org.volcra.jet.server

class WebServerTest extends GroovyTestCase {
    void testWebServer() {
        def server = new WebServer()
        server.start()
        server.stop()
    }
}