records={
    "raju":3,
    "rana":2,
    "ashish":0,
    "shubham":0,
    "anish":5
}
records2={
    "D.S.":5,
    "O.O.P.S.":2,
    "O.S.":0,
    "D.E.L.":3,
}
print(records)
print(records2)
avg=sum(records.values())/len(records)
print("Average No. of Books borrowed by All members =",avg)
maximum=max(records2)
print("Books with Highest No. of borrowings =",maximum)
minimum=max(records2)
print("Books with Lowest No. of borrowings =",minimum)
zero=list(records.values()).count(0)
print("No. of members who borrowed 0 Books =",zero)
from collections import Counter;
non_zero=[val for val in records.values() if val>0]
freq=Counter(records2)
most=freq.most_common(1)[0][0]
print("Most Frequently borrowed Book =",most)