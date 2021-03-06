/*
 * Copyright 2020 Spikot project authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

@file:OptIn(ExperimentalContracts::class)

package kr.heartpattern.spikot.item

import kr.heartpattern.spikot.adapters.ItemStackAdapter
import kr.heartpattern.spikot.adapters.NBTAdapter
import kr.heartpattern.spikot.nbt.toCraftItemStack
import org.bukkit.Material
import org.bukkit.inventory.ItemStack
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

fun ItemStack?.isEmpty(): Boolean {
    contract { returns(false) implies (this@isEmpty != null) }
    return this == null || type == Material.AIR || amount == 0
}

fun ItemStack?.isNotEmpty(): Boolean {
    contract { returns(true) implies (this@isNotEmpty != null) }
    return !isEmpty()
}

fun ItemStack.encode(): ByteArray {
    return NBTAdapter.compressNBT(ItemStackAdapter.toNBTCompound(toCraftItemStack().itemStack))
}

fun decodeItemStack(bytes: ByteArray): ItemStack {
    return ItemStackAdapter.fromNBTCompound(NBTAdapter.decompressNBT(bytes))
}