# Merkle-Tree
## INTRODUCTION:
<p align="justify">
Merkle tree, also known as hash tree is a data structure used for data verification and synchronization. It is a tree data structure where each non-leaf node is a hash of its child nodes. All the leaf nodes are at the same depth and are as far left as possible. It maintains data integrity and uses hash functions for this purpose.

Merkle tree is a fundamental part of blockchain technology. It is a mathematical data structure composed of hashes of different blocks of data, and which serves as a summary of all the transactions in a block. It also allows for efficient and secure verification of content in a large body of data. It also helps to verify the consistency and content of the data. Both Bitcoin and Ethereum use Merkle Trees structure. 

The concept of Merkle Tree is named after Ralph Merkle, who patented the idea in 1979. Fundamentally, it is a data structure tree in which every leaf node labelled with the hash of a data block, and the non-leaf node labelled with the cryptographic hash of the labels of its child nodes. The leaf nodes are the lowest node in the tree.
</p>
<br>

## ARCHITECTURE:
### *HASH FUNCTION:*
<p align="justify">
Hash function is a function that takes a set of inputs and maps them into a table or data structure. The output generated by hash function is unique for every input. This helps in fingerprinting of data. The hash functions vary from one application to another. A hash function maps an input to a fixed output and this output is called hash.
</p>


### <p align="center">**Merkle Tree Representation**</p>
<p align="center"><img src=https://user-images.githubusercontent.com/76039017/165520726-8b5b6fe7-34b0-47ff-b334-7b83e5319053.png alt="drawing" lenght="500" width="650" class="centerImage"/></p><br

<p align="justify">
Merkle trees are created by repeatedly calculating hashing pairs of nodes until there is only one hash left. This hash is called the Merkle Root, or the Root Hash. The Merkle Trees are constructed in a bottom-up approach. Every leaf node is a hash of transactional data, and the non-leaf node is a hash of its previous hashes. Merkle trees are in a binary tree, so it requires an even number of leaf nodes. If there is an odd number of transactions, the last hash will be duplicated once to create an even number of leaf nodes.<br><br>
</p>

### *STUCTURE OF THE NODE OF THE BINARY MERKLE TREE:*

It contains four variables:<br>
*	It contains a key variable.<br>
*	It contains a value variable.<br>
*	It contains two links.<br>

<br>

## ALGORITHM:
#### ***a) Find Function:***
1. We will take the tree and key as parameters.
2. If the tree is null then we will return null.
3. If the tree->key is equal to the key we will return the tree.
4. If the key is smaller than tree->key then we will return find(tree->left, key)
5. Else return find (tree->right, key)<br><br>

#### ***b)	Add Node Function:***
1. We will take key and value as parameters.
2. Take the hash(key) and store it in a variable called index.
3. Store (struct node*) arr[index]. Head in a pointer called tree of datatype node.
4. Create a new node with its key as key and value as value and both links as null.
5. If the tree is null then assign the new node to the head and increment the size by 1.
6. If the tree is not null then we will check if the key is already present in the tree using the find function.
7. If the key is already present in the tree then we will update the value.
8. If it is not present in the tree then we will use the insert function to insert the element.<br><br>


#### ***c)	Insert Function:***
1. It will take tree and item pointers of node data type as parameters.
2. If item->key is smaller than tree->key and tree->left is null then assign the item to tree->left.
3. If item->key is smaller than tree->key and tree->left is not null then call insert function with tree->left and item as parameters.
4. If item->key is greater than tree->key and tree->right is null then assign the item to tree->right.
5. If item->key is greater than tree->key and tree->right is not null then call insert function with tree->right and item as parameters.<br><br>


#### ***d)	Delete a Node Function:***
1. We will take a key as a parameter.
2. Take the hash(key) and store it in a variable called index.
3. store (struct node*) arr[index]. Head in a pointer called tree of datatype node.
4. If the tree is null then the key is not present.
5. If the tree is not null then we will check if the key is already present in the 	 tree using the find function.
6. If the find function returns null then the key is not present in the tree.
7. If it is not null then we will use the remove function to delete the element.<br><br>



#### ***e)	Remove Function:***
1. It will take tree and key as parameters.
2. If the tree is null then return null.
3. If the key is smaller than the tree->key then tree->left is equal to remove (tree->left, key) and return tree.
4. If the key is greater than the tree->key then tree->right is equal to remove (tree->right, key) and return tree.
5. Else if the tree->left is equal to null and the tree->right is equal to null then decrement the size and return tree->left.
6. Else if the tree->left is not equal to null and the tree->right is equal to null then decrement the size and return tree->left.
7. Else if tree->left is equal to null and tree->right is not equal to null then decrement the size and return tree->right.
8. Else assign tree->left to a pointer called left of data type node.
9. While left->right is not equal to null, left is equal to left->right.
10. tree->key is equal to left->key.
11. tree->value is equal to left->value.
12. tree->left is equal to remove(tree->left, tree->key).
13. Return tree.<br><br>

## APPLICATIONS OF MERKLE TREE:
* Apache Cassandra uses Merkle Trees to detect inconsistencies.<br>
* Git uses a merkle tree to store its data.<br>
*	Ethereum uses a Merkle Patricia Trie.<br>
*	It is a fundamental part of the blockchain.<br>

