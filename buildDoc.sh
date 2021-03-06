#!/bin/bash
rm README.md
touch README.md

FILES=./problems/*
printf "<h1>These are the solved problems</h1>\n\n" >> README.md
for file in $FILES
do
	echo $(basename $file) >> README.md
	printf "\n" >> README.md
done

printf "\n<h1>These are som well-known algoritms, implemented in Java</h1>\n\n" >> README.MD
ALGOFILES=./Algos/*
for file in $ALGOFILES
do
        echo $(basename $file) >> README.md
	printf "\n" >> README.md
done

printf "\n<h1>These are som well-known data structures, implemented in Java</h1>\n\n" >> README.MD
DATASTRUC=./DataStruc/*
for file in $DATASTRUC
do
        echo $(basename $file) >> README.md
	printf "\n" >> README.md
done
echo "README.md is generated and updated"
