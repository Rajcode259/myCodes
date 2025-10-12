# Member borrowing records
records = [3,2,0,1,5]

# Book borrowing records
records2 = {
    "D.S.": 5,
    "O.O.P.S.": 2,
    "O.S.": 1,
    "D.E.L.": 3,
}
print(records)
print(records2)

# Average number of books borrowed by all members
avg = sum(records) / len(records)
print("Average No. of Books borrowed by All members =", avg)

# Books with highest and lowest borrowings
maximum = max(records2, key=records2.get)
minimum = min(records2, key=records2.get)
print("Book with Highest No. of borrowings =", maximum, "(", records2[maximum], ")")
print("Book with Lowest No. of borrowings =", minimum, "(", records2[minimum], ")")

# Members who borrowed 0 books
zero = list(records).count(0)
print("No. of members who borrowed 0 Books =", zero)

# Most frequently borrowed book (mode)
from collections import Counter
borrow_counts = list(records2.values())
freq = Counter(borrow_counts)
most_common_count = freq.most_common(1)[0][0]

# Find all books with that most frequent borrow count
most_frequent_books = [book for book, count in records2.items() if count == most_common_count]
print("Most Frequently borrowed Book(s):", most_frequent_books)