# Print user name, hostname and date
echo "$USER@`hostname` interface.sh `date`"

# Get source directory/files
sourceDirectoryFiles="compositions"

# Get destination username and host
destinationUsername=$1
destinationHost=$2
destinationUsernameAndHost="$destinationUsername@$destinationHost"

# Get destination password
destinationPassword=$3

# Get destination directory/files
destinationDirectoryFiles=$4

# Get result files
resultDirectoryFiles=$5

# Start time in second
START=$(date +%s.%N)

# Send source directory/files to destination directory/files using scp
echo "$destinationPassword" | ./sshaskpass.sh scp -r "$sourceDirectoryFiles" "$destinationUsername@$destinationHost:/$destinationDirectoryFiles"

# Go to the source directory/files
goToSourceDirectory="$sourceDirectoryFiles"

# Login destination go to the source directory and execute execution script
echo "$destinationPassword" | ./sshaskpass.sh ssh $destinationUsernameAndHost "cd $sourceDirectoryFiles; ./execution.sh;"

# If the execution is successful
if [ $? -eq 0 ]; then
  # Send resultDirectoryFiles from destination back to source directory/files using scp
  echo "$destinationPassword" | ./sshaskpass.sh scp -r "$destinationUsername@$destinationHost:/$destinationDirectoryFiles/$sourceDirectoryFiles/$resultDirectoryFiles" "$PWD"

  # End time in second
  END=$(date +%s.%N)

  # Print execution time
  DIFF=$(echo "$END - $START" | bc)
  echo "$DIFF seconds"
else
  # End time in second
  END=$(date +%s.%N)

  # Print execution time
  DIFF=$(echo "$END - $START" | bc)
  echo "$DIFF seconds"
fi

# Login destination and remove the directory
echo "$destinationPassword" | ./sshaskpass.sh ssh $destinationUsernameAndHost "rm -r $sourceDirectoryFiles"
