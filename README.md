## Asg4 Bug Report

@author: hello@tawan.org

#### Bug 1: Incorrect calculation of fines.
When a book becomes overdue by one day, no fine is imposed.

UAT: When a book becomes overdue fine is imposed by day multiple by fine per day.

Debugging: overduefine calculation incorrectly due time calculation incorrectly.

:rocket: Fixed: https://github.com/tawanorg/CSU-Assessment-item-4---Debugging/commit/d52b6bfe97662480a53e15fe6455d9960a5339fa

:white_check_mark: Unit Test: https://github.com/tawanorg/CSU-Assessment-item-4---Debugging/blob/master/test/CalendarTest.java

---

#### Bug 2: Incorrect fine amount levied.
When a fine is incurred, the amount of fine reported is half the amount intended.

UAT: When a fine is incurred, the amount of fine reported is half the amount intended.

Debugging: this problem linked to first bug, time calculation is incorrectly.

:rocket: Fixed: https://github.com/tawanorg/CSU-Assessment-item-4---Debugging/commit/d52b6bfe97662480a53e15fe6455d9960a5339fa

:white_check_mark: Unit Test: https://github.com/tawanorg/CSU-Assessment-item-4---Debugging/blob/master/test/LibraryTest.java

