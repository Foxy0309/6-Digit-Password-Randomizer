# 6-Digit-Password-Randomizer
This program is as simple as it sounds; it automatically generates a random 6-digit output consisting of letters, numbers and special characters, making it an ideal way to randomize something such as a password! The program makes use of arrays to store all the potential characters, and modules that will discussed below.
# Modules
randomizer(String[] arr)                    : Takes an array as a parameter, then returns a random element from the array using the Random class.
String ordershuffle(String string)          : Uses a string as a parameter and shuffles the characters using the Fisher-Yates shuffle algorithm.
String generator() and String generator1()  : This method uses the randomizer method to select a random character from each array and combine them into a password, before using the ordershuffle method to shuffle the password characters.
