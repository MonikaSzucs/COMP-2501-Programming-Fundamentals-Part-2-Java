class BankAccount:

    def __init__(self, balance_cdn, account_number, member_last_name):
        self.balance_cdn = balance_cdn
        self.account_number = account_number
        self.member_last_name = member_last_name

    def withdraw(self, amount_cdn):
        self.balance_cdn -= amount_cdn

    def deposit(self, amount_cdn):
        self.balance_cdn += amount_cdn

    def transfer(self, amount_cdn, recipient_account):
        recipient_account.deposit(amount_cdn)
        self.withdraw(amount_cdn)
