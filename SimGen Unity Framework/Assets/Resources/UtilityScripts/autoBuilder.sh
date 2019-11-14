#!/bin/bash
if [ "$1" = "true" ]; then
  echo "----------------------------------------------------------------------------------------------------------" >> $5
  /Applications/Unity/Unity.app/Contents/MacOS/Unity -batchmode -nographics -quit projectPath=$2 $3 $4 -logFile >> $5
fi
if [ "$1" = "false" ]; then
  echo "----------------------------------------------------------------------------------------------------------" >> $5
  /Applications/Unity/Unity.app/Contents/MacOS/Unity -batchmode -quit projectPath=$2 $3 $4 -logFile >> $5
fi
