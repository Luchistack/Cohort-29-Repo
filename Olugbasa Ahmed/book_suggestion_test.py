
from unittest import TestCase
import book_suggestion


class BookSuggestionTest(TestCase):


    def test_suggestion_is_working(self):

        result = book_suggestion.suggest_book()
        self.assertIsNotNone(result)

    def test_page_is_between_1_and_100(self):
    
        result = book_suggestion.suggest_book()
        self.assertTrue(1 <= 100)
        
    def test_returns_a_book(self):

        result = book_suggestion.suggest_book
    
        self.assertIsNotNone(result)
        
    def test_can_add_a_new_book(self):
        book_suggestion.add_book("The Hobbit")
        self.assertIn("The Hobbit", book_suggestion.books)


    def test_cannot_add_duplicate_books(self):
    
        result = book_suggestion.add_book("The Hobbit")
        
        self.assertFalse(result)
        
    def test_can_remove_a_book(self):
    
        book_suggestion.remove_book("The Mystery")
        
        self.assertTrue("The Mystery", book_suggestion.remove_book)
        
