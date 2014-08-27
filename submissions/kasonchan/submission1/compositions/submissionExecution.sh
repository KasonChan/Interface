
echo *****START ./interface.sh

cd $1
./interface.sh

if [ $? -eq 0 ]; then
  echo "Execution was successful"
else
  echo "Execution was not successful"
fi

echo *****END ./interface.sh
