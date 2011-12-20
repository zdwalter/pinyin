#!/usr/bin/python

#usage: exec filename
import sys
import chardet

result = chardet.detect("".join(open(sys.argv[1]).readlines()))
if not result or not result['encoding']:
  print 'utf-8' # just guess
else:
  print result['encoding']
