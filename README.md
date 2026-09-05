# Lab Task 03 - JUnit Unit Testing 


## Course Information
* **Course:** Software Construction (5th Semester Software Engineering)
* **Institution:** University of Engineering and Technology, Abbottabad Campus

## Objective
The objective of this lab is to introduce unit testing in Java using the JUnit framework within the NetBeans IDE. The focus is on creating Java classes, writing comprehensive unit tests for class methods, and interpreting automated test execution results.

## Implemented Tasks

### Task 1: Temperature Converter (`TemperatureConverter.java`)
Implemented conversion formulas between Celsius, Fahrenheit, and Kelvin:
* `celsiusToFahrenheit(double c)`
* `fahrenheitToCelsius(double f)`
* `celsiusToKelvin(double c)`

**Unit Tests (`TemperatureConverterTest.java`):**
* Verified known conversion pairs (e.g., 0°C → 32°F, 100°C → 212°F, 0°C → 273.15 K).
* Validated round-trip consistency ($C \rightarrow F \rightarrow C$).
* Asserted precision using `assertEquals(expected, actual, delta)`.
* 
### Task 2: Bank Account Operations (`BankAccount.java`)
Implemented basic banking transactions and invariant handling:
* `deposit(double amt)`
* `withdraw(double amt)`
* `getBalance()`

**Unit Tests (`BankAccountTest.java`):**
* Verified positive deposit increases balance.
* Verified valid withdrawal decreases balance.
* Verified `IllegalStateException` on overdraft (withdraw beyond balance).
* Verified `IllegalArgumentException` on negative deposit amount.
* ### Task 3: String Utility Palindrome Checker (`StringUtil.java`)
Implemented string evaluation logic:
* `isPalindrome(String s)`

**Unit Tests (`StringUtilTest.java`):**
* Verified standard lowercase palindromes (e.g., `"madam"`).
* Verified case-insensitive palindromes (e.g., `"RaceCar"`).
* Verified non-palindrome strings (e.g., `"hello"`).
* Verified edge cases for `null` and empty strings (`""`).

   
