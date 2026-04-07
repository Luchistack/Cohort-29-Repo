

import random


list_of_book_suggestions = [
                            {"author": "Prophet Daniel", "book_title": "The Bel and The Dragon"},
                            {"author": "George Orwell", "book_title": "The Animal Farm"},
                            {"author": "A. H. Mohammed", "book_title": "The Last Days At Forcado High School"},
                            {"author": "Chimmamanda Ngozi Adichie", "book_title": "The Half of a yellow Sun"},
                            {"author": "Jeanne-Marie Leprince de Beaumont", "book_title": "Beauty and The Beast"},
                            {"author": "J.R.R. Tolkien", "book_title": "The Hobbit"},
                        ]


def the_random_pages():

    return random.randint(1, 100)


def add_books(author, book_title):
    book = {
        "author": author,
        "book_title": book_title,
    }

    list_of_book_suggestions.append(book)

    return "Book added successfully"


def remove_book(book_title):

    for book in list_of_book_suggestions:
        if book["book_title"].lower() == book_title.lower():
            list_of_book_suggestions.remove(book)
            return("Book Removed Successfully")

    return("Book Not Found")


def update_book():
    book_title = input("Enter Book You Want To Edit: ")

    for book in list_of_book_suggestions:
        if book["book_title"].lower() == book_title.lower():

            print("1. Edit Author")
            print("2. Edit Book Title")

            choice = input("Select option: ")

            if choice == "1":
                book["author"] = input("Enter The New Name: ")

            elif choice == "2":
                book["book_title"] = input("Enter The New Book Title: ")

            return("Book Updated Successfully")


    return("Book Not Found")


def book_suggestion_main_menu():

    while True:
        book_suggestion_app_main_menu = """
--- Welcome To Semicolon Book Suggestion App Main Menu ---

1. To Get Suggestion
2. To Add Book
3. To Remove Book
4. To Update Book
5. To Show All Books
6. To Exit
"""
        print(book_suggestion_app_main_menu)

        usersChoice = input("Select an option: ")

        match usersChoice:

            case "1":
                for book in list_of_book_suggestions:
                    print(f'Read: {book["book_title"]} (Starting From Page {the_random_pages()})')
                    # print()

            case "2":
                print(add_books(input("Enter Author Name:"), input("Enter Book Title: ")))

            case "3":
                print(remove_book(input("Enter Book Title To Remove: ")))

            case "4":
                print(update_book())

            case "5":
                print("Show All Books In The Library \n")

                for book in range(len(list_of_book_suggestions)):
                    print(f"{book + 1}. {list_of_book_suggestions[book]}\n")

            case "6":
                print("Thank You For Using Our App, Goodbye!!")
                break

            case _:
                print("Invalid Input!!")
                



book_suggestion_main_menu()

