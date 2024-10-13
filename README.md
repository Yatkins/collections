# Collections

## Lab 9
### CountFamilies
1) Read values representing family income from the keyboard and store them in an ArrayList<double>
2) Keep reading until a negative number is entered for income
3) Find the maximum income among these values
4) Count the families that make less than 10 percent of this maximum income.
5) Display this count and the income of these families.

### Ledger
Create a class Ledger that will record the sales for a store. It should have the following methods:
1) addSales(d) - adds a sale whoes value is d
2) getNumberOfSales - returns the number of sales made
3) getTotalSales - returns the total value of the sales
4) getAverageSale() - returns the average value of all the sales
5) getCountAbove(v) - returns the number of sales that exceeded v in value

## HW 9
### CreatingHashMap
1) Write a program that uses a HashMap to compute a histogram of positive numbers entered by a user.
2) The HashPaps key should be the number that is entered, annd the value should be a counter of the number of times the key has been entered so far.
3) Use -1 as a sentinel value to signal the end of user input.

### FileToArrayList
1) Write a program that will read sentences from a text file, placing each sentence in its own instance of ArrayList.
(Create a sentence object by adding words to it one at a time as they are read.)
2) When a sentence has been completely read, add the sentence to another instance of ArrayList.
3) Once you have read the entire file, you will have an instance of ArrayList that contains several instances of ArrayList, one for each sentence read.
4) Ask the user to enter a sentence number and word number and return the word in the given position.
5) If the sentence number or word number is not valid, provide an appropriate error message.
