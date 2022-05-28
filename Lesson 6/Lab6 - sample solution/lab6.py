# Lab6.py
# Ee Von Ng & YeongHeon Kim

def print_table_kg_to_lb():
    """Converts weight in kilograms (kg) to pounds (lb), and displays a table of weight in kg in increments of 10, from
    30 to 100 kgs, with the corresponding weight in lbs up to 2 digits after the decimal point.
    """
    for weight_kg in range(30, 101, 10):
        print("weight in Kilos:    " + str(weight_kg) + " is " + str("{:.2f}".format(weight_kg * 2.2)) +
              " in Pounds")
    return


def input_numbers_print_divisible():
    """Evaluates 3 input numbers (1st number, 2nd number, divisor) and provides output based on criteria described
    below.
    :return:
    If 1st number < 2nd number, displays all numbers between 1st and 2nd inclusive that are divisible by divisor.
    If 1st number > 2nd number, displays all numbers between 1st and 2nd that are divisible by the given divisor
    in descending order.
    If divisor is 0, returns error message and terminates function.
    """
    first_number = int(input("enter first number: "))
    second_number = int(input("enter second number: "))
    divisor = int(input("enter divisor: "))

    list_descending_order = []

    if divisor == 0:
        print("the divisor cannot be 0")
    elif first_number < second_number:                    # checks that 1st number is less than 2nd number
        for num in range(first_number, second_number + 1):
            if num % divisor == 0:
                print(num)                                # prints all numbers in range divisible by divisor
    elif first_number > second_number:                    # checks that 1st number is greater than 2nd number
        for num in range(second_number, first_number + 1):
            if num % divisor == 0:
                list_descending_order.append(num)         # adds all numbers in range divisible by divisor to list
        list_descending_order.sort(reverse=True)          # sorts list in descending order
        print(list_descending_order)


def input_numbers_print_analysis():
    """gets user-input for positive integers and prints a list of integers also prints: length of list, number of even numbers, minimum and
    maximum values.
    :return: nothing
    """
    positive_integers = []

    while True:                                                      # while loop to evaluate user input
        check_integer = input("enter a positive integer: ")
        if check_integer == " ":                                     # breaks if space is entered
            break
        elif not check_integer.isdigit() or int(check_integer) < 0:  # ignores if input is not integer or less than 0
            continue
        else:                                                        # adds input to list if positive integer
            list_positive_integer.append(int(check_integer))

    print(list_positive_integer)                                     # prints list of positive integers from user input

    print("The number of positive integers is: " +                   # prints length of list of positive integers
          str(len(list_positive_integer)))

    num_even_numbers = 0
    for num in list_positive_integer:                                # for loop to evaluate total even numbers in list
        if num % 2 == 0:
            num_even_numbers += 1
    print("The number of even numbers is: " + str(num_even_numbers))

    max_num = list_positive_integer[0]
    for num in list_positive_integer:                                # for loop to print max from list_positive_integer
        if num > max_num:
            max_num = num
    print("The maximum number entered is: " + str(max_num))

    min_num = list_positive_integer[0]
    for num in list_positive_integer:                                # for loop to print min from list_positive_integer
        if num < min_num:
            min_num = num
    print("The minimum number entered is: " + str(min_num))


def determine_total_pay_usd(num_employees, hourly_pay_usd):
    """Calculates the total pay in USD for each employee based on input hours worked.
    If an employee worked 40 hours or less, pay rate is number of hours times the hourly rate in USD.
    If an employee worked more than 40 hours, pay rate is 1.5 for the hours over 40 hours.
    :param num_employees: number of employees
    :param hourly_pay_usd: hourly pay in US for employees
    :return: nothing
    """
    pay_information = []

    for pay_info in range(num_employees):
        hours_worked = int(input("input the number of worked hours: "))

        if int(hours_worked) <= 40:                      # calculates total pay of each employee when hours worked <= 40
            total_pay_usd = hours_worked * hourly_pay_usd
        elif int(hours_worked) > 40:                     # calculates total pay of each employee when hours worked > 40
            # total pay is 1.5 times standard rate for each hour over 40
            total_pay_usd = 40 * hourly_pay_usd + ((hours_worked-40) * hourly_pay_usd * 1.5)
        else:
            return

        list_pay_information.append([hours_worked, total_pay_usd])

    for employee_pay in list_pay_information:
        print("the employee worked for " + str(employee_pay[0]) +
              " hours and earned " + "{:.2f}".format(employee_pay[1]) + " $")


def is_prime(positive_number):
    """Evaluates if an input number is a prime number.
    :param positive_number: Number to evaluate
    :return: True if number is a prime number, False otherwise
    """
    if positive_number > 1:
        for i in range(2, positive_number):
            if (positive_number % i) == 0:
                return False
        return True
    else:
        return False

def display_prime_numbers_to(maximum):
    """Generates and prints a list of integers from 2 to the given number inclusive, and displays all prime numbers in the list.
    :param maximum: maximum number of range of integers
    :return: nothing
    """
    integers = []

    if int(maximum) > 2:
        for num in range(2, maximum + 1):
            list_integers.append(num)
        print(list_integers)

        for num in list_integers:
            if is_prime(num):
                print("the number " + str(num) + " is a prime number")
    else:
        print("you must enter a positive number larger than 2")


def main():
    print_table_kg_to_lb()
    input_numbers_print_divisible()
    input_numbers_print_analysis()

    number_of_employees = int(input("enter number of employees: "))
    hourly_rate_usd = int(input("enter employee hourly rate in USD: "))
    determine_total_pay_usd(number_of_employees, hourly_rate_usd)

    integer_to_eval = int(input("enter a positive number greater than 2: "))
    display_prime_numbers_to(integer_to_eval)


if __name__ == '__main__':
    main()
