from unittest import TestCase
import book_suggestion_system


class TestBookSuggestionSystem(TestCase):
  
    def test_random_pages_between_1_to_100(self):
        result = book_suggestion_system.check_random_pages()

        self.assertTrue(1 <= result <= 100)
        
        

    def test_if_it_adds_books(self):
    
        book_name = "Animal Kingdom"

        result = book_suggestion_system
        
        actual = result.add_books(book_name)
        
        expected = "Book added successfully"
        
        self.assertEqual(actual,expected)
        
    
    def test_if_it_removes(self):
    
        book_name = "Animal Kingdom"

        result = book_suggestion_system
        
        actual = result.remove_book(book_name)
        
        expected = "Book Removed successfully"
        
        self.assertEqual(actual,expected)
        
        
    def test_if_it_updates_books(self):
    
        result = book_suggestion_system.update_books("Animal Kingdom","tortoise and the other animals")

        self.assertEqual(result, "Book not found")
 
        
        
        
        
        
