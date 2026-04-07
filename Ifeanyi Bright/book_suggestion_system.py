import random

book_suggestion_list = ["Animal Kingdom ","Animal Farm","Tortoise and other animals","The Mystry Book","The Hobbit","Brave Kingdom"]
 

def check_random_pages():

    return random.randint(1,100)
    
    
def add_books(book):

    book_suggestion_list.append(book)
    
    return "Book added successfully"    
   
   
   
def remove_book(books):

    if books  in  book_suggestion_list:
    
        book_suggestion_list.remove(books)
        
        return "Book Removed successfully"
    return "Book Is Not In The Library"    
    
    
    
def update_books( old_title, new_title):

    if old_title in book_suggestion_list:
    
        index = book_suggestion_list.index(old_title)
        
        book_suggestion_list[index] = new_title
        
        return "Book Updated Successfully"
        
    return "Book not found"
    


def main():
    
    is_running = True

    while(is_running):
        application_sample = """
        
        APPLICATION SAMPLE
=======================================|        
Welcome to the Book Suggestion System!  |
        1: Get Suggestions             |
                                        |
        2:Add Books                    | 
                                        |
        3:Remove Books                 | 
                                        |
        4:Update Books                 | 
                                        |
        5:Show All Books               |
                                        |
        6:Exit                         |
________________________________________|        
        """
        


        print(application_sample)


        choose_options = int(input("Enter Operation :"))

        match choose_options:
        
            case 1:
            
                for books in book_suggestion_list:
                    
                    print("Book for the day :\n\t","Book Title :\n",books,"Page :", check_random_pages())
                    print()
            
    
            case 2:
            
                add_new_books =  input("Enter Book Title: ")

                print(add_books(add_new_books))
                
                
            case 3:
            
            
                remove_old_book  = input("Enter Book Title: ")
                
                print(remove_book(remove_old_book))
                
                
            case 4:
            
                    old_title = input("Enter The Old Title: ")
                    
                    new_title =  input("Enter The New Title: ")
                    
                    print(update_books(old_title,new_title))
             
             
            case 5:
            
                    
                print("All Books \n")
                
                for books in range(len(book_suggestion_list)):
                
                    print(f"{books + 1}. {book_suggestion_list[books]}\n")
                    
                    
            case 6:
            
                print("Exit _______------") 
                break
                
            case _:
            
                print("Invalid Input !! ❌️")           
                    
main()





