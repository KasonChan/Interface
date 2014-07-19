#!/bin/sh
unzip scala.zip -d scala && \
./scala/scala/bin/scalac C.scala && \
./scala/scala/bin/scala C outputA outputC && \
rm -r scala *.class
