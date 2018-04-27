#
# @Krishnakanth_Yachareni
#
import os
from os import path
import shutil
import urllib.request
# value =2000
# def someFunction():
#	global value
#	print (value)

# print("WelCome Krishnakanth Yachareni") if 10>20 else print( "Bye.......!")


# days=["Mon","Tue","Wed","Thu","Fri","Sat","Sun"]
# f or i,d in enumerate(days):
#	print(i, d)

# for x in range(5,10):
#	print ("\n")

# from datetime import date
# from datetime import *;
# today=date.today()
# print(today)

# from os import path
# print(os.name)
# if path.exists("textfile.txt"):
#	src = path.realpath("textfile")
#	dest=src+".bak"
#	shutil.copy(src,dest)

def main():
	webUrl = urllib.request.urlopen("http://www.epam.com")
	print("Result code is "+ str(webUrl.getcode()))
	data = webUrl.read()
	print("EPAM Website Data "+ str(data))
if __name__ == '__main__':
	main()