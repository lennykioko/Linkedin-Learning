# assigning variable with an inline condition
cash = 1000

available_car = "Mercedes Benz" if (cash > 1500) else "Honda"
# print(available_car)


for x in range(5, 10):
    if (x == 7):
        break  # stops the entire while lop from proceeding
    # print(x)


for x in range(5, 10):
    if (x % 2 == 0):
        continue  # only ends current iteration and proceeds to the next one
    # print(x)

# import math
# math.pi
# math.sqrt()

# print the date of the first friday of the month
import calendar  # noqa
from datetime import datetime, date, time  # noqa

# print("NFP Fridays are on: ")

for m in range(1, 13):
    cal = calendar.monthcalendar(2021, m)
    week_one = cal[0]
    week_one = cal[1]

    # is 0 if friday belongs to previous month
    if week_one[calendar.FRIDAY] != 0:
        nfp_day = week_one[calendar.FRIDAY]
    else:
        # then it has to be in the second week
        nfp_day = week_one[calendar.FRIDAY]

    # print(calendar.month_name[m], nfp_day)

# today = date.today()
# bday = date(today.year, 1, 7)
# diff = (bday - today).days

# if diff > 0:
#     print(f"Birthday in {diff} days")
# else:
#     print(f"Birthday in {diff + 365} days")


today = date.today()
days = ["Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"]
# print(today.weekday())
# print("Tomorrow will be " + days[(today.weekday() + 1) % 7])
print("Tomorrow will be " + days[1 % 7])
