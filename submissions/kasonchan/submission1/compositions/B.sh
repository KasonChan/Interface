#!/bin/sh
unzip scala.zip -d scala && \
./scala/scala/bin/scalac B.scala && \
./scala/scala/bin/scala B outputA outputB && \
rm -r scala *.class

