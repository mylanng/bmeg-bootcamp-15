def countEvenNum (arr, size):
  count = 0
  for x in range (size):
    if (arr[x]%2==0):
      count += 1

  return count

n = 5
foo = [0,1,2,3,4]

m = 100
bar = [i for i in range(m)]


print("Number of even numbers in foo: ", countEvenNum(foo, n))
print("Number of even numbers in bar: ", countEvenNum(bar, m))
