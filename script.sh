#!/bin/bash
echo Hello World!
rm README.md
touch README.md

FILES=./problems/*
printf "These are the solved problems\n\n" >> README.md
for file in $FILES
do
	echo $(basename $file) >> README.md
done

printf "\nThese are som well-know algoritms, implemented in Java\n\n" >> README.MD
ALGOFILES=./Algos/*
for file in $ALGOFILES
do
        echo $(basename $file) >> README.md
done

