Jet
===

Jet is a very simple command line tool wrapping the Jetty API which primary focus is to use Jetty as a Web Server.

It uses Jetty 9 and only runs on the JVM 7.

## Quick Start

Download the binaries from [here](https://github.com/volcra/jet/releases/download/v0.1.2/jet-0.1.2.zip). Unzip it and add `JET_HOME` to your environment variables and then to the `PATH=$PATH;%JET_HOME%\bin`.

Run `jet .` to start a web server in the current directory o pass a location to start it.

```
$>jet .
Feb 22, 2015 10:04:07 AM org.eclipse.jetty.util.log.Log initialized
INFO: Logging initialized @1146ms
Feb 22, 2015 10:04:08 AM org.eclipse.jetty.server.Server doStart
INFO: jetty-9.2.8.v20150217
Feb 22, 2015 10:04:08 AM org.eclipse.jetty.server.AbstractConnector doStart
INFO: Started ServerConnector@5ded70df{HTTP/1.1}{0.0.0.0:8080}
Feb 22, 2015 10:04:08 AM org.eclipse.jetty.server.Server doStart
INFO: Started @1408ms
```

The command will start serving all content in the same directory. Access the site through <http://localhost:8080>.

To stop the server hit `CTRL+C`.

Get help 

```
$>jet -h
usage: jet [options] [directory]
Options
 -h,--help            Print Help.
 -p,--port <number>   The Web Server port number. Defaults to 8080

```

## Copyright and license

Copyright 2013 Volcra

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this work except in compliance with the License. You may obtain a copy of the License in the LICENSE file, or at:

<http://www.apache.org/licenses/LICENSE-2.0>

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
