def remove_odd_numbers(numbers):

    return numbers % 2 != 0
    
    
numbers = [1,2,3,4,5,6,8,9]    

result = filter(remove_odd_numbers,numbers)



print(list(result))




def remove_empty_space(characters):


    return characters != ""
    
    
characters = ["boy","","check",""]


result = filter(remove_empty_space,characters)
print(list(result))    




def greater_numbers(numbers):

    return numbers > 10
    
    
numbers = [5,12,7,18,3,20]    

result = filter(greater_numbers,numbers)

print(list(result))

 


def greater(characters):

    return len(characters) > 4
    

characters = ["cat","elephant","dog","tiger","lion"]

result = filter(greater,characters)


print(list(result))



def multiply(numbers):

    return numbers * 3
    
numbers = [2,3,4,5,6,7]

result = map(multiply,numbers)

print(list(result))


    

    
