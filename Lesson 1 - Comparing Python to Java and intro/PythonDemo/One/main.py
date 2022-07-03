from book import Book


def main():
    book1 = Book("harry Potter", 1997, 35.99, True, '1')
    book2 = Book("lord of the rings", 1954, 19.99, True, '2')

    print(book1.title.upper())
    print(book2.title)


if __name__=="__main__":
    main()