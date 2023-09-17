# manx-kat
[![manxkat.png](https://i.postimg.cc/5NgJBYV1/manxkat.png)](https://postimg.cc/KR1CFYjs)

## What is Kattis?
[Kattis](https://open.kattis.com/) is a programming problem archive. Problems are categorised into easy, medium, and hard. In this repo you'll find all of the kata's I've completed using Java. You can find my kattis account here [alex redfearn](https://open.kattis.com/users/alex-redfearn).

## Completed Kata's (Java)
|Kata                                                                               |Difficulty     |Problem Report                           |Accepted|
|:----------------------------------------------------------------------------------|:--------------|:--------------------------------------- |:-------|
|[Jumbo Javelin](https://open.kattis.com/problems/jumbojavelin)                     |Easy           |[Jumbo Javelin](#jumbo-javelin)          |✅|
|[Carrots](https://open.kattis.com/problems/carrots)                                |Easy           |[Carrots](#carrots)                      |✅|
|[Coldputer Science](https://open.kattis.com/problems/cold)                         |Easy           |[Coldputer Science](#coldputer-science)  |✅|
|[Birthday Memorization](https://open.kattis.com/problems/fodelsedagsmemorisering)  |Easy           |[Birthday Memorization](#birthday-memorization)|✅|
|[Compact Disc](https://open.kattis.com/problems/cd)                                |Medium         |[Compact Disc](#compact-disc)            |✅|
|[Teque](https://open.kattis.com/problems/teque)                                    |Medium         |[Teque](#teque)                          |✅|

## Problem Report

### Jumbo Javelin
Super easy, the first kata I solved, was just a simple loop and concatenation.

### Carrots
Super easy but not a very fun one.

### Coldputer Science
Loop to count negative numbers, kinda fun.

### Birthday Memorization
A slightly more involved easy one. The task was to store friend's birthdays in a calendar. I used a map for this, birthday as the key. If two friends had the same birthday then the friend rating was used to decide which birthday to store. I had fun writing two simple functional interfaces that implement Comparator and could be passed to a lambda expression e.g. stream().sorted(Comparator).

### Compact Disc
The first time I learnt that java.util.Scanner is too slow for io operations, started using java.io.BufferedReader. The challenge was to output the number of duplicate values in two lists. Extracted the two sequences into two sets and then used java.util.set.retainAll().

### Teque
Tough challenge but really enjoyable, learnt a lot. Create a triple-ended queue, like a deque but with add middle, with a performance constraint. Started by using one List, on add middle, split the list, add the value, join them back together again. Too slow! Next approach, use two Deques. On add middle, add the value to the start of the second Deque. Quicker but still too slow! The Deque type in Java has no get(index) method?! You have to traverse the list. Two Lists instead then so I could use List.get(index), still too slow! Lookup in a List is significantly slower than lookup in a Map. Modified my approach to use two Maps, and tracked the head and tail of each Map so I could add to the front and back. This solution was accepted with 0.62 seconds to spare.

After brushing up on data structures... Lists suffer from a major drawback, removing/inserting elements from/to the middle is expensive as the list must be traversed and items moved back. Maps are obviously quicker because they're unordered. The best structure to use probably would have been a linked list which solves the problem of operations on the middle elements. Each element stores a reference to the element in front and behind. Only the surrounding elements would need to be updated.
