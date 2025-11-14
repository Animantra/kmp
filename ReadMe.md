<h1>Report for Knuth-Morris-Pratt (KMP) algorithm


<h2>Implemention

- LPS array precomputes the length of the longest prefix. LPS precomputed for the pattern LPS allows to avoid unnecessary checks(pattern[0...i]).


<h2>Complexity

- Time complexity: O(N+M)

- Space complexity: O(M)(LPS array)

- N is length of the pattern, M is length of the text

<h2>Metrics

![dataset](/plot.png)

Number of comparisons grows with length of the text and pattern.
The reported times may not be entirely accurate due to CPU caching


<h2>Conclusion

The Knuth-Morris-Pratt (KMP) algorithm is an efficient string matching method that significantly reduces unnecessary comparisons by using the precomputed LPS array