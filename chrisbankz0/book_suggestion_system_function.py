import random

book_list = [
    "To Kill a Mockingbird by Harper Lee",
    "1984 by George Orwell",
    "Pride and Prejudice by Jane Austen"
]

def get_book_suggestion(book_list):
    book = random.choice(book_list)
    page = random.randint(1, 100)
    return f"{book} {page}"

def add_book(book_list, book):
    if book in book_list:
        return False
    else:
        book_list.append(book)
        return True
    
def remove_book(book_list, book):
    if book in book_list:
        book_list.remove(book)
        return True
    else:
        return False
        
def update_book(book_list, old_book, new_book):
    if old_book in book_list:
        index = book_list.index(old_book)
        book_list[index] = new_book
        return True
    else:
        return False

def view_books(book_list):
    return book_list

