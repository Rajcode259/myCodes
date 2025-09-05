n = int(input("Enter the number of elements :"))
csid = []
for i in range(n):
	user_input = int(input("Enter customer id : "))
	csid.append(user_input)
print(csid)

p = int(input("Enter a customer id to be searched :"))

def lnr_sr(csid, p):
	found = False
	for id in csid:
		if p == id:
			print("Customer id is matched")
			found = True
			break
	if not found:
		print("id not found")

lnr_sr(csid, p)

csid.sort()
print("Sorted list:", csid)

def binary_search(csid, target):
	low = 0
	high = len(csid) - 1
	while low <= high:
		mid = (low + high) // 2
		mid_value = csid[mid]
		if mid_value == target:
			return mid
		elif mid_value < target:
			low = mid + 1
		else:
			high = mid - 1
	return -1

target = int(input("\nEnter the number to search for: "))
result = binary_search(csid, target)
if result != -1:
	print(f"The number {target} is found at index {result}.")
else:
	print(f"The number {target} is not found in the list.")