from bank_account import BankAccount

def main():
    b1 = BankAccount(100.00, "abc123", "gates")
    b2 = BankAccount(500.00, "xyz789", "woods")

    print(b1.balance_cdn)
    b1.withdraw(5.00)
    print(b1.account_number)
    print(b1.balance_cdn)

    print("---")

    print(b2.balance_cdn)
    b2.deposit(23.00)
    print(b2.member_last_name)
    print(b2.balance_cdn)

    print("---")

    b1.transfer(50.00, b2)
    print(b1.balance_cdn)
    print(b2.balance_cdn)

if __name__ == "__main__":
    main()
