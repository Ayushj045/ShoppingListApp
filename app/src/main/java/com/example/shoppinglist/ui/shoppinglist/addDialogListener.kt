package com.example.shoppinglist.ui.shoppinglist

import com.example.shoppinglist.data.db.entities.ShoppingItem

interface addDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}