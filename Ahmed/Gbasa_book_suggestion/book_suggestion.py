

import random

books = ["The Hobbit", "The Mystery", "Brave Kingdom", "Animal Farm"]


def suggest_book():
  if not books:

        return None  

  page = random.randint(1, 100)
  return page




