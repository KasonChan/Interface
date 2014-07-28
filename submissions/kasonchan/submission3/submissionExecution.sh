echo *****START ./interface.sh

cd $1
./interface.sh $2 $3 $4 $5 $6

if [ $? -eq 0 ]; then
  echo "Execution was successful"
else
  echo "Execution was not successful"
fi

echo *****END ./interface.sh
