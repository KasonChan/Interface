
# Print user name, hostname and date
echo "$USER@`hostname` interface.sh `date`"

# Start time in nanosecond
START=$(date +%s.%N)

# Execute the execution script
./execution.sh

# End time in nanosecond
END=$(date +%s.%N)

# Print execution time
DIFF=$(echo "$END - $START" | bc)
echo "$DIFF nanoseconds"

# Clean up compiled codes
make clean

