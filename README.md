Jet
===

Jet is a very simple command line tool wrapping the Jetty API which primary focus is to use Jetty as a Web Server.

It uses Jetty 9 and only runs on the JVM 7.

## Quick Start

Binaries will be soon available. In the mean time you can download the project and build by using Gradle. The project comes with the Gradle Wrapper, if you have Java 7 then you are ready to build.

Download the code and execute

```
gradlew installApp
```

This will create the jet scripts under build\install\jet\bin\jet. Execute this shell to start a Web Server.

```
build\install\jet\bin .
Jun 20, 2013 2:05:41 PM org.eclipse.jetty.server.Server doStart
INFO: jetty-9.0.3.v20130506
Jun 20, 2013 2:05:41 PM org.eclipse.jetty.server.AbstractConnector doStart
INFO: Started ServerConnector@6645f1ca{HTTP/1.1}{0.0.0.0:8080}
Hit enter to stop
```

The command will start serving all content in the same directory. Access the site through <http://localhost:8080>.

To stop the server hit `ENTER`.

## Copyright and license

Copyright 2013 Volcra

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this work except in compliance with the License. You may obtain a copy of the License in the LICENSE file, or at:

<http://www.apache.org/licenses/LICENSE-2.0>

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
