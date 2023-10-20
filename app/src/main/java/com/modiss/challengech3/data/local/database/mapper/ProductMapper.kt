package com.modiss.challengech3.data.local.database.mapper

import com.modiss.challengech3.data.local.database.entity.CartEntity
import com.modiss.challengech3.data.local.database.relation.CartProductRelation
import com.modiss.challengech3.model.Cart
import com.modiss.challengech3.model.CartProduct

fun CartEntity?.toCart() = Cart(
    id = this?.id ?: 0,
    productId = this?.productId ?: 0,
    itemQuantity = this?.itemQuantity ?: 0,
    itemNotes = this?.itemNotes.orEmpty()
)

fun Cart?.toCartEntity() = CartEntity(
    id = this?.id,
    productId = this?.productId ?: 0,
    itemQuantity = this?.itemQuantity ?: 0,
    itemNotes = this?.itemNotes.orEmpty()
)

fun List<CartEntity?>.toCartList() = this.map { it.toCart() }

fun CartProductRelation.toCartProduct() = CartProduct(
    cart = this.cart.toCart(),
    product = this.product.toProduct()
)

fun List<CartProductRelation>.toCartProductList() = this.map { it.toCartProduct() }