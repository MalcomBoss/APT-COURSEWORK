def my_function():
    local_var = "I am inside"
    print(local_var)

my_function()

# This next line will cause an error because local_var doesn't exist out here
# print(local_var)