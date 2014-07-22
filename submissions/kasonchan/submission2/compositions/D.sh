#!/bin/sh
unzip scala.zip -d scala && \
./scala/scala/bin/scalac D.scala && \
./scala/scala/bin/scala D outputB outputC outputD && \
rm -r scala *.class

