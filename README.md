# 6-Digit-Password-Randomizer
This program is as simple as it sounds; it automatically generates a random 6-digit output consisting of letters, numbers and special characters, making it an ideal way to randomize something such as a password! The program makes use of arrays to store all the potential characters, and modules that will discussed below.
# Modules
randomizer(String[] arr)                    : Takes an array as a parameter, then returns a random element from the array using the Random class.

ordershuffle(String string)          : Uses a string as a parameter and shuffles the characters using the Fisher-Yates shuffle algorithm.

generator() and generator1()  : Both of these methods use the randomizer method and combine them into a password, before using the ordershuffle method to shuffle the password characters' positions.

main(String[] args)                         : Finally, the main method prints the output by calling the generator methods before beginning a loop asking whether or not the user wants to generate another password or not.

# Overview
Here is a brief overview on how the program works 
<img width="185" alt="random1" src="https://user-images.githubusercontent.com/126550095/224322408-92598f15-83fb-40ee-b613-c4b82b91e170.png">
Once the user runs the program, it immediately presents them with a random 6-digit string consisting of the aforementioned characters.
