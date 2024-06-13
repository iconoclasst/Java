# numero romano 

s = {'I' : 1,
    'V' : 5,
    'X' : 10,
    'L' : 50,
    'C' : 100, 
    'D' : 500,
    'M' : 1000}

value = input("Numero romano: ")

#entrada = I X L V
#value : [0, 1, 2, 3]

sum = 0

for i in range(len(value)):
    
    if i + 1 < len(value) and s[value[i]] < s[value[i + 1]]:
        sum -= s[value[i]]
    else:
        sum += s[value[i]]

print(sum)
