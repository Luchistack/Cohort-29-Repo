import unittest
import book_suggestion_system_function


class TestBookSuggestionSystem(unittest.TestCase):

	def test_that_get_book_suggestion_returns_a_valid_suggestion(self):
		pass
		
	def test_that_add_book_adds_a_book_to_the_list(self):
		book_list = ["Cohort 29 Lovers"]
		new_book = "The Mumu man"
		result = book_suggestion_system_function.add_book(book_list, new_book)
		self.assertEqual(result, True)

	def test_that_doesnt_add_book_adds_a_book_to_the_list(self):
		book_list = ["Cohort 29 Lovers", "The Mumu man"]
		new_book = "The Mumu man"
		result = book_suggestion_system_function.add_book(book_list, new_book)
		self.assertEqual(result, False)

	def test_that_remove_book_removes_a_book_from_the_list(self):
		book_list = ["Cohort 29 Lovers", "The Mumu man"]
		book_to_remove = "The Mumu man"
		result = book_suggestion_system_function.remove_book(book_list, book_to_remove)
		self.assertEqual(result, True)

	def test_that_remove_book_removes_a_book_from_the_list_again(self):
		book_list = ["Cohort 29 Lovers", "The Mumu man"]
		book_to_remove = "The Mumu man brother"
		result = book_suggestion_system_function.remove_book(book_list, book_to_remove)
		self.assertEqual(result, False)

	def test_that_update_book_updates_a_book_in_the_list(self):
		book_list = ["Cohort 29 Lovers", "The Mumu man"]
		old_book = "The Mumu man"
		new_book = "The Mumu man brother"
		result = book_suggestion_system_function.update_book(book_list, old_book, new_book)
		self.assertEqual(result, True)

	def test_that_update_book_updates_a_book_in_the_list_again(self):
		book_list = ["Cohort 29 Lovers", "The Mumu man"]
		old_book = "Cohort 29 Lovers"
		new_book = "Cohort 29 Lovers part 2"
		result = book_suggestion_system_function.update_book(book_list, old_book, new_book)
		self.assertEqual(result, True)

	def test_that_update_book_updates_a_book_in_the_list_again_now(self):
		book_list = ["Cohort 29 Lovers", "The Mumu man"]
		old_book = "Cohort 29"
		new_book = "Cohort 29 Lovers part 2"
		result = book_suggestion_system_function.update_book(book_list, old_book, new_book)
		self.assertEqual(result, False)
	
	def test_that_view_books_returns_the_book_list(self):
		book_list = ["Cohort 29 Lovers", "The Mumu man"]
		result = book_suggestion_system_function.view_books(book_list)	
		self.assertEqual(result, book_list)