class Book:
    """
    The attributes and behavors for all books go here
    """
    # constructor: code that is called automatically each time
    # a Book object is made
    def __init__(self, title, year_published, price_cad, fiction, version):
        self.title          = title
        self.year_published = year_published
        self.price_cad      = price_cad
        self.fiction        = fiction
        self.version        = version