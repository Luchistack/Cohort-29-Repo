import random

books = ["The Hobbit", "The Mystery", "The Boy", "Home Alone", "Act", "The Wedding Bell", "Abaccus"]

def get_suggestion():

    while True:

        book = random.choice(books)

        page = random.randint(1,300)

        print(f"Book Title: {book}\nPage: {page}")

        another_suggestion = input("\nWould you like to get another suggestion?(yes/no): ")

        if another_suggestion == "yes":
            continue

        elif another_suggestion == "no":
            break
        
        else:
            print("\ninvalid input, try again\n")
            break


def add_book(new_book = None):

    if new_book is None:
    
        new_book = input("\nEnter Title of the book to add: ")

    books.append(new_book)

    print(f"{new_book} added successfully")






def remove_book(book_to_remove = None):

    if book_to_remove is None:

        book_to_remove = input("\nEnter Title of the book to remove: ")

    if book_to_remove in books:
    
        books.remove(book_to_remove)

        print("Book remove successfully")

    else:

        print("Book not found")



def update_book():

    old_book = input("Enter book to update: ")

    if old_book in books:

        new_title = input("Enter new title: ")

        index = books.index(old_book)

        books[index] = new_title

        print(f"{old_book} as been updated to {new_title}")

    else:

        print("Book not found")



def show_all_books():

    print("\nAll books in the system\n")

    for index, book in enumerate(books, start = 1):

        print(f"{index}. {book}")



def exit_system():

    print("Thank you for using the book suggestion system")

    print("Exiting.....Goodbye!")

    exit()



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
