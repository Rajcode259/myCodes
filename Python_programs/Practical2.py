n=int(input("Enter the no. of elements: "))
csid=[]
for i in range (n):
    user_in=int(input("Enter customer id:"))
    csid.append(user_in)
print(csid)
p=int(input("Enter the customer id to be searched:"))

def lne_sr(csid,p):
    for i in range (n):
        if p==csid[i]:
         a = print("Customer id is matched.")
        return a
    else: 
        print("id not found.")
        
lne_sr(csid,p)

def binarySearch(arr, targetVal):
  left = 0
  right = len(arr) - 1

  while left <= right:
    mid = (left + right) // 2

    if arr[mid] == targetVal:
      return mid

    if arr[mid] < targetVal:
      left = mid + 1
    else:
      right = mid - 1

  return -1

mylist = [1, 3, 5, 7, 9, 11, 13, 15, 17, 19]
x = int(input("Enter the the target value: "))

result = binarySearch(mylist, x)

if result != -1:
  print("Found at index", result)
else:
  print("Not found")