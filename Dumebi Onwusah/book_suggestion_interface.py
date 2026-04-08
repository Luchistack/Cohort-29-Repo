from book_suggestion_functions import *

def get_book_suggestion_menu():
    continue_main_loop = True
    while continue_main_loop:
        print(
            """
Book Suggestion Menu:
1. Get Suggestions
2. Add Book
3. Remove Book
4. Update Book
5. Show Books
0. Exit

Enter your choice: """, end="")

        main_menu_choice = int(input())
        match main_menu_choice:
            case 1:
                print("Book for the Day:")
                continue_suggesting = True
                while continue_suggesting:
                    print(suggest_random_book_with_random_page_number())
                    user_input = input("Do you want another suggestion? (yes/no): ")
                    if user_input.lower() != "yes":
                        continue_suggesting = False
            case 2:
                book_title = input("Enter the book title: ")
                print(add_book(book_title))
            case 3:
                book_title = input("Enter book title to remove: ")
                print(remove_book(book_title))
            case 4:
                old_title = input("Enter the old title : ")
                new_title = input("Enter the new title : ")
                print(update_book(old_title, new_title))
            case 5:
                print("All Books:")
                show_all_books()
            case 0:
                print("Exiting the program. Goodbye!")
                break
            case _:
                print("Invalid choice. Please try again.")


get_book_suggestion_menu()
