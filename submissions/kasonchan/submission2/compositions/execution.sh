#!/bin/sh
# File: execution.sh
# Created Date: June 26, 2014
# Programmer: Ka-Son Chan kason.chan@ttu.edu
# Description: This file contains execution script while connecting to the nodes.

# Print user name, hostname and date
echo "$USER@`hostname` execution.sh `date`"

./ABCD.sh

nanosecond=`expr 1 / 1000000000`

# Wait for the result
while [ ! -f outputD ];
do
  sleep $nanosecond
done
