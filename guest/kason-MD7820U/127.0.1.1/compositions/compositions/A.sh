#!/bin/sh
scalac A.scala && \
scala A inputA outputA && \
rm *.class
