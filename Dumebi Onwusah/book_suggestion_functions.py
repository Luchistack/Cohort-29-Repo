import random

books_list = ["The Great Gatsby", "To Kill a Mockingbird", "Brave Kingdom", "The Mystery", "Animal Farm", "The Hobbit"]

def suggest_random_book_with_random_page_number():
    return "Book Title: " + random.choice(books_list) + "\nPage: " + str(random.randint(1, 100))


def does_book_exist(book_title):
    for book in books_list:
        if book.lower() == book_title.lower():
            return True
    return False

def add_book(book_title):
    if does_book_exist(book_title):
        return "Book already exists in the list."
    else:
        new_book = book_title
        books_list.append(new_book)
    return "Book added successfully!" 

def remove_book(book_title):
    if does_book_exist(book_title):
        for book in books_list:
            if book.lower() == book_title.lower():
                books_list.remove(book)
                return "Book removed successfully!"
    
    return "Book does not exist in the list."
    
def update_book(old_title, new_title):
    if does_book_exist(old_title):
        for book in books_list:
            if book.lower() == old_title.lower():
                index = books_list.index(book)
                books_list[index] = new_title
                return "Book updated successfully!"
    
    return "Book does not exist in the list."
    
def show_all_books():
    for index in range(len(books_list)):
        print(f"{index + 1}. {books_list[index]}")