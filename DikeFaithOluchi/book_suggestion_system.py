import random

books = ["The Hobbit", "The Mystery", "The Boy", "Home Alone", "Act", "The Wedding Bell", "Abaccus"]

def get_suggestion():

        book = random.choice(books)

        page = random.randint(1,300)

        return book, page

def add_book(new_book = None):

    if new_book is None:
    
        return "No book provided"

    books.append(new_book)

    return f"{new_book} added successfully"


def remove_book(book_to_remove = None):

    if book_to_remove is None:

        return "No book provided"

    if book_to_remove in books:
    
        books.remove(book_to_remove)

        return "Book removed successfully"

    else:

        return "Book not found"


def update_book(old_book, new_title):

    if old_book in books:

        index = books.index(old_book)

        books[index] = new_title

        return f"{old_book} as been updated to {new_title}"

    else:

        return "Book not found"


def show_all_books(): 

        return books



def exit_system():

    print("Thank you for using the book suggestion system")

    return "Exiting.....Goodbye!"



def main_menu():

    choices = {
         1: get_suggestion,
         2: add_book,
         3: remove_book,
         4: update_book,
         5: show_all_books,
         6: exit_system
              }

    print("\nWelcome to the Book Suggestion System!\n")


    while True:
        print("""\t     1. Get Suggestion
                 2. Add Book
                 3. Remove Book
                 4. Update Book
                 5. Show all Books
                 6. Exit
              """)

        try:
            choice = int(input("Enter operation: "))

            operation = choices.get(choice)
    
            if operation:
                operation()

            else:

                print("Invalid input, enter a vaild number")
        except ValueError:
            print("Invalid input, enter valid number")


if __name__ == "__main__":
    main_menu()
