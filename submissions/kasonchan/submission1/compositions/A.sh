#!/bin/sh
unzip scala.zip -d scala && \
./scala/scala/bin/scalac A.scala && \
./scala/scala/bin/scala A inputA outputA && \
rm -r scala *.class
