

import random

books = ["The Hobbit", "The Mystery", "Brave Kingdom", "Animal Farm"]


def suggest_book():
  if not books:

        return None  

  page = random.randint(1, 100)
  return page
  
  
def add_book(title):

    if title in books:
    
        return False
    books.append(title)
    
    return True

    
def remove_book(title):

    if title in books:
    
        return True
        
    books.remove(title)
    
    return False
