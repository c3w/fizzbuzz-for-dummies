#!/usr/bin/env python

import sys

def palendrome(word):
  #size of word count down
  #count up to size of word
  _list=list(word)
  _size=len(word)
  c=0
  s=_size-1

#  print(c, s, _list, _list[s])
#  return 0

  while c < s:
#    print _list[c], _list[s]
    if _list[c] == _list[s]:
      c=c+1
      s=s-1
      #print c
    else:
      print("not a palendrome")
      return False
  print("palendrome!")
  return True


  return 0

#palendrome("madamimadam")
palendrome(sys.argv[1])
