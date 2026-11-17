package com.example.testingtesting123

import org.junit.Before
import org.junit.Test

class UniqueCollectionTest {

    lateinit var collection: UniqueCollection

    @Before
    fun setUp() {
        collection = UniqueCollection()
    }


    // TODO 1: Write a test to ensure items can be added to the collection
    @Test
    fun addAnItem() {
        val originalSize: Int = collection.size()
        collection.addItem(Item("item1"))
        val newSize: Int  = collection.size()
            assert(newSize == originalSize + 1 && collection.get(newSize -1) == Item(  "item1" ))
    }

    // TODO 2: Write a test to ensure that only unique items can be added to the collection
    // Uniqueness is determined by the Item.name property, which is set via the constructor
    @Test
    fun addUniqueItem() {
        val collectionSize = collection.size()

        collection.addItem(Item("Item1"))
        collection.addItem(Item("Item1"))

        assert(collection.get(0) == Item("item1") && collectionSize == 1)

    }

    // Test Driven Development (TDD) test - complete specified function so that this test passes
    @Test
    fun clearAllItems() {
        collection.addItem(Item("item1"))
        collection.addItem(Item("Item2"))

        val originalSize = collection.size()
        collection.clear()
        val newSize = collection.size()

        assert(originalSize == 2 && newSize == 0) {"Items not cleared"}
    }
}