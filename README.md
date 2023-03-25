# manx-kat
[![manxkat.png](https://i.postimg.cc/5NgJBYV1/manxkat.png)](https://postimg.cc/KR1CFYjs)

## What is Kattis?
[Kattis](https://open.kattis.com/) is a programming problem archive. Problems are categorised into easy, medium, and hard. In this repo you'll find all of the kata's I've completed using Java. You can find my kattis account here [alex redfearn](https://open.kattis.com/users/alex-redfearn).

## Completed Kata's (Java)
|Kata                                                               |Difficulty|Problem Report                         |Accepted|
| :-----------------------------------------------------------------| :------- |:--------------------------------------|:-------|
|[Jumbo Javelin](https://open.kattis.com/problems/jumbojavelin)     |Easy      |[Jumbo Javelin](#jumbo-javelin)        |✅|
|[Carrots](https://open.kattis.com/problems/carrots)                |Easy      |[Carrots](#carrots)                    |✅|
|[Coldputer Science](https://open.kattis.com/problems/cold)         |Easy      |[Coldputer Science](#coldputer-science)|✅|
|[Compact Disc](https://open.kattis.com/problems/cd)                |Medium    |[Compact Disc](#compact-disc)          |✅|
|[Teque](https://open.kattis.com/problems/teque)                    |Medium    |[Teque](#teque)                        |✅|

## Problem Report

### Jumbo Javelin
Super easy, first kata I solved, just a simple loop and concatenation.

### Carrots
Super easy, not a very fun one.

### Coldputer Science
Loop to count negative numbers, kinda fun.

### Compact Disc
The first time I learnt that java.util.Scanner is too slow for io operations, started using java.io.BufferedReader. The challenge was to output the number of duplicate values in two lists. Extracted the two sequences into two sets and then used java.util.set.retainAll().

### Teque
Tough challenge but really enjoyable, learnt alot. Create a triple ended queue, like a deque but with add middle, with a performance constraint. Started by using one List, on add middle, split the list, add the value, join them back together again. Too slow! Next approach, use two Deques. On add middle, add the value to the start of the second Deque. Quicker but still too slow! The Deque type in Java has no get(index) method?! You have to traverse the list. Two Lists instead then so I could use List.get(index), still too slow! After some reasearch I learnt that lookup in a List is significantly slower than lookup in a Map. Modified my approach to use two Maps, tracked the head and tail of each Map so I could add to the front and back. This solution was accepted with 0.62 seconds to spare.
