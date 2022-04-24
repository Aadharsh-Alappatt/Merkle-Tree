# Merkle-Tree
## INTRODUCTION:

Merkle tree, also known as hash tree is a data structure used for data verification and synchronization. It is a tree data structure where each non-leaf node is a hash of its child nodes. All the leaf nodes are at the same depth and are as far left as possible. It maintains data integrity and uses hash functions for this purpose.

Merkle tree is a fundamental part of blockchain technology. It is a mathematical data structure composed of hashes of different blocks of data, and which serves as a summary of all the transactions in a block. It also allows for efficient and secure verification of content in a large body of data. It also helps to verify the consistency and content of the data. Both Bitcoin and Ethereum use Merkle Trees structure. 

The concept of Merkle Tree is named after Ralph Merkle, who patented the idea in 1979. Fundamentally, it is a data structure tree in which every leaf node labelled with the hash of a data block, and the non-leaf node labelled with the cryptographic hash of the labels of its child nodes. The leaf nodes are the lowest node in the tree.

<br>

## ARCHITECTURE:<br>
### *HASH FUNCTION:*<br>

Hash function is a function that takes a set of inputs and maps them into a table or data structure. The output generated by hash function is unique for every input. This helps in fingerprinting of data. The hash functions vary from one application to another. A hash function maps an input to a fixed output and this output is called hash.



### <p align="center">**Merkle Tree Representation**</p>
<p align="center"><img src="https://user-images.githubusercontent.com/76039017/164988923-3c1d3f50-1829-443f-ad49-64e915fecd34.png" alt="drawing" lenght="500" width="450" class="centerImage"/></p><br>


Merkle trees are created by repeatedly calculating hashing pairs of nodes until there is only one hash left. This hash is called the Merkle Root, or the Root Hash. The Merkle Trees are constructed in a bottom-up approach. Every leaf node is a hash of transactional data, and the non-leaf node is a hash of its previous hashes. Merkle trees are in a binary tree, so it requires an even number of leaf nodes. If there is an odd number of transactions, the last hash will be duplicated once to create an even number of leaf nodes.<br>

### *STUCTURE OF THE NODE OF THE BINARY MERKLE TREE:*<br>

It contains four variables:<br>
*	It contains a key variable.<br>
*	It contains a value variable.<br>
*	It contains two links.<br>

<br>


